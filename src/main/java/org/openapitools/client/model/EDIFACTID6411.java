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
 * Gets or Sets EDIFACT_ID_6411
 */
@JsonAdapter(EDIFACTID6411.Adapter.class)
public enum EDIFACTID6411 {
  
  _700("700"),
  
  _701("701"),
  
  _702("702"),
  
  _703("703"),
  
  _704("704"),
  
  A("A"),
  
  B("B"),
  
  BUS("BUS"),
  
  C("C"),
  
  DPL("DPL"),
  
  ECO("ECO"),
  
  FIR("FIR"),
  
  FR("FR"),
  
  G("G"),
  
  GLI("GLI"),
  
  GLL("GLL"),
  
  K("K"),
  
  L("L"),
  
  LR("LR"),
  
  LTR("LTR"),
  
  M("M"),
  
  MIN("MIN"),
  
  ONZ("ONZ"),
  
  OZA("OZA"),
  
  OZI("OZI"),
  
  P("P"),
  
  S("S");

  private String value;

  EDIFACTID6411(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EDIFACTID6411 fromValue(String value) {
    for (EDIFACTID6411 b : EDIFACTID6411.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EDIFACTID6411> {
    @Override
    public void write(final JsonWriter jsonWriter, final EDIFACTID6411 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EDIFACTID6411 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EDIFACTID6411.fromValue(value);
    }
  }
}

