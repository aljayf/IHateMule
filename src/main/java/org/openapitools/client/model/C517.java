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
import org.openapitools.client.model.EDIFACTID1131;
import org.openapitools.client.model.EDIFACTID3055;
import org.openapitools.client.model.EDIFACTID3225;

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
 * C517
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class C517 {
  public static final String SERIALIZED_NAME_PLACELOCATION_IDENTIFICATION01 = "PlacelocationIdentification_01";
  @SerializedName(SERIALIZED_NAME_PLACELOCATION_IDENTIFICATION01)
  private EDIFACTID3225 placelocationIdentification01;

  public static final String SERIALIZED_NAME_CODE_LIST_QUALIFIER02 = "CodeListQualifier_02";
  @SerializedName(SERIALIZED_NAME_CODE_LIST_QUALIFIER02)
  private EDIFACTID1131 codeListQualifier02;

  public static final String SERIALIZED_NAME_CODE_LIST_RESPONSIBLE_AGENCY03 = "CodeListResponsibleAgency_03";
  @SerializedName(SERIALIZED_NAME_CODE_LIST_RESPONSIBLE_AGENCY03)
  private EDIFACTID3055 codeListResponsibleAgency03;

  public static final String SERIALIZED_NAME_PLACELOCATION04 = "Placelocation_04";
  @SerializedName(SERIALIZED_NAME_PLACELOCATION04)
  private String placelocation04;

  public C517() {
  }

  public C517 placelocationIdentification01(EDIFACTID3225 placelocationIdentification01) {
    
    this.placelocationIdentification01 = placelocationIdentification01;
    return this;
  }

   /**
   * Get placelocationIdentification01
   * @return placelocationIdentification01
  **/
  @javax.annotation.Nonnull

  public EDIFACTID3225 getPlacelocationIdentification01() {
    return placelocationIdentification01;
  }


  public void setPlacelocationIdentification01(EDIFACTID3225 placelocationIdentification01) {
    this.placelocationIdentification01 = placelocationIdentification01;
  }


  public C517 codeListQualifier02(EDIFACTID1131 codeListQualifier02) {
    
    this.codeListQualifier02 = codeListQualifier02;
    return this;
  }

   /**
   * Get codeListQualifier02
   * @return codeListQualifier02
  **/
  @javax.annotation.Nullable

  public EDIFACTID1131 getCodeListQualifier02() {
    return codeListQualifier02;
  }


  public void setCodeListQualifier02(EDIFACTID1131 codeListQualifier02) {
    this.codeListQualifier02 = codeListQualifier02;
  }


  public C517 codeListResponsibleAgency03(EDIFACTID3055 codeListResponsibleAgency03) {
    
    this.codeListResponsibleAgency03 = codeListResponsibleAgency03;
    return this;
  }

   /**
   * Get codeListResponsibleAgency03
   * @return codeListResponsibleAgency03
  **/
  @javax.annotation.Nullable

  public EDIFACTID3055 getCodeListResponsibleAgency03() {
    return codeListResponsibleAgency03;
  }


  public void setCodeListResponsibleAgency03(EDIFACTID3055 codeListResponsibleAgency03) {
    this.codeListResponsibleAgency03 = codeListResponsibleAgency03;
  }


  public C517 placelocation04(String placelocation04) {
    
    this.placelocation04 = placelocation04;
    return this;
  }

   /**
   * Get placelocation04
   * @return placelocation04
  **/
  @javax.annotation.Nullable

  public String getPlacelocation04() {
    return placelocation04;
  }


  public void setPlacelocation04(String placelocation04) {
    this.placelocation04 = placelocation04;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    C517 C517 = (C517) o;
    return Objects.equals(this.placelocationIdentification01, C517.placelocationIdentification01) &&
        Objects.equals(this.codeListQualifier02, C517.codeListQualifier02) &&
        Objects.equals(this.codeListResponsibleAgency03, C517.codeListResponsibleAgency03) &&
        Objects.equals(this.placelocation04, C517.placelocation04);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placelocationIdentification01, codeListQualifier02, codeListResponsibleAgency03, placelocation04);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class C517 {\n");
    sb.append("    placelocationIdentification01: ").append(toIndentedString(placelocationIdentification01)).append("\n");
    sb.append("    codeListQualifier02: ").append(toIndentedString(codeListQualifier02)).append("\n");
    sb.append("    codeListResponsibleAgency03: ").append(toIndentedString(codeListResponsibleAgency03)).append("\n");
    sb.append("    placelocation04: ").append(toIndentedString(placelocation04)).append("\n");
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
    openapiFields.add("PlacelocationIdentification_01");
    openapiFields.add("CodeListQualifier_02");
    openapiFields.add("CodeListResponsibleAgency_03");
    openapiFields.add("Placelocation_04");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("PlacelocationIdentification_01");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to C517
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!C517.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in C517 is not found in the empty JSON string", C517.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!C517.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `C517` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : C517.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Placelocation_04") != null && !jsonObj.get("Placelocation_04").isJsonNull()) && !jsonObj.get("Placelocation_04").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Placelocation_04` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Placelocation_04").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!C517.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'C517' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<C517> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(C517.class));

       return (TypeAdapter<T>) new TypeAdapter<C517>() {
           @Override
           public void write(JsonWriter out, C517 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public C517 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of C517 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of C517
  * @throws IOException if the JSON string is invalid with respect to C517
  */
  public static C517 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, C517.class);
  }

 /**
  * Convert an instance of C517 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

