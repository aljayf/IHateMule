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
import org.openapitools.client.model.EDIFACTID9749;
import org.openapitools.client.model.EDIFACTID9750;

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
 * C660
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class C660 {
  public static final String SERIALIZED_NAME_OPTION01 = "Option_01";
  @SerializedName(SERIALIZED_NAME_OPTION01)
  private EDIFACTID9750 option01;

  public static final String SERIALIZED_NAME_ASSOCIATED_OPTION_INFORMATION02 = "AssociatedOptionInformation_02";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_OPTION_INFORMATION02)
  private EDIFACTID9749 associatedOptionInformation02;

  public C660() {
  }

  public C660 option01(EDIFACTID9750 option01) {
    
    this.option01 = option01;
    return this;
  }

   /**
   * Get option01
   * @return option01
  **/
  @javax.annotation.Nonnull

  public EDIFACTID9750 getOption01() {
    return option01;
  }


  public void setOption01(EDIFACTID9750 option01) {
    this.option01 = option01;
  }


  public C660 associatedOptionInformation02(EDIFACTID9749 associatedOptionInformation02) {
    
    this.associatedOptionInformation02 = associatedOptionInformation02;
    return this;
  }

   /**
   * Get associatedOptionInformation02
   * @return associatedOptionInformation02
  **/
  @javax.annotation.Nullable

  public EDIFACTID9749 getAssociatedOptionInformation02() {
    return associatedOptionInformation02;
  }


  public void setAssociatedOptionInformation02(EDIFACTID9749 associatedOptionInformation02) {
    this.associatedOptionInformation02 = associatedOptionInformation02;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C660 C660 = (C660) o;
    return Objects.equals(this.option01, C660.option01) &&
        Objects.equals(this.associatedOptionInformation02, C660.associatedOptionInformation02);
  }

  @Override
  public int hashCode() {
    return Objects.hash(option01, associatedOptionInformation02);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C660 {\n");
    sb.append("    option01: ").append(toIndentedString(option01)).append("\n");
    sb.append("    associatedOptionInformation02: ").append(toIndentedString(associatedOptionInformation02)).append("\n");
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
    openapiFields.add("Option_01");
    openapiFields.add("AssociatedOptionInformation_02");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Option_01");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to C660
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!C660.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in C660 is not found in the empty JSON string", C660.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!C660.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `C660` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : C660.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!C660.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'C660' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<C660> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(C660.class));

       return (TypeAdapter<T>) new TypeAdapter<C660>() {
           @Override
           public void write(JsonWriter out, C660 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public C660 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of C660 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of C660
  * @throws IOException if the JSON string is invalid with respect to C660
  */
  public static C660 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, C660.class);
  }

 /**
  * Convert an instance of C660 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

