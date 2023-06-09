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
import org.openapitools.client.model.C656;

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
 * STX
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class STX {
  public static final String SERIALIZED_NAME_C65601 = "C656_01";
  @SerializedName(SERIALIZED_NAME_C65601)
  private C656 C656_01;

  public static final String SERIALIZED_NAME_C65602 = "C656_02";
  @SerializedName(SERIALIZED_NAME_C65602)
  private List<C656> C656_02;

  public STX() {
  }

  public STX C656_01(C656 C656_01) {
    
    this.C656_01 = C656_01;
    return this;
  }

   /**
   * Get C656_01
   * @return C656_01
  **/
  @javax.annotation.Nonnull

  public C656 getC65601() {
    return C656_01;
  }


  public void setC65601(C656 C656_01) {
    this.C656_01 = C656_01;
  }


  public STX C656_02(List<C656> C656_02) {
    
    this.C656_02 = C656_02;
    return this;
  }

  public STX addC65602Item(C656 C656_02Item) {
    if (this.C656_02 == null) {
      this.C656_02 = new ArrayList<>();
    }
    this.C656_02.add(C656_02Item);
    return this;
  }

   /**
   * Get C656_02
   * @return C656_02
  **/
  @javax.annotation.Nullable

  public List<C656> getC65602() {
    return C656_02;
  }


  public void setC65602(List<C656> C656_02) {
    this.C656_02 = C656_02;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    STX STX = (STX) o;
    return Objects.equals(this.C656_01, STX.C656_01) &&
        Objects.equals(this.C656_02, STX.C656_02);
  }

  @Override
  public int hashCode() {
    return Objects.hash(C656_01, C656_02);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class STX {\n");
    sb.append("    C656_01: ").append(toIndentedString(C656_01)).append("\n");
    sb.append("    C656_02: ").append(toIndentedString(C656_02)).append("\n");
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
    openapiFields.add("C656_01");
    openapiFields.add("C656_02");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("C656_01");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to STX
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!STX.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in STX is not found in the empty JSON string", STX.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!STX.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `STX` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : STX.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `C656_01`
      C656.validateJsonObject(jsonObj.getAsJsonObject("C656_01"));
      if (jsonObj.get("C656_02") != null && !jsonObj.get("C656_02").isJsonNull()) {
        JsonArray jsonArrayC656_02 = jsonObj.getAsJsonArray("C656_02");
        if (jsonArrayC656_02 != null) {
          // ensure the json data is an array
          if (!jsonObj.get("C656_02").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `C656_02` to be an array in the JSON string but got `%s`", jsonObj.get("C656_02").toString()));
          }

          // validate the optional field `C656_02` (array)
          for (int i = 0; i < jsonArrayC656_02.size(); i++) {
            C656.validateJsonObject(jsonArrayC656_02.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!STX.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'STX' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<STX> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(STX.class));

       return (TypeAdapter<T>) new TypeAdapter<STX>() {
           @Override
           public void write(JsonWriter out, STX value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public STX read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of STX given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of STX
  * @throws IOException if the JSON string is invalid with respect to STX
  */
  public static STX fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, STX.class);
  }

 /**
  * Convert an instance of STX to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

