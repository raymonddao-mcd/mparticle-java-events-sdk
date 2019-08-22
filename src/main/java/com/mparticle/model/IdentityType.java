package com.mparticle.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Gets or Sets IdentityType
 */
@JsonAdapter(IdentityType.Adapter.class)
public enum IdentityType {
  
  OTHER("other"),
  
  CUSTOMER_ID("customer_id"),
  
  FACEBOOK("facebook"),
  
  TWITTER("twitter"),
  
  GOOGLE("google"),
  
  MICROSOFT("microsoft"),
  
  YAHOO("yahoo"),
  
  EMAIL("email"),
  
  ALIAS("alias"),
  
  FACEBOOK_CUSTOM_AUDIENCE_ID("facebook_custom_audience_id"),
  
  OTHER_ID_2("other_id_2"),
  
  OTHER_ID_3("other_id_3"),
  
  OTHER_ID_4("other_id_4");

  private String value;

  IdentityType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IdentityType fromValue(String value) {
    for (IdentityType b : IdentityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<IdentityType> {
    @Override
    public void write(final JsonWriter jsonWriter, final IdentityType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IdentityType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IdentityType.fromValue(value);
    }
  }
}

