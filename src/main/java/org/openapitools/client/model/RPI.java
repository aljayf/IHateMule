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
 * RPI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class RPI {
  public static final String SERIALIZED_NAME_QUANTITY01 = "Quantity_01";
  @SerializedName(SERIALIZED_NAME_QUANTITY01)
  private String quantity01;

  public static final String SERIALIZED_NAME_STATUS02 = "Status_02";
  @SerializedName(SERIALIZED_NAME_STATUS02)
  private List<String> status02;

  public RPI() {
  }

  public RPI quantity01(String quantity01) {
    
    this.quantity01 = quantity01;
    return this;
  }

   /**
   * Get quantity01
   * @return quantity01
  **/
  @javax.annotation.Nullable

  public String getQuantity01() {
    return quantity01;
  }


  public void setQuantity01(String quantity01) {
    this.quantity01 = quantity01;
  }


  public RPI status02(List<String> status02) {
    
    this.status02 = status02;
    return this;
  }

  public RPI addStatus02Item(String status02Item) {
    if (this.status02 == null) {
      this.status02 = new ArrayList<>();
    }
    this.status02.add(status02Item);
    return this;
  }

   /**
   * Get status02
   * @return status02
  **/
  @javax.annotation.Nullable

  public List<String> getStatus02() {
    return status02;
  }


  public void setStatus02(List<String> status02) {
    this.status02 = status02;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RPI RPI = (RPI) o;
    return Objects.equals(this.quantity01, RPI.quantity01) &&
        Objects.equals(this.status02, RPI.status02);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity01, status02);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RPI {\n");
    sb.append("    quantity01: ").append(toIndentedString(quantity01)).append("\n");
    sb.append("    status02: ").append(toIndentedString(status02)).append("\n");
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
    openapiFields.add("Quantity_01");
    openapiFields.add("Status_02");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RPI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RPI.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RPI is not found in the empty JSON string", RPI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RPI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RPI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Quantity_01") != null && !jsonObj.get("Quantity_01").isJsonNull()) && !jsonObj.get("Quantity_01").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Quantity_01` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Quantity_01").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Status_02") != null && !jsonObj.get("Status_02").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Status_02` to be an array in the JSON string but got `%s`", jsonObj.get("Status_02").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RPI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RPI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RPI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RPI.class));

       return (TypeAdapter<T>) new TypeAdapter<RPI>() {
           @Override
           public void write(JsonWriter out, RPI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RPI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RPI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RPI
  * @throws IOException if the JSON string is invalid with respect to RPI
  */
  public static RPI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RPI.class);
  }

 /**
  * Convert an instance of RPI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

