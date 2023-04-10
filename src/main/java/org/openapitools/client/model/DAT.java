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
import org.openapitools.client.model.C688;

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
 * DAT
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class DAT {
  public static final String SERIALIZED_NAME_C68801 = "C688_01";
  @SerializedName(SERIALIZED_NAME_C68801)
  private List<C688> C688_01;

  public DAT() {
  }

  public DAT C688_01(List<C688> C688_01) {
    
    this.C688_01 = C688_01;
    return this;
  }

  public DAT addC68801Item(C688 C688_01Item) {
    if (this.C688_01 == null) {
      this.C688_01 = new ArrayList<>();
    }
    this.C688_01.add(C688_01Item);
    return this;
  }

   /**
   * Get C688_01
   * @return C688_01
  **/
  @javax.annotation.Nullable

  public List<C688> getC68801() {
    return C688_01;
  }


  public void setC68801(List<C688> C688_01) {
    this.C688_01 = C688_01;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DAT DAT = (DAT) o;
    return Objects.equals(this.C688_01, DAT.C688_01);
  }

  @Override
  public int hashCode() {
    return Objects.hash(C688_01);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DAT {\n");
    sb.append("    C688_01: ").append(toIndentedString(C688_01)).append("\n");
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
    openapiFields.add("C688_01");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DAT
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DAT.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DAT is not found in the empty JSON string", DAT.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DAT.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DAT` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("C688_01") != null && !jsonObj.get("C688_01").isJsonNull()) {
        JsonArray jsonArrayC688_01 = jsonObj.getAsJsonArray("C688_01");
        if (jsonArrayC688_01 != null) {
          // ensure the json data is an array
          if (!jsonObj.get("C688_01").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `C688_01` to be an array in the JSON string but got `%s`", jsonObj.get("C688_01").toString()));
          }

          // validate the optional field `C688_01` (array)
          for (int i = 0; i < jsonArrayC688_01.size(); i++) {
            C688.validateJsonObject(jsonArrayC688_01.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DAT.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DAT' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DAT> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DAT.class));

       return (TypeAdapter<T>) new TypeAdapter<DAT>() {
           @Override
           public void write(JsonWriter out, DAT value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DAT read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DAT given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DAT
  * @throws IOException if the JSON string is invalid with respect to DAT
  */
  public static DAT fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DAT.class);
  }

 /**
  * Convert an instance of DAT to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
