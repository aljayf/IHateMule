/*
 * EdiNation API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets EDIFACT_ID_5007
 */
@JsonAdapter(EDIFACTID5007.Adapter.class)
public enum EDIFACTID5007 {
  
  _1("1"),
  
  _2("2"),
  
  _3("3"),
  
  _700("700"),
  
  _701("701"),
  
  _702("702"),
  
  _703("703"),
  
  _704("704"),
  
  _705("705"),
  
  _706("706");

  private String value;

  EDIFACTID5007(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EDIFACTID5007 fromValue(String value) {
    for (EDIFACTID5007 b : EDIFACTID5007.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EDIFACTID5007> {
    @Override
    public void write(final JsonWriter jsonWriter, final EDIFACTID5007 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EDIFACTID5007 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EDIFACTID5007.fromValue(value);
    }
  }
}

