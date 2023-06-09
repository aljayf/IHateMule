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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.C362;
import org.openapitools.client.model.C366;
import org.openapitools.client.model.C517;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * PRT
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class PRT {
  public static final String SERIALIZED_NAME_C51701 = "C517_01";
  @SerializedName(SERIALIZED_NAME_C51701)
  private C517 C517_01;

  public static final String SERIALIZED_NAME_C36202 = "C362_02";
  @SerializedName(SERIALIZED_NAME_C36202)
  private C362 C362_02;

  public static final String SERIALIZED_NAME_C36203 = "C362_03";
  @SerializedName(SERIALIZED_NAME_C36203)
  private C362 C362_03;

  public static final String SERIALIZED_NAME_C36604 = "C366_04";
  @SerializedName(SERIALIZED_NAME_C36604)
  private List<C366> C366_04;

  public PRT() {
  }

  public PRT C517_01(C517 C517_01) {
    
    this.C517_01 = C517_01;
    return this;
  }

   /**
   * Get C517_01
   * @return C517_01
  **/
  @javax.annotation.Nonnull

  public C517 getC51701() {
    return C517_01;
  }


  public void setC51701(C517 C517_01) {
    this.C517_01 = C517_01;
  }


  public PRT C362_02(C362 C362_02) {
    
    this.C362_02 = C362_02;
    return this;
  }

   /**
   * Get C362_02
   * @return C362_02
  **/
  @javax.annotation.Nullable

  public C362 getC36202() {
    return C362_02;
  }


  public void setC36202(C362 C362_02) {
    this.C362_02 = C362_02;
  }


  public PRT C362_03(C362 C362_03) {
    
    this.C362_03 = C362_03;
    return this;
  }

   /**
   * Get C362_03
   * @return C362_03
  **/
  @javax.annotation.Nullable

  public C362 getC36203() {
    return C362_03;
  }


  public void setC36203(C362 C362_03) {
    this.C362_03 = C362_03;
  }


  public PRT C366_04(List<C366> C366_04) {
    
    this.C366_04 = C366_04;
    return this;
  }

  public PRT addC36604Item(C366 C366_04Item) {
    if (this.C366_04 == null) {
      this.C366_04 = new ArrayList<>();
    }
    this.C366_04.add(C366_04Item);
    return this;
  }

   /**
   * Get C366_04
   * @return C366_04
  **/
  @javax.annotation.Nullable

  public List<C366> getC36604() {
    return C366_04;
  }


  public void setC36604(List<C366> C366_04) {
    this.C366_04 = C366_04;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PRT PRT = (PRT) o;
    return Objects.equals(this.C517_01, PRT.C517_01) &&
        Objects.equals(this.C362_02, PRT.C362_02) &&
        Objects.equals(this.C362_03, PRT.C362_03) &&
        Objects.equals(this.C366_04, PRT.C366_04);
  }

  @Override
  public int hashCode() {
    return Objects.hash(C517_01, C362_02, C362_03, C366_04);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PRT {\n");
    sb.append("    C517_01: ").append(toIndentedString(C517_01)).append("\n");
    sb.append("    C362_02: ").append(toIndentedString(C362_02)).append("\n");
    sb.append("    C362_03: ").append(toIndentedString(C362_03)).append("\n");
    sb.append("    C366_04: ").append(toIndentedString(C366_04)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("C517_01");
    openapiFields.add("C362_02");
    openapiFields.add("C362_03");
    openapiFields.add("C366_04");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("C517_01");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PRT
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PRT.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PRT is not found in the empty JSON string", PRT.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PRT.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PRT` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PRT.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `C517_01`
      C517.validateJsonObject(jsonObj.getAsJsonObject("C517_01"));
      // validate the optional field `C362_02`
      if (jsonObj.get("C362_02") != null && !jsonObj.get("C362_02").isJsonNull()) {
        C362.validateJsonObject(jsonObj.getAsJsonObject("C362_02"));
      }
      // validate the optional field `C362_03`
      if (jsonObj.get("C362_03") != null && !jsonObj.get("C362_03").isJsonNull()) {
        C362.validateJsonObject(jsonObj.getAsJsonObject("C362_03"));
      }
      if (jsonObj.get("C366_04") != null && !jsonObj.get("C366_04").isJsonNull()) {
        JsonArray jsonArrayC366_04 = jsonObj.getAsJsonArray("C366_04");
        if (jsonArrayC366_04 != null) {
          // ensure the json data is an array
          if (!jsonObj.get("C366_04").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `C366_04` to be an array in the JSON string but got `%s`", jsonObj.get("C366_04").toString()));
          }

          // validate the optional field `C366_04` (array)
          for (int i = 0; i < jsonArrayC366_04.size(); i++) {
            C366.validateJsonObject(jsonArrayC366_04.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PRT.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PRT' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PRT> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PRT.class));

       return (TypeAdapter<T>) new TypeAdapter<PRT>() {
           @Override
           public void write(JsonWriter out, PRT value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PRT read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PRT given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PRT
  * @throws IOException if the JSON string is invalid with respect to PRT
  */
  public static PRT fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PRT.class);
  }

 /**
  * Convert an instance of PRT to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

