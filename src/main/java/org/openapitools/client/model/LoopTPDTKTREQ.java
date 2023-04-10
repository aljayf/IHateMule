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
import org.openapitools.client.model.SPI;
import org.openapitools.client.model.TPD;

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
 * LoopTPDTKTREQ
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class LoopTPDTKTREQ {
  public static final String SERIALIZED_NAME_T_P_D = "TPD";
  @SerializedName(SERIALIZED_NAME_T_P_D)
  private TPD tpd;

  public static final String SERIALIZED_NAME_S_P_I = "SPI";
  @SerializedName(SERIALIZED_NAME_S_P_I)
  private List<SPI> SPI;

  public LoopTPDTKTREQ() {
  }

  public LoopTPDTKTREQ tpd(TPD tpd) {
    
    this.tpd = tpd;
    return this;
  }

   /**
   * Get tpd
   * @return tpd
  **/
  @javax.annotation.Nonnull

  public TPD getTPD() {
    return tpd;
  }


  public void setTPD(TPD tpd) {
    this.tpd = tpd;
  }


  public LoopTPDTKTREQ SPI(List<SPI> SPI) {
    
    this.SPI = SPI;
    return this;
  }

  public LoopTPDTKTREQ addSPIItem(SPI SPIItem) {
    if (this.SPI == null) {
      this.SPI = new ArrayList<>();
    }
    this.SPI.add(SPIItem);
    return this;
  }

   /**
   * Get SPI
   * @return SPI
  **/
  @javax.annotation.Nullable

  public List<SPI> getSPI() {
    return SPI;
  }


  public void setSPI(List<SPI> SPI) {
    this.SPI = SPI;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoopTPDTKTREQ loopTPDTKTREQ = (LoopTPDTKTREQ) o;
    return Objects.equals(this.tpd, loopTPDTKTREQ.tpd) &&
        Objects.equals(this.SPI, loopTPDTKTREQ.SPI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tpd, SPI);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoopTPDTKTREQ {\n");
    sb.append("    tpd: ").append(toIndentedString(tpd)).append("\n");
    sb.append("    SPI: ").append(toIndentedString(SPI)).append("\n");
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
    openapiFields.add("TPD");
    openapiFields.add("SPI");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("TPD");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LoopTPDTKTREQ
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LoopTPDTKTREQ.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoopTPDTKTREQ is not found in the empty JSON string", LoopTPDTKTREQ.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LoopTPDTKTREQ.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoopTPDTKTREQ` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LoopTPDTKTREQ.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `TPD`
      TPD.validateJsonObject(jsonObj.getAsJsonObject("TPD"));
      if (jsonObj.get("SPI") != null && !jsonObj.get("SPI").isJsonNull()) {
        JsonArray jsonArraySPI = jsonObj.getAsJsonArray("SPI");
        if (jsonArraySPI != null) {
          // ensure the json data is an array
          if (!jsonObj.get("SPI").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `SPI` to be an array in the JSON string but got `%s`", jsonObj.get("SPI").toString()));
          }

          // validate the optional field `SPI` (array)
          for (int i = 0; i < jsonArraySPI.size(); i++) {
            SPI.validateJsonObject(jsonArraySPI.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoopTPDTKTREQ.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoopTPDTKTREQ' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoopTPDTKTREQ> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoopTPDTKTREQ.class));

       return (TypeAdapter<T>) new TypeAdapter<LoopTPDTKTREQ>() {
           @Override
           public void write(JsonWriter out, LoopTPDTKTREQ value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoopTPDTKTREQ read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoopTPDTKTREQ given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoopTPDTKTREQ
  * @throws IOException if the JSON string is invalid with respect to LoopTPDTKTREQ
  */
  public static LoopTPDTKTREQ fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoopTPDTKTREQ.class);
  }

 /**
  * Convert an instance of LoopTPDTKTREQ to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
