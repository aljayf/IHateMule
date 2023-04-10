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
import org.openapitools.client.model.C358;
import org.openapitools.client.model.C674;
import org.openapitools.client.model.C675;

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
 * EBD
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class EBD {
  public static final String SERIALIZED_NAME_C67401 = "C674_01";
  @SerializedName(SERIALIZED_NAME_C67401)
  private C674 C674_01;

  public static final String SERIALIZED_NAME_C67502 = "C675_02";
  @SerializedName(SERIALIZED_NAME_C67502)
  private C675 C675_02;

  public static final String SERIALIZED_NAME_C67503 = "C675_03";
  @SerializedName(SERIALIZED_NAME_C67503)
  private C675 C675_03;

  public static final String SERIALIZED_NAME_C67504 = "C675_04";
  @SerializedName(SERIALIZED_NAME_C67504)
  private C675 C675_04;

  public static final String SERIALIZED_NAME_C35805 = "C358_05";
  @SerializedName(SERIALIZED_NAME_C35805)
  private List<C358> C358_05;

  public EBD() {
  }

  public EBD C674_01(C674 C674_01) {
    
    this.C674_01 = C674_01;
    return this;
  }

   /**
   * Get C674_01
   * @return C674_01
  **/
  @javax.annotation.Nullable

  public C674 getC67401() {
    return C674_01;
  }


  public void setC67401(C674 C674_01) {
    this.C674_01 = C674_01;
  }


  public EBD C675_02(C675 C675_02) {
    
    this.C675_02 = C675_02;
    return this;
  }

   /**
   * Get C675_02
   * @return C675_02
  **/
  @javax.annotation.Nullable

  public C675 getC67502() {
    return C675_02;
  }


  public void setC67502(C675 C675_02) {
    this.C675_02 = C675_02;
  }


  public EBD C675_03(C675 C675_03) {
    
    this.C675_03 = C675_03;
    return this;
  }

   /**
   * Get C675_03
   * @return C675_03
  **/
  @javax.annotation.Nullable

  public C675 getC67503() {
    return C675_03;
  }


  public void setC67503(C675 C675_03) {
    this.C675_03 = C675_03;
  }


  public EBD C675_04(C675 C675_04) {
    
    this.C675_04 = C675_04;
    return this;
  }

   /**
   * Get C675_04
   * @return C675_04
  **/
  @javax.annotation.Nullable

  public C675 getC67504() {
    return C675_04;
  }


  public void setC67504(C675 C675_04) {
    this.C675_04 = C675_04;
  }


  public EBD C358_05(List<C358> C358_05) {
    
    this.C358_05 = C358_05;
    return this;
  }

  public EBD addC35805Item(C358 C358_05Item) {
    if (this.C358_05 == null) {
      this.C358_05 = new ArrayList<>();
    }
    this.C358_05.add(C358_05Item);
    return this;
  }

   /**
   * Get C358_05
   * @return C358_05
  **/
  @javax.annotation.Nullable

  public List<C358> getC35805() {
    return C358_05;
  }


  public void setC35805(List<C358> C358_05) {
    this.C358_05 = C358_05;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EBD EBD = (EBD) o;
    return Objects.equals(this.C674_01, EBD.C674_01) &&
        Objects.equals(this.C675_02, EBD.C675_02) &&
        Objects.equals(this.C675_03, EBD.C675_03) &&
        Objects.equals(this.C675_04, EBD.C675_04) &&
        Objects.equals(this.C358_05, EBD.C358_05);
  }

  @Override
  public int hashCode() {
    return Objects.hash(C674_01, C675_02, C675_03, C675_04, C358_05);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EBD {\n");
    sb.append("    C674_01: ").append(toIndentedString(C674_01)).append("\n");
    sb.append("    C675_02: ").append(toIndentedString(C675_02)).append("\n");
    sb.append("    C675_03: ").append(toIndentedString(C675_03)).append("\n");
    sb.append("    C675_04: ").append(toIndentedString(C675_04)).append("\n");
    sb.append("    C358_05: ").append(toIndentedString(C358_05)).append("\n");
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
    openapiFields.add("C674_01");
    openapiFields.add("C675_02");
    openapiFields.add("C675_03");
    openapiFields.add("C675_04");
    openapiFields.add("C358_05");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EBD
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EBD.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EBD is not found in the empty JSON string", EBD.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EBD.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EBD` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `C674_01`
      if (jsonObj.get("C674_01") != null && !jsonObj.get("C674_01").isJsonNull()) {
        C674.validateJsonObject(jsonObj.getAsJsonObject("C674_01"));
      }
      // validate the optional field `C675_02`
      if (jsonObj.get("C675_02") != null && !jsonObj.get("C675_02").isJsonNull()) {
        C675.validateJsonObject(jsonObj.getAsJsonObject("C675_02"));
      }
      // validate the optional field `C675_03`
      if (jsonObj.get("C675_03") != null && !jsonObj.get("C675_03").isJsonNull()) {
        C675.validateJsonObject(jsonObj.getAsJsonObject("C675_03"));
      }
      // validate the optional field `C675_04`
      if (jsonObj.get("C675_04") != null && !jsonObj.get("C675_04").isJsonNull()) {
        C675.validateJsonObject(jsonObj.getAsJsonObject("C675_04"));
      }
      if (jsonObj.get("C358_05") != null && !jsonObj.get("C358_05").isJsonNull()) {
        JsonArray jsonArrayC358_05 = jsonObj.getAsJsonArray("C358_05");
        if (jsonArrayC358_05 != null) {
          // ensure the json data is an array
          if (!jsonObj.get("C358_05").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `C358_05` to be an array in the JSON string but got `%s`", jsonObj.get("C358_05").toString()));
          }

          // validate the optional field `C358_05` (array)
          for (int i = 0; i < jsonArrayC358_05.size(); i++) {
            C358.validateJsonObject(jsonArrayC358_05.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EBD.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EBD' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EBD> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EBD.class));

       return (TypeAdapter<T>) new TypeAdapter<EBD>() {
           @Override
           public void write(JsonWriter out, EBD value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EBD read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EBD given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EBD
  * @throws IOException if the JSON string is invalid with respect to EBD
  */
  public static EBD fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EBD.class);
  }

 /**
  * Convert an instance of EBD to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
