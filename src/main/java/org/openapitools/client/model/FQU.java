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
import org.openapitools.client.model.C646;
import org.openapitools.client.model.C647;
import org.openapitools.client.model.C648;
import org.openapitools.client.model.C662;
import org.openapitools.client.model.EDIFACTID8335;

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
 * FQU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class FQU {
  public static final String SERIALIZED_NAME_MOVEMENT_TYPE01 = "MovementType_01";
  @SerializedName(SERIALIZED_NAME_MOVEMENT_TYPE01)
  private EDIFACTID8335 movementType01;

  public static final String SERIALIZED_NAME_C64702 = "C647_02";
  @SerializedName(SERIALIZED_NAME_C64702)
  private C647 C647_02;

  public static final String SERIALIZED_NAME_C66203 = "C662_03";
  @SerializedName(SERIALIZED_NAME_C66203)
  private C662 C662_03;

  public static final String SERIALIZED_NAME_C64604 = "C646_04";
  @SerializedName(SERIALIZED_NAME_C64604)
  private C646 C646_04;

  public static final String SERIALIZED_NAME_C64805 = "C648_05";
  @SerializedName(SERIALIZED_NAME_C64805)
  private List<C648> C648_05;

  public FQU() {
  }

  public FQU movementType01(EDIFACTID8335 movementType01) {
    
    this.movementType01 = movementType01;
    return this;
  }

   /**
   * Get movementType01
   * @return movementType01
  **/
  @javax.annotation.Nullable

  public EDIFACTID8335 getMovementType01() {
    return movementType01;
  }


  public void setMovementType01(EDIFACTID8335 movementType01) {
    this.movementType01 = movementType01;
  }


  public FQU C647_02(C647 C647_02) {
    
    this.C647_02 = C647_02;
    return this;
  }

   /**
   * Get C647_02
   * @return C647_02
  **/
  @javax.annotation.Nullable

  public C647 getC64702() {
    return C647_02;
  }


  public void setC64702(C647 C647_02) {
    this.C647_02 = C647_02;
  }


  public FQU C662_03(C662 C662_03) {
    
    this.C662_03 = C662_03;
    return this;
  }

   /**
   * Get C662_03
   * @return C662_03
  **/
  @javax.annotation.Nullable

  public C662 getC66203() {
    return C662_03;
  }


  public void setC66203(C662 C662_03) {
    this.C662_03 = C662_03;
  }


  public FQU C646_04(C646 C646_04) {
    
    this.C646_04 = C646_04;
    return this;
  }

   /**
   * Get C646_04
   * @return C646_04
  **/
  @javax.annotation.Nullable

  public C646 getC64604() {
    return C646_04;
  }


  public void setC64604(C646 C646_04) {
    this.C646_04 = C646_04;
  }


  public FQU C648_05(List<C648> C648_05) {
    
    this.C648_05 = C648_05;
    return this;
  }

  public FQU addC64805Item(C648 C648_05Item) {
    if (this.C648_05 == null) {
      this.C648_05 = new ArrayList<>();
    }
    this.C648_05.add(C648_05Item);
    return this;
  }

   /**
   * Get C648_05
   * @return C648_05
  **/
  @javax.annotation.Nullable

  public List<C648> getC64805() {
    return C648_05;
  }


  public void setC64805(List<C648> C648_05) {
    this.C648_05 = C648_05;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FQU FQU = (FQU) o;
    return Objects.equals(this.movementType01, FQU.movementType01) &&
        Objects.equals(this.C647_02, FQU.C647_02) &&
        Objects.equals(this.C662_03, FQU.C662_03) &&
        Objects.equals(this.C646_04, FQU.C646_04) &&
        Objects.equals(this.C648_05, FQU.C648_05);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movementType01, C647_02, C662_03, C646_04, C648_05);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FQU {\n");
    sb.append("    movementType01: ").append(toIndentedString(movementType01)).append("\n");
    sb.append("    C647_02: ").append(toIndentedString(C647_02)).append("\n");
    sb.append("    C662_03: ").append(toIndentedString(C662_03)).append("\n");
    sb.append("    C646_04: ").append(toIndentedString(C646_04)).append("\n");
    sb.append("    C648_05: ").append(toIndentedString(C648_05)).append("\n");
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
    openapiFields.add("MovementType_01");
    openapiFields.add("C647_02");
    openapiFields.add("C662_03");
    openapiFields.add("C646_04");
    openapiFields.add("C648_05");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FQU
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FQU.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FQU is not found in the empty JSON string", FQU.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FQU.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FQU` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `C647_02`
      if (jsonObj.get("C647_02") != null && !jsonObj.get("C647_02").isJsonNull()) {
        C647.validateJsonObject(jsonObj.getAsJsonObject("C647_02"));
      }
      // validate the optional field `C662_03`
      if (jsonObj.get("C662_03") != null && !jsonObj.get("C662_03").isJsonNull()) {
        C662.validateJsonObject(jsonObj.getAsJsonObject("C662_03"));
      }
      // validate the optional field `C646_04`
      if (jsonObj.get("C646_04") != null && !jsonObj.get("C646_04").isJsonNull()) {
        C646.validateJsonObject(jsonObj.getAsJsonObject("C646_04"));
      }
      if (jsonObj.get("C648_05") != null && !jsonObj.get("C648_05").isJsonNull()) {
        JsonArray jsonArrayC648_05 = jsonObj.getAsJsonArray("C648_05");
        if (jsonArrayC648_05 != null) {
          // ensure the json data is an array
          if (!jsonObj.get("C648_05").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `C648_05` to be an array in the JSON string but got `%s`", jsonObj.get("C648_05").toString()));
          }

          // validate the optional field `C648_05` (array)
          for (int i = 0; i < jsonArrayC648_05.size(); i++) {
            C648.validateJsonObject(jsonArrayC648_05.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FQU.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FQU' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FQU> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FQU.class));

       return (TypeAdapter<T>) new TypeAdapter<FQU>() {
           @Override
           public void write(JsonWriter out, FQU value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FQU read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FQU given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FQU
  * @throws IOException if the JSON string is invalid with respect to FQU
  */
  public static FQU fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FQU.class);
  }

 /**
  * Convert an instance of FQU to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

