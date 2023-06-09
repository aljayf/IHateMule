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
import org.openapitools.client.model.EDIFACTID5237;

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
 * FCC
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class FCC {
  public static final String SERIALIZED_NAME_CHARGE_CATEGORY01 = "ChargeCategory_01";
  @SerializedName(SERIALIZED_NAME_CHARGE_CATEGORY01)
  private EDIFACTID5237 chargeCategory01;

  public static final String SERIALIZED_NAME_MONETARY_AMOUNT02 = "MonetaryAmount_02";
  @SerializedName(SERIALIZED_NAME_MONETARY_AMOUNT02)
  private String monetaryAmount02;

  public static final String SERIALIZED_NAME_PLACELOCATION_IDENTIFICATION03 = "PlacelocationIdentification_03";
  @SerializedName(SERIALIZED_NAME_PLACELOCATION_IDENTIFICATION03)
  private EDIFACTID3225 placelocationIdentification03;

  public static final String SERIALIZED_NAME_PLACELOCATION_IDENTIFICATION04 = "PlacelocationIdentification_04";
  @SerializedName(SERIALIZED_NAME_PLACELOCATION_IDENTIFICATION04)
  private EDIFACTID3225 placelocationIdentification04;

  public static final String SERIALIZED_NAME_PERCENTAGE05 = "Percentage_05";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE05)
  private String percentage05;

  public FCC() {
  }

  public FCC chargeCategory01(EDIFACTID5237 chargeCategory01) {
    
    this.chargeCategory01 = chargeCategory01;
    return this;
  }

   /**
   * Get chargeCategory01
   * @return chargeCategory01
  **/
  @javax.annotation.Nullable

  public EDIFACTID5237 getChargeCategory01() {
    return chargeCategory01;
  }


  public void setChargeCategory01(EDIFACTID5237 chargeCategory01) {
    this.chargeCategory01 = chargeCategory01;
  }


  public FCC monetaryAmount02(String monetaryAmount02) {
    
    this.monetaryAmount02 = monetaryAmount02;
    return this;
  }

   /**
   * Get monetaryAmount02
   * @return monetaryAmount02
  **/
  @javax.annotation.Nullable

  public String getMonetaryAmount02() {
    return monetaryAmount02;
  }


  public void setMonetaryAmount02(String monetaryAmount02) {
    this.monetaryAmount02 = monetaryAmount02;
  }


  public FCC placelocationIdentification03(EDIFACTID3225 placelocationIdentification03) {
    
    this.placelocationIdentification03 = placelocationIdentification03;
    return this;
  }

   /**
   * Get placelocationIdentification03
   * @return placelocationIdentification03
  **/
  @javax.annotation.Nullable

  public EDIFACTID3225 getPlacelocationIdentification03() {
    return placelocationIdentification03;
  }


  public void setPlacelocationIdentification03(EDIFACTID3225 placelocationIdentification03) {
    this.placelocationIdentification03 = placelocationIdentification03;
  }


  public FCC placelocationIdentification04(EDIFACTID3225 placelocationIdentification04) {
    
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


  public FCC percentage05(String percentage05) {
    
    this.percentage05 = percentage05;
    return this;
  }

   /**
   * Get percentage05
   * @return percentage05
  **/
  @javax.annotation.Nullable

  public String getPercentage05() {
    return percentage05;
  }


  public void setPercentage05(String percentage05) {
    this.percentage05 = percentage05;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FCC FCC = (FCC) o;
    return Objects.equals(this.chargeCategory01, FCC.chargeCategory01) &&
        Objects.equals(this.monetaryAmount02, FCC.monetaryAmount02) &&
        Objects.equals(this.placelocationIdentification03, FCC.placelocationIdentification03) &&
        Objects.equals(this.placelocationIdentification04, FCC.placelocationIdentification04) &&
        Objects.equals(this.percentage05, FCC.percentage05);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeCategory01, monetaryAmount02, placelocationIdentification03, placelocationIdentification04, percentage05);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FCC {\n");
    sb.append("    chargeCategory01: ").append(toIndentedString(chargeCategory01)).append("\n");
    sb.append("    monetaryAmount02: ").append(toIndentedString(monetaryAmount02)).append("\n");
    sb.append("    placelocationIdentification03: ").append(toIndentedString(placelocationIdentification03)).append("\n");
    sb.append("    placelocationIdentification04: ").append(toIndentedString(placelocationIdentification04)).append("\n");
    sb.append("    percentage05: ").append(toIndentedString(percentage05)).append("\n");
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
    openapiFields.add("ChargeCategory_01");
    openapiFields.add("MonetaryAmount_02");
    openapiFields.add("PlacelocationIdentification_03");
    openapiFields.add("PlacelocationIdentification_04");
    openapiFields.add("Percentage_05");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FCC
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FCC.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FCC is not found in the empty JSON string", FCC.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FCC.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FCC` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("MonetaryAmount_02") != null && !jsonObj.get("MonetaryAmount_02").isJsonNull()) && !jsonObj.get("MonetaryAmount_02").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MonetaryAmount_02` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MonetaryAmount_02").toString()));
      }
      if ((jsonObj.get("Percentage_05") != null && !jsonObj.get("Percentage_05").isJsonNull()) && !jsonObj.get("Percentage_05").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Percentage_05` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Percentage_05").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FCC.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FCC' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FCC> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FCC.class));

       return (TypeAdapter<T>) new TypeAdapter<FCC>() {
           @Override
           public void write(JsonWriter out, FCC value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FCC read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FCC given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FCC
  * @throws IOException if the JSON string is invalid with respect to FCC
  */
  public static FCC fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FCC.class);
  }

 /**
  * Convert an instance of FCC to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

