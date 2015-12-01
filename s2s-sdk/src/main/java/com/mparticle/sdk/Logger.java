package com.mparticle.sdk;

/**
 * Abstraction for logging messages.
 */
public interface Logger {
    enum Level {
        VERBOSE, DEBUG, ERROR
    }

    void print(Level level, String format, Object... args);

    void print(Level level, Throwable error, String format, Object... args);

    /**
     * A {@link Logger} implementation which does nothing.
     */
    Logger NONE = new Logger() {
        @Override
        public void print(Level level, String format, Object... args) {

        }

        @Override
        public void print(Level level, Throwable error, String format, Object... args) {

        }
    };
}
