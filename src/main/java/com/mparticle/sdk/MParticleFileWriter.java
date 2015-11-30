package com.mparticle.sdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mparticle.sdk.model.Batch;

import java.io.*;

/**
 * Simple File writer - specify a directory and this class will write incoming Batches to files in that directory.
 *
 * Callers should be sure to call close() when finished.
 *
 */
public class MParticleFileWriter implements Closeable {
    private final File directory;
    private final int maxFileSize;
    private final Logger logger;
    private File currentFile;
    BufferedOutputStream bout = null;
    private int currentSize;
    ObjectMapper mapper = new ObjectMapper();
    byte[] lineSeparator = System.lineSeparator().getBytes();
    public static final String TEMP_FILENAME = "mparticle-pending.tmp";

    public MParticleFileWriter(File directory, int maxFileSize, Logger logger) {
        this.directory = directory;
        this.maxFileSize = maxFileSize;
        this.logger = logger;
    }

    /**
     * Write the given batch to the directory of this MParticleFileWriter. This method
     * will synchronously write to the filesystem, creating new files as needed.
     *
     * @param batch
     */
    public void write(Batch batch) {
        try {
            byte[] bytes = (mapper.writeValueAsString(batch).toString()).getBytes();
            if (currentSize + bytes.length > maxFileSize) {
                close();
            }
            if (currentFile == null) {
                open();
            }
            bout.write(bytes);
            bout.write(lineSeparator);
            currentSize += (bytes.length + lineSeparator.length);
        } catch (IOException e) {
            logger.print(Logger.Level.ERROR, e, "Error while writing to file.");
        }
    }

    private void open() {
        currentSize = 0;
        currentFile = new File(directory, TEMP_FILENAME);
        try {
            bout = new BufferedOutputStream(new FileOutputStream(currentFile));
        } catch (FileNotFoundException e) {
            logger.print(Logger.Level.ERROR, e, "Error while opening file.");
        }
    }

    /**
     * Close the MParticleFileWriter, releasing the current file.
     *
     * @throws IOException
     */
    public void close() throws IOException {
        if (bout != null) {
            try {
                bout.close();
            } catch (Exception e) {
                logger.print(Logger.Level.ERROR, e, "Error while closing file.");
            } finally {
                bout = null;
            }

        }
        if (currentFile != null) {
            currentFile.renameTo(new File(directory, System.currentTimeMillis() + ".mp"));
            currentFile = null;
        }
        currentSize = 0;
    }

    public static Builder builder(File directory) {
        return new Builder(directory);
    }

    /**
     * API for creating an MParticleFileWriter
     */
    public static class Builder {

        private final File directory;
        private Logger logger = null;
        private int maxFileSize = 50 * 1024 * 1024; //50 megabytes

        Builder(File directory) {
            if (directory == null) {
                throw new NullPointerException("Must specify directory");
            }
            if (!directory.isDirectory()) {
                throw new IllegalArgumentException("File must be a directory");
            }
            this.directory = directory;
        }

        public Builder logger(Logger logger) {
            if (logger == null) {
                throw new NullPointerException("Null logger");
            }
            this.logger = logger;
            return this;
        }

        public Builder maxFileSize(int bytes) {
            if (bytes < 1024) {
                throw new IllegalArgumentException("File size must be at least 1024 bytes");
            }
            this.maxFileSize = bytes;
            return this;
        }

        public MParticleFileWriter build() {
            if (logger == null) {
                logger = Logger.NONE;
            }
            return new MParticleFileWriter(directory, maxFileSize, logger);
        }
    }
}
