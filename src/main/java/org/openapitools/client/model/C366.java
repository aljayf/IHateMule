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
 * C366
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class C366 {
  public static final String SERIALIZED_NAME_RELATED_PLACELOCATION_ONE_IDENTIFICATION01 = "RelatedPlacelocationOneIdentification_01";
  @SerializedName(SERIALIZED_NAME_RELATED_PLACELOCATION_ONE_IDENTIFICATION01)
  private String relatedPlacelocationOneIdentification01;

  public static final String SERIALIZED_NAME_RELATED_PLACELOCATION_ONE_IDENTIFICATION02 = "RelatedPlacelocationOneIdentification_02";
  @SerializedName(SERIALIZED_NAME_RELATED_PLACELOCATION_ONE_IDENTIFICATION02)
  private String relatedPlacelocationOneIdentification02;

  public C366() {
  }

  public C366 relatedPlacelocationOneIdentification01(String relatedPlacelocationOneIdentification01) {
    
    this.relatedPlacelocationOneIdentification01 = relatedPlacelocationOneIdentification01;
    return this;
  }

   /**
   * Get relatedPlacelocationOneIdentification01
   * @return relatedPlacelocationOneIdentification01
  **/
  @javax.annotation.Nullable

  public String getRelatedPlacelocationOneIdentification01() {
    return relatedPlacelocationOneIdentification01;
  }


  public void setRelatedPlacelocationOneIdentification01(String relatedPlacelocationOneIdentification01) {
    this.relatedPlacelocationOneIdentification01 = relatedPlacelocationOneIdentification01;
  }


  public C366 relatedPlacelocationOneIdentification02(String relatedPlacelocationOneIdentification02) {
    
    this.relatedPlacelocationOneIdentification02 = relatedPlacelocationOneIdentification02;
    return this;
  }

   /**
   * Get relatedPlacelocationOneIdentification02
   * @return relatedPlacelocationOneIdentification02
  **/
  @javax.annotation.Nullable

  public String getRelatedPlacelocationOneIdentification02() {
    return relatedPlacelocationOneIdentification02;
  }


  public void setRelatedPlacelocationOneIdentification02(String relatedPlacelocationOneIdentification02) {
    this.relatedPlacelocationOneIdentification02 = relatedPlacelocationOneIdentification02;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C366 C366 = (C366) o;
    return Objects.equals(this.relatedPlacelocationOneIdentification01, C366.relatedPlacelocationOneIdentification01) &&
        Objects.equals(this.relatedPlacelocationOneIdentification02, C366.relatedPlacelocationOneIdentification02);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relatedPlacelocationOneIdentification01, relatedPlacelocationOneIdentification02);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C366 {\n");
    sb.append("    relatedPlacelocationOneIdentification01: ").append(toIndentedString(relatedPlacelocationOneIdentification01)).append("\n");
    sb.append("    relatedPlacelocationOneIdentification02: ").append(toIndentedString(relatedPlacelocationOneIdentification02)).append("\n");
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
    openapiFields.add("RelatedPlacelocationOneIdentification_01");
    openapiFields.add("RelatedPlacelocationOneIdentification_02");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to C366
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!C366.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in C366 is not found in the empty JSON string", C366.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!C366.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `C366` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("RelatedPlacelocationOneIdentification_01") != null && !jsonObj.get("RelatedPlacelocationOneIdentification_01").isJsonNull()) && !jsonObj.get("RelatedPlacelocationOneIdentification_01").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RelatedPlacelocationOneIdentification_01` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RelatedPlacelocationOneIdentification_01").toString()));
      }
      if ((jsonObj.get("RelatedPlacelocationOneIdentification_02") != null && !jsonObj.get("RelatedPlacelocationOneIdentification_02").isJsonNull()) && !jsonObj.get("RelatedPlacelocationOneIdentification_02").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RelatedPlacelocationOneIdentification_02` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RelatedPlacelocationOneIdentification_02").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!C366.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'C366' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<C366> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(C366.class));

       return (TypeAdapter<T>) new TypeAdapter<C366>() {
           @Override
           public void write(JsonWriter out, C366 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public C366 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of C366 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of C366
  * @throws IOException if the JSON string is invalid with respect to C366
  */
  public static C366 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, C366.class);
  }

 /**
  * Convert an instance of C366 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

