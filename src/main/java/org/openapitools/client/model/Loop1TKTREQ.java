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
import org.openapitools.client.model.Loop2TKTREQ;
import org.openapitools.client.model.ORG;
import org.openapitools.client.model.TKT;

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
 * Loop1TKTREQ
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class Loop1TKTREQ {
  public static final String SERIALIZED_NAME_T_K_T = "TKT";
  @SerializedName(SERIALIZED_NAME_T_K_T)
  private TKT tkt;

  public static final String SERIALIZED_NAME_LOOP2 = "Loop2";
  @SerializedName(SERIALIZED_NAME_LOOP2)
  private List<Loop2TKTREQ> loop2;

  public static final String SERIALIZED_NAME_O_R_G = "ORG";
  @SerializedName(SERIALIZED_NAME_O_R_G)
  private ORG org;

  public Loop1TKTREQ() {
  }

  public Loop1TKTREQ tkt(TKT tkt) {
    
    this.tkt = tkt;
    return this;
  }

   /**
   * Get tkt
   * @return tkt
  **/
  @javax.annotation.Nonnull

  public TKT getTKT() {
    return tkt;
  }


  public void setTKT(TKT tkt) {
    this.tkt = tkt;
  }


  public Loop1TKTREQ loop2(List<Loop2TKTREQ> loop2) {
    
    this.loop2 = loop2;
    return this;
  }

  public Loop1TKTREQ addLoop2Item(Loop2TKTREQ loop2Item) {
    if (this.loop2 == null) {
      this.loop2 = new ArrayList<>();
    }
    this.loop2.add(loop2Item);
    return this;
  }

   /**
   * Get loop2
   * @return loop2
  **/
  @javax.annotation.Nullable

  public List<Loop2TKTREQ> getLoop2() {
    return loop2;
  }


  public void setLoop2(List<Loop2TKTREQ> loop2) {
    this.loop2 = loop2;
  }


  public Loop1TKTREQ org(ORG org) {
    
    this.org = org;
    return this;
  }

   /**
   * Get org
   * @return org
  **/
  @javax.annotation.Nullable

  public ORG getORG() {
    return org;
  }


  public void setORG(ORG org) {
    this.org = org;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Loop1TKTREQ loop1TKTREQ = (Loop1TKTREQ) o;
    return Objects.equals(this.tkt, loop1TKTREQ.tkt) &&
        Objects.equals(this.loop2, loop1TKTREQ.loop2) &&
        Objects.equals(this.org, loop1TKTREQ.org);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tkt, loop2, org);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Loop1TKTREQ {\n");
    sb.append("    tkt: ").append(toIndentedString(tkt)).append("\n");
    sb.append("    loop2: ").append(toIndentedString(loop2)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
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
    openapiFields.add("TKT");
    openapiFields.add("Loop2");
    openapiFields.add("ORG");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("TKT");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Loop1TKTREQ
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Loop1TKTREQ.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Loop1TKTREQ is not found in the empty JSON string", Loop1TKTREQ.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Loop1TKTREQ.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Loop1TKTREQ` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Loop1TKTREQ.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `TKT`
      TKT.validateJsonObject(jsonObj.getAsJsonObject("TKT"));
      if (jsonObj.get("Loop2") != null && !jsonObj.get("Loop2").isJsonNull()) {
        JsonArray jsonArrayloop2 = jsonObj.getAsJsonArray("Loop2");
        if (jsonArrayloop2 != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Loop2").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Loop2` to be an array in the JSON string but got `%s`", jsonObj.get("Loop2").toString()));
          }

          // validate the optional field `Loop2` (array)
          for (int i = 0; i < jsonArrayloop2.size(); i++) {
            Loop2TKTREQ.validateJsonObject(jsonArrayloop2.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `ORG`
      if (jsonObj.get("ORG") != null && !jsonObj.get("ORG").isJsonNull()) {
        ORG.validateJsonObject(jsonObj.getAsJsonObject("ORG"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Loop1TKTREQ.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Loop1TKTREQ' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Loop1TKTREQ> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Loop1TKTREQ.class));

       return (TypeAdapter<T>) new TypeAdapter<Loop1TKTREQ>() {
           @Override
           public void write(JsonWriter out, Loop1TKTREQ value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Loop1TKTREQ read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Loop1TKTREQ given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Loop1TKTREQ
  * @throws IOException if the JSON string is invalid with respect to Loop1TKTREQ
  */
  public static Loop1TKTREQ fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Loop1TKTREQ.class);
  }

 /**
  * Convert an instance of Loop1TKTREQ to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

