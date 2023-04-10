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
import org.openapitools.client.model.EDIFACTID9893;

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
 * C642
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class C642 {
  public static final String SERIALIZED_NAME_INHOUSE_IDENTIFICATION01 = "InhouseIdentification_01";
  @SerializedName(SERIALIZED_NAME_INHOUSE_IDENTIFICATION01)
  private String inhouseIdentification01;

  public static final String SERIALIZED_NAME_IDENTIFICATION_TYPE02 = "IdentificationType_02";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATION_TYPE02)
  private EDIFACTID9893 identificationType02;

  public static final String SERIALIZED_NAME_TRAVEL_AGENT_IDENTIFICATION_DETAILS03 = "TravelAgentIdentificationDetails_03";
  @SerializedName(SERIALIZED_NAME_TRAVEL_AGENT_IDENTIFICATION_DETAILS03)
  private String travelAgentIdentificationDetails03;

  public C642() {
  }

  public C642 inhouseIdentification01(String inhouseIdentification01) {
    
    this.inhouseIdentification01 = inhouseIdentification01;
    return this;
  }

   /**
   * Get inhouseIdentification01
   * @return inhouseIdentification01
  **/
  @javax.annotation.Nonnull

  public String getInhouseIdentification01() {
    return inhouseIdentification01;
  }


  public void setInhouseIdentification01(String inhouseIdentification01) {
    this.inhouseIdentification01 = inhouseIdentification01;
  }


  public C642 identificationType02(EDIFACTID9893 identificationType02) {
    
    this.identificationType02 = identificationType02;
    return this;
  }

   /**
   * Get identificationType02
   * @return identificationType02
  **/
  @javax.annotation.Nullable

  public EDIFACTID9893 getIdentificationType02() {
    return identificationType02;
  }


  public void setIdentificationType02(EDIFACTID9893 identificationType02) {
    this.identificationType02 = identificationType02;
  }


  public C642 travelAgentIdentificationDetails03(String travelAgentIdentificationDetails03) {
    
    this.travelAgentIdentificationDetails03 = travelAgentIdentificationDetails03;
    return this;
  }

   /**
   * Get travelAgentIdentificationDetails03
   * @return travelAgentIdentificationDetails03
  **/
  @javax.annotation.Nullable

  public String getTravelAgentIdentificationDetails03() {
    return travelAgentIdentificationDetails03;
  }


  public void setTravelAgentIdentificationDetails03(String travelAgentIdentificationDetails03) {
    this.travelAgentIdentificationDetails03 = travelAgentIdentificationDetails03;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C642 C642 = (C642) o;
    return Objects.equals(this.inhouseIdentification01, C642.inhouseIdentification01) &&
        Objects.equals(this.identificationType02, C642.identificationType02) &&
        Objects.equals(this.travelAgentIdentificationDetails03, C642.travelAgentIdentificationDetails03);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inhouseIdentification01, identificationType02, travelAgentIdentificationDetails03);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C642 {\n");
    sb.append("    inhouseIdentification01: ").append(toIndentedString(inhouseIdentification01)).append("\n");
    sb.append("    identificationType02: ").append(toIndentedString(identificationType02)).append("\n");
    sb.append("    travelAgentIdentificationDetails03: ").append(toIndentedString(travelAgentIdentificationDetails03)).append("\n");
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
    openapiFields.add("InhouseIdentification_01");
    openapiFields.add("IdentificationType_02");
    openapiFields.add("TravelAgentIdentificationDetails_03");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("InhouseIdentification_01");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to C642
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!C642.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in C642 is not found in the empty JSON string", C642.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!C642.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `C642` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : C642.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("InhouseIdentification_01").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `InhouseIdentification_01` to be a primitive type in the JSON string but got `%s`", jsonObj.get("InhouseIdentification_01").toString()));
      }
      if ((jsonObj.get("TravelAgentIdentificationDetails_03") != null && !jsonObj.get("TravelAgentIdentificationDetails_03").isJsonNull()) && !jsonObj.get("TravelAgentIdentificationDetails_03").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TravelAgentIdentificationDetails_03` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TravelAgentIdentificationDetails_03").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!C642.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'C642' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<C642> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(C642.class));

       return (TypeAdapter<T>) new TypeAdapter<C642>() {
           @Override
           public void write(JsonWriter out, C642 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public C642 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of C642 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of C642
  * @throws IOException if the JSON string is invalid with respect to C642
  */
  public static C642 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, C642.class);
  }

 /**
  * Convert an instance of C642 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
