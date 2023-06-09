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
import org.openapitools.client.model.C332;
import org.openapitools.client.model.C334;

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
 * SSR
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class SSR {
  public static final String SERIALIZED_NAME_C33401 = "C334_01";
  @SerializedName(SERIALIZED_NAME_C33401)
  private C334 C334_01;

  public static final String SERIALIZED_NAME_C33202 = "C332_02";
  @SerializedName(SERIALIZED_NAME_C33202)
  private List<C332> C332_02;

  public SSR() {
  }

  public SSR C334_01(C334 C334_01) {
    
    this.C334_01 = C334_01;
    return this;
  }

   /**
   * Get C334_01
   * @return C334_01
  **/
  @javax.annotation.Nonnull

  public C334 getC33401() {
    return C334_01;
  }


  public void setC33401(C334 C334_01) {
    this.C334_01 = C334_01;
  }


  public SSR C332_02(List<C332> C332_02) {
    
    this.C332_02 = C332_02;
    return this;
  }

  public SSR addC33202Item(C332 C332_02Item) {
    if (this.C332_02 == null) {
      this.C332_02 = new ArrayList<>();
    }
    this.C332_02.add(C332_02Item);
    return this;
  }

   /**
   * Get C332_02
   * @return C332_02
  **/
  @javax.annotation.Nullable

  public List<C332> getC33202() {
    return C332_02;
  }


  public void setC33202(List<C332> C332_02) {
    this.C332_02 = C332_02;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSR SSR = (SSR) o;
    return Objects.equals(this.C334_01, SSR.C334_01) &&
        Objects.equals(this.C332_02, SSR.C332_02);
  }

  @Override
  public int hashCode() {
    return Objects.hash(C334_01, C332_02);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSR {\n");
    sb.append("    C334_01: ").append(toIndentedString(C334_01)).append("\n");
    sb.append("    C332_02: ").append(toIndentedString(C332_02)).append("\n");
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
    openapiFields.add("C334_01");
    openapiFields.add("C332_02");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("C334_01");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SSR
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SSR.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SSR is not found in the empty JSON string", SSR.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SSR.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SSR` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SSR.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `C334_01`
      C334.validateJsonObject(jsonObj.getAsJsonObject("C334_01"));
      if (jsonObj.get("C332_02") != null && !jsonObj.get("C332_02").isJsonNull()) {
        JsonArray jsonArrayC332_02 = jsonObj.getAsJsonArray("C332_02");
        if (jsonArrayC332_02 != null) {
          // ensure the json data is an array
          if (!jsonObj.get("C332_02").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `C332_02` to be an array in the JSON string but got `%s`", jsonObj.get("C332_02").toString()));
          }

          // validate the optional field `C332_02` (array)
          for (int i = 0; i < jsonArrayC332_02.size(); i++) {
            C332.validateJsonObject(jsonArrayC332_02.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SSR.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SSR' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SSR> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SSR.class));

       return (TypeAdapter<T>) new TypeAdapter<SSR>() {
           @Override
           public void write(JsonWriter out, SSR value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SSR read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SSR given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SSR
  * @throws IOException if the JSON string is invalid with respect to SSR
  */
  public static SSR fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SSR.class);
  }

 /**
  * Convert an instance of SSR to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

