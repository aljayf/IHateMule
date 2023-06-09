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
import org.openapitools.client.model.EDIFACTID3225;
import org.openapitools.client.model.EDIFACTID5025;
import org.openapitools.client.model.EDIFACTID6345;

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
 * C663
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class C663 {
  public static final String SERIALIZED_NAME_MONETARY_AMOUNT_TYPE_QUALIFIER01 = "MonetaryAmountTypeQualifier_01";
  @SerializedName(SERIALIZED_NAME_MONETARY_AMOUNT_TYPE_QUALIFIER01)
  private EDIFACTID5025 monetaryAmountTypeQualifier01;

  public static final String SERIALIZED_NAME_ALLOWANCE_OR_CHARGE_NUMBER02 = "AllowanceOrChargeNumber_02";
  @SerializedName(SERIALIZED_NAME_ALLOWANCE_OR_CHARGE_NUMBER02)
  private String allowanceOrChargeNumber02;

  public static final String SERIALIZED_NAME_CURRENCY03 = "Currency_03";
  @SerializedName(SERIALIZED_NAME_CURRENCY03)
  private EDIFACTID6345 currency03;

  public static final String SERIALIZED_NAME_PLACELOCATION_IDENTIFICATION04 = "PlacelocationIdentification_04";
  @SerializedName(SERIALIZED_NAME_PLACELOCATION_IDENTIFICATION04)
  private EDIFACTID3225 placelocationIdentification04;

  public static final String SERIALIZED_NAME_PLACELOCATION_IDENTIFICATION05 = "PlacelocationIdentification_05";
  @SerializedName(SERIALIZED_NAME_PLACELOCATION_IDENTIFICATION05)
  private EDIFACTID3225 placelocationIdentification05;

  public C663() {
  }

  public C663 monetaryAmountTypeQualifier01(EDIFACTID5025 monetaryAmountTypeQualifier01) {
    
    this.monetaryAmountTypeQualifier01 = monetaryAmountTypeQualifier01;
    return this;
  }

   /**
   * Get monetaryAmountTypeQualifier01
   * @return monetaryAmountTypeQualifier01
  **/
  @javax.annotation.Nonnull

  public EDIFACTID5025 getMonetaryAmountTypeQualifier01() {
    return monetaryAmountTypeQualifier01;
  }


  public void setMonetaryAmountTypeQualifier01(EDIFACTID5025 monetaryAmountTypeQualifier01) {
    this.monetaryAmountTypeQualifier01 = monetaryAmountTypeQualifier01;
  }


  public C663 allowanceOrChargeNumber02(String allowanceOrChargeNumber02) {
    
    this.allowanceOrChargeNumber02 = allowanceOrChargeNumber02;
    return this;
  }

   /**
   * Get allowanceOrChargeNumber02
   * @return allowanceOrChargeNumber02
  **/
  @javax.annotation.Nullable

  public String getAllowanceOrChargeNumber02() {
    return allowanceOrChargeNumber02;
  }


  public void setAllowanceOrChargeNumber02(String allowanceOrChargeNumber02) {
    this.allowanceOrChargeNumber02 = allowanceOrChargeNumber02;
  }


  public C663 currency03(EDIFACTID6345 currency03) {
    
    this.currency03 = currency03;
    return this;
  }

   /**
   * Get currency03
   * @return currency03
  **/
  @javax.annotation.Nullable

  public EDIFACTID6345 getCurrency03() {
    return currency03;
  }


  public void setCurrency03(EDIFACTID6345 currency03) {
    this.currency03 = currency03;
  }


  public C663 placelocationIdentification04(EDIFACTID3225 placelocationIdentification04) {
    
    this.placelocationIdentification04 = placelocationIdentification04;
    return this;
  }

   /**
   * Get placelocationIdentification04
   * @return placelocationIdentification04
  **/
  @javax.annotation.Nullable

  public EDIFACTID3225 getPlacelocationIdentification04() {
    return placelocationIdentification04;
  }


  public void setPlacelocationIdentification04(EDIFACTID3225 placelocationIdentification04) {
    this.placelocationIdentification04 = placelocationIdentification04;
  }


  public C663 placelocationIdentification05(EDIFACTID3225 placelocationIdentification05) {
    
    this.placelocationIdentification05 = placelocationIdentification05;
    return this;
  }

   /**
   * Get placelocationIdentification05
   * @return placelocationIdentification05
  **/
  @javax.annotation.Nullable

  public EDIFACTID3225 getPlacelocationIdentification05() {
    return placelocationIdentification05;
  }


  public void setPlacelocationIdentification05(EDIFACTID3225 placelocationIdentification05) {
    this.placelocationIdentification05 = placelocationIdentification05;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C663 C663 = (C663) o;
    return Objects.equals(this.monetaryAmountTypeQualifier01, C663.monetaryAmountTypeQualifier01) &&
        Objects.equals(this.allowanceOrChargeNumber02, C663.allowanceOrChargeNumber02) &&
        Objects.equals(this.currency03, C663.currency03) &&
        Objects.equals(this.placelocationIdentification04, C663.placelocationIdentification04) &&
        Objects.equals(this.placelocationIdentification05, C663.placelocationIdentification05);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monetaryAmountTypeQualifier01, allowanceOrChargeNumber02, currency03, placelocationIdentification04, placelocationIdentification05);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C663 {\n");
    sb.append("    monetaryAmountTypeQualifier01: ").append(toIndentedString(monetaryAmountTypeQualifier01)).append("\n");
    sb.append("    allowanceOrChargeNumber02: ").append(toIndentedString(allowanceOrChargeNumber02)).append("\n");
    sb.append("    currency03: ").append(toIndentedString(currency03)).append("\n");
    sb.append("    placelocationIdentification04: ").append(toIndentedString(placelocationIdentification04)).append("\n");
    sb.append("    placelocationIdentification05: ").append(toIndentedString(placelocationIdentification05)).append("\n");
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
    openapiFields.add("MonetaryAmountTypeQualifier_01");
    openapiFields.add("AllowanceOrChargeNumber_02");
    openapiFields.add("Currency_03");
    openapiFields.add("PlacelocationIdentification_04");
    openapiFields.add("PlacelocationIdentification_05");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MonetaryAmountTypeQualifier_01");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to C663
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!C663.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in C663 is not found in the empty JSON string", C663.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!C663.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `C663` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : C663.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("AllowanceOrChargeNumber_02") != null && !jsonObj.get("AllowanceOrChargeNumber_02").isJsonNull()) && !jsonObj.get("AllowanceOrChargeNumber_02").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AllowanceOrChargeNumber_02` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AllowanceOrChargeNumber_02").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!C663.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'C663' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<C663> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(C663.class));

       return (TypeAdapter<T>) new TypeAdapter<C663>() {
           @Override
           public void write(JsonWriter out, C663 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public C663 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of C663 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of C663
  * @throws IOException if the JSON string is invalid with respect to C663
  */
  public static C663 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, C663.class);
  }

 /**
  * Convert an instance of C663 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

