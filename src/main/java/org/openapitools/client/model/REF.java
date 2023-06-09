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
import org.openapitools.client.model.C653;

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
 * REF
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class REF {
  public static final String SERIALIZED_NAME_C65301 = "C653_01";
  @SerializedName(SERIALIZED_NAME_C65301)
  private List<C653> C653_01;

  public REF() {
  }

  public REF C653_01(List<C653> C653_01) {
    
    this.C653_01 = C653_01;
    return this;
  }

  public REF addC65301Item(C653 C653_01Item) {
    if (this.C653_01 == null) {
      this.C653_01 = new ArrayList<>();
    }
    this.C653_01.add(C653_01Item);
    return this;
  }

   /**
   * Get C653_01
   * @return C653_01
  **/
  @javax.annotation.Nullable

  public List<C653> getC65301() {
    return C653_01;
  }


  public void setC65301(List<C653> C653_01) {
    this.C653_01 = C653_01;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    REF REF = (REF) o;
    return Objects.equals(this.C653_01, REF.C653_01);
  }

  @Override
  public int hashCode() {
    return Objects.hash(C653_01);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class REF {\n");
    sb.append("    C653_01: ").append(toIndentedString(C653_01)).append("\n");
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
    openapiFields.add("C653_01");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to REF
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!REF.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in REF is not found in the empty JSON string", REF.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!REF.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `REF` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("C653_01") != null && !jsonObj.get("C653_01").isJsonNull()) {
        JsonArray jsonArrayC653_01 = jsonObj.getAsJsonArray("C653_01");
        if (jsonArrayC653_01 != null) {
          // ensure the json data is an array
          if (!jsonObj.get("C653_01").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `C653_01` to be an array in the JSON string but got `%s`", jsonObj.get("C653_01").toString()));
          }

          // validate the optional field `C653_01` (array)
          for (int i = 0; i < jsonArrayC653_01.size(); i++) {
            C653.validateJsonObject(jsonArrayC653_01.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!REF.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'REF' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<REF> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(REF.class));

       return (TypeAdapter<T>) new TypeAdapter<REF>() {
           @Override
           public void write(JsonWriter out, REF value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public REF read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of REF given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of REF
  * @throws IOException if the JSON string is invalid with respect to REF
  */
  public static REF fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, REF.class);
  }

 /**
  * Convert an instance of REF to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

