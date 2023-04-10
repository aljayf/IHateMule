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
import org.openapitools.client.model.EDIFACTID3453;
import org.openapitools.client.model.EDIFACTID4405;
import org.openapitools.client.model.EDIFACTID4451;
import org.openapitools.client.model.EDIFACTID9906;
import org.openapitools.client.model.EDIFACTID9980;

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
 * C346
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class C346 {
  public static final String SERIALIZED_NAME_TEXT_SUBJECT_QUALIFIER01 = "TextSubjectQualifier_01";
  @SerializedName(SERIALIZED_NAME_TEXT_SUBJECT_QUALIFIER01)
  private EDIFACTID4451 textSubjectQualifier01;

  public static final String SERIALIZED_NAME_INFORMATION_TYPE02 = "InformationType_02";
  @SerializedName(SERIALIZED_NAME_INFORMATION_TYPE02)
  private EDIFACTID9980 informationType02;

  public static final String SERIALIZED_NAME_STATUS03 = "Status_03";
  @SerializedName(SERIALIZED_NAME_STATUS03)
  private EDIFACTID4405 status03;

  public static final String SERIALIZED_NAME_COMPANY_IDENTIFICATION04 = "CompanyIdentification_04";
  @SerializedName(SERIALIZED_NAME_COMPANY_IDENTIFICATION04)
  private EDIFACTID9906 companyIdentification04;

  public static final String SERIALIZED_NAME_LANGUAGE05 = "Language_05";
  @SerializedName(SERIALIZED_NAME_LANGUAGE05)
  private EDIFACTID3453 language05;

  public C346() {
  }

  public C346 textSubjectQualifier01(EDIFACTID4451 textSubjectQualifier01) {
    
    this.textSubjectQualifier01 = textSubjectQualifier01;
    return this;
  }

   /**
   * Get textSubjectQualifier01
   * @return textSubjectQualifier01
  **/
  @javax.annotation.Nonnull

  public EDIFACTID4451 getTextSubjectQualifier01() {
    return textSubjectQualifier01;
  }


  public void setTextSubjectQualifier01(EDIFACTID4451 textSubjectQualifier01) {
    this.textSubjectQualifier01 = textSubjectQualifier01;
  }


  public C346 informationType02(EDIFACTID9980 informationType02) {
    
    this.informationType02 = informationType02;
    return this;
  }

   /**
   * Get informationType02
   * @return informationType02
  **/
  @javax.annotation.Nullable

  public EDIFACTID9980 getInformationType02() {
    return informationType02;
  }


  public void setInformationType02(EDIFACTID9980 informationType02) {
    this.informationType02 = informationType02;
  }


  public C346 status03(EDIFACTID4405 status03) {
    
    this.status03 = status03;
    return this;
  }

   /**
   * Get status03
   * @return status03
  **/
  @javax.annotation.Nullable

  public EDIFACTID4405 getStatus03() {
    return status03;
  }


  public void setStatus03(EDIFACTID4405 status03) {
    this.status03 = status03;
  }


  public C346 companyIdentification04(EDIFACTID9906 companyIdentification04) {
    
    this.companyIdentification04 = companyIdentification04;
    return this;
  }

   /**
   * Get companyIdentification04
   * @return companyIdentification04
  **/
  @javax.annotation.Nullable

  public EDIFACTID9906 getCompanyIdentification04() {
    return companyIdentification04;
  }


  public void setCompanyIdentification04(EDIFACTID9906 companyIdentification04) {
    this.companyIdentification04 = companyIdentification04;
  }


  public C346 language05(EDIFACTID3453 language05) {
    
    this.language05 = language05;
    return this;
  }

   /**
   * Get language05
   * @return language05
  **/
  @javax.annotation.Nullable

  public EDIFACTID3453 getLanguage05() {
    return language05;
  }


  public void setLanguage05(EDIFACTID3453 language05) {
    this.language05 = language05;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C346 C346 = (C346) o;
    return Objects.equals(this.textSubjectQualifier01, C346.textSubjectQualifier01) &&
        Objects.equals(this.informationType02, C346.informationType02) &&
        Objects.equals(this.status03, C346.status03) &&
        Objects.equals(this.companyIdentification04, C346.companyIdentification04) &&
        Objects.equals(this.language05, C346.language05);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textSubjectQualifier01, informationType02, status03, companyIdentification04, language05);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C346 {\n");
    sb.append("    textSubjectQualifier01: ").append(toIndentedString(textSubjectQualifier01)).append("\n");
    sb.append("    informationType02: ").append(toIndentedString(informationType02)).append("\n");
    sb.append("    status03: ").append(toIndentedString(status03)).append("\n");
    sb.append("    companyIdentification04: ").append(toIndentedString(companyIdentification04)).append("\n");
    sb.append("    language05: ").append(toIndentedString(language05)).append("\n");
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
    openapiFields.add("TextSubjectQualifier_01");
    openapiFields.add("InformationType_02");
    openapiFields.add("Status_03");
    openapiFields.add("CompanyIdentification_04");
    openapiFields.add("Language_05");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("TextSubjectQualifier_01");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to C346
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!C346.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in C346 is not found in the empty JSON string", C346.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!C346.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `C346` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : C346.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!C346.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'C346' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<C346> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(C346.class));

       return (TypeAdapter<T>) new TypeAdapter<C346>() {
           @Override
           public void write(JsonWriter out, C346 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public C346 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of C346 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of C346
  * @throws IOException if the JSON string is invalid with respect to C346
  */
  public static C346 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, C346.class);
  }

 /**
  * Convert an instance of C346 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
