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
 * Gets or Sets EDIFACT_ID_1153
 */
@JsonAdapter(EDIFACTID1153.Adapter.class)
public enum EDIFACTID1153 {
  
  _1("1"),
  
  _2("2"),
  
  _3("3"),
  
  _4("4"),
  
  _5("5"),
  
  _6("6"),
  
  _7("7"),
  
  _700("700"),
  
  _701("701"),
  
  _702("702"),
  
  _703("703"),
  
  _704("704"),
  
  _705("705"),
  
  _706("706"),
  
  _707("707"),
  
  A("A"),
  
  B("B"),
  
  F("F"),
  
  H("H"),
  
  P("P"),
  
  S("S"),
  
  T("T"),
  
  XX("XX");

  private String value;

  EDIFACTID1153(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EDIFACTID1153 fromValue(String value) {
    for (EDIFACTID1153 b : EDIFACTID1153.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EDIFACTID1153> {
    @Override
    public void write(final JsonWriter jsonWriter, final EDIFACTID1153 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EDIFACTID1153 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EDIFACTID1153.fromValue(value);
    }
  }
}
