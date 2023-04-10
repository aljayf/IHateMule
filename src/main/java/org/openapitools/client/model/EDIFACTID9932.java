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
 * Gets or Sets EDIFACT_ID_9932
 */
@JsonAdapter(EDIFACTID9932.Adapter.class)
public enum EDIFACTID9932 {
  
  _1("1"),
  
  _10("10"),
  
  _11("11"),
  
  _12("12"),
  
  _13("13"),
  
  _14("14"),
  
  _15("15"),
  
  _16("16"),
  
  _17("17"),
  
  _18("18"),
  
  _2("2"),
  
  _3("3"),
  
  _4("4"),
  
  _5("5"),
  
  _6("6"),
  
  _7("7"),
  
  _700("700"),
  
  _701("701"),
  
  _8("8"),
  
  _9("9"),
  
  ABU("ABU"),
  
  AIR("AIR"),
  
  BAG("BAG"),
  
  BEL("BEL"),
  
  BUS("BUS"),
  
  CAT("CAT"),
  
  CHK("CHK"),
  
  CLN("CLN"),
  
  COU("COU"),
  
  CRW("CRW"),
  
  CUB("CUB"),
  
  FIR("FIR"),
  
  FUE("FUE"),
  
  GAN("GAN"),
  
  GTE("GTE"),
  
  ICE("ICE"),
  
  JET("JET"),
  
  LIT("LIT"),
  
  LND("LND"),
  
  LOU("LOU"),
  
  LUG("LUG"),
  
  PAR("PAR"),
  
  PIE("PIE"),
  
  POW("POW"),
  
  PUB("PUB"),
  
  SAT("SAT"),
  
  SHU("SHU"),
  
  STD("STD"),
  
  STF("STF"),
  
  TAN("TAN"),
  
  TER("TER"),
  
  TOW("TOW"),
  
  TWB("TWB"),
  
  WAS("WAS"),
  
  WAT("WAT");

  private String value;

  EDIFACTID9932(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EDIFACTID9932 fromValue(String value) {
    for (EDIFACTID9932 b : EDIFACTID9932.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EDIFACTID9932> {
    @Override
    public void write(final JsonWriter jsonWriter, final EDIFACTID9932 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EDIFACTID9932 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EDIFACTID9932.fromValue(value);
    }
  }
}
