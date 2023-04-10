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
import org.openapitools.client.model.ATI;
import org.openapitools.client.model.CRI;
import org.openapitools.client.model.EQN;
import org.openapitools.client.model.FAR;
import org.openapitools.client.model.FOP;
import org.openapitools.client.model.FQU;
import org.openapitools.client.model.FTI;
import org.openapitools.client.model.IFT;
import org.openapitools.client.model.Loop1TKTREQ;
import org.openapitools.client.model.Loop3TKTREQ;
import org.openapitools.client.model.MON;
import org.openapitools.client.model.MSG;
import org.openapitools.client.model.ODI;
import org.openapitools.client.model.ORG;
import org.openapitools.client.model.PTK;
import org.openapitools.client.model.RCI;
import org.openapitools.client.model.TAI;
import org.openapitools.client.model.TVL;
import org.openapitools.client.model.TXD;
import org.openapitools.client.model.UNH;
import org.openapitools.client.model.UNT;

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
 * TSTKTREQ
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-09T20:30:51.657048-10:00[Pacific/Honolulu]")
public class TSTKTREQ {
  public static final String SERIALIZED_NAME_MODEL = "Model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_U_N_H = "UNH";
  @SerializedName(SERIALIZED_NAME_U_N_H)
  private UNH unh;

  public static final String SERIALIZED_NAME_M_S_G = "MSG";
  @SerializedName(SERIALIZED_NAME_M_S_G)
  private MSG msg;

  public static final String SERIALIZED_NAME_O_R_G = "ORG";
  @SerializedName(SERIALIZED_NAME_O_R_G)
  private ORG org;

  public static final String SERIALIZED_NAME_T_A_I = "TAI";
  @SerializedName(SERIALIZED_NAME_T_A_I)
  private TAI tai;

  public static final String SERIALIZED_NAME_R_C_I = "RCI";
  @SerializedName(SERIALIZED_NAME_R_C_I)
  private RCI rci;

  public static final String SERIALIZED_NAME_M_O_N = "MON";
  @SerializedName(SERIALIZED_NAME_M_O_N)
  private MON mon;

  public static final String SERIALIZED_NAME_P_T_K = "PTK";
  @SerializedName(SERIALIZED_NAME_P_T_K)
  private PTK ptk;

  public static final String SERIALIZED_NAME_O_D_I = "ODI";
  @SerializedName(SERIALIZED_NAME_O_D_I)
  private ODI odi;

  public static final String SERIALIZED_NAME_T_V_L = "TVL";
  @SerializedName(SERIALIZED_NAME_T_V_L)
  private TVL tvl;

  public static final String SERIALIZED_NAME_F_O_P = "FOP";
  @SerializedName(SERIALIZED_NAME_F_O_P)
  private FOP fop;

  public static final String SERIALIZED_NAME_F_T_I = "FTI";
  @SerializedName(SERIALIZED_NAME_F_T_I)
  private FTI fti;

  public static final String SERIALIZED_NAME_A_T_I = "ATI";
  @SerializedName(SERIALIZED_NAME_A_T_I)
  private ATI ati;

  public static final String SERIALIZED_NAME_E_Q_N = "EQN";
  @SerializedName(SERIALIZED_NAME_E_Q_N)
  private EQN eqn;

  public static final String SERIALIZED_NAME_T_X_D = "TXD";
  @SerializedName(SERIALIZED_NAME_T_X_D)
  private List<TXD> TXD;

  public static final String SERIALIZED_NAME_I_F_T = "IFT";
  @SerializedName(SERIALIZED_NAME_I_F_T)
  private List<IFT> IFT;

  public static final String SERIALIZED_NAME_C_R_I = "CRI";
  @SerializedName(SERIALIZED_NAME_C_R_I)
  private CRI cri;

  public static final String SERIALIZED_NAME_F_A_R = "FAR";
  @SerializedName(SERIALIZED_NAME_F_A_R)
  private FAR far;

  public static final String SERIALIZED_NAME_F_Q_U = "FQU";
  @SerializedName(SERIALIZED_NAME_F_Q_U)
  private FQU fqu;

  public static final String SERIALIZED_NAME_LOOP1 = "Loop1";
  @SerializedName(SERIALIZED_NAME_LOOP1)
  private List<Loop1TKTREQ> loop1;

  public static final String SERIALIZED_NAME_LOOP3 = "Loop3";
  @SerializedName(SERIALIZED_NAME_LOOP3)
  private List<Loop3TKTREQ> loop3;

  public static final String SERIALIZED_NAME_U_N_T = "UNT";
  @SerializedName(SERIALIZED_NAME_U_N_T)
  private UNT unt;

  public TSTKTREQ() {
  }

  public TSTKTREQ model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nullable

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public TSTKTREQ unh(UNH unh) {
    
    this.unh = unh;
    return this;
  }

   /**
   * Get unh
   * @return unh
  **/
  @javax.annotation.Nonnull

  public UNH getUNH() {
    return unh;
  }


  public void setUNH(UNH unh) {
    this.unh = unh;
  }


  public TSTKTREQ msg(MSG msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @javax.annotation.Nonnull

  public MSG getMSG() {
    return msg;
  }


  public void setMSG(MSG msg) {
    this.msg = msg;
  }


  public TSTKTREQ org(ORG org) {
    
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


  public TSTKTREQ tai(TAI tai) {
    
    this.tai = tai;
    return this;
  }

   /**
   * Get tai
   * @return tai
  **/
  @javax.annotation.Nullable

  public TAI getTAI() {
    return tai;
  }


  public void setTAI(TAI tai) {
    this.tai = tai;
  }


  public TSTKTREQ rci(RCI rci) {
    
    this.rci = rci;
    return this;
  }

   /**
   * Get rci
   * @return rci
  **/
  @javax.annotation.Nullable

  public RCI getRCI() {
    return rci;
  }


  public void setRCI(RCI rci) {
    this.rci = rci;
  }


  public TSTKTREQ mon(MON mon) {
    
    this.mon = mon;
    return this;
  }

   /**
   * Get mon
   * @return mon
  **/
  @javax.annotation.Nullable

  public MON getMON() {
    return mon;
  }


  public void setMON(MON mon) {
    this.mon = mon;
  }


  public TSTKTREQ ptk(PTK ptk) {
    
    this.ptk = ptk;
    return this;
  }

   /**
   * Get ptk
   * @return ptk
  **/
  @javax.annotation.Nullable

  public PTK getPTK() {
    return ptk;
  }


  public void setPTK(PTK ptk) {
    this.ptk = ptk;
  }


  public TSTKTREQ odi(ODI odi) {
    
    this.odi = odi;
    return this;
  }

   /**
   * Get odi
   * @return odi
  **/
  @javax.annotation.Nullable

  public ODI getODI() {
    return odi;
  }


  public void setODI(ODI odi) {
    this.odi = odi;
  }


  public TSTKTREQ tvl(TVL tvl) {
    
    this.tvl = tvl;
    return this;
  }

   /**
   * Get tvl
   * @return tvl
  **/
  @javax.annotation.Nullable

  public TVL getTVL() {
    return tvl;
  }


  public void setTVL(TVL tvl) {
    this.tvl = tvl;
  }


  public TSTKTREQ fop(FOP fop) {
    
    this.fop = fop;
    return this;
  }

   /**
   * Get fop
   * @return fop
  **/
  @javax.annotation.Nullable

  public FOP getFOP() {
    return fop;
  }


  public void setFOP(FOP fop) {
    this.fop = fop;
  }


  public TSTKTREQ fti(FTI fti) {
    
    this.fti = fti;
    return this;
  }

   /**
   * Get fti
   * @return fti
  **/
  @javax.annotation.Nullable

  public FTI getFTI() {
    return fti;
  }


  public void setFTI(FTI fti) {
    this.fti = fti;
  }


  public TSTKTREQ ati(ATI ati) {
    
    this.ati = ati;
    return this;
  }

   /**
   * Get ati
   * @return ati
  **/
  @javax.annotation.Nullable

  public ATI getATI() {
    return ati;
  }


  public void setATI(ATI ati) {
    this.ati = ati;
  }


  public TSTKTREQ eqn(EQN eqn) {
    
    this.eqn = eqn;
    return this;
  }

   /**
   * Get eqn
   * @return eqn
  **/
  @javax.annotation.Nullable

  public EQN getEQN() {
    return eqn;
  }


  public void setEQN(EQN eqn) {
    this.eqn = eqn;
  }


  public TSTKTREQ TXD(List<TXD> TXD) {
    
    this.TXD = TXD;
    return this;
  }

  public TSTKTREQ addTXDItem(TXD TXDItem) {
    if (this.TXD == null) {
      this.TXD = new ArrayList<>();
    }
    this.TXD.add(TXDItem);
    return this;
  }

   /**
   * Get TXD
   * @return TXD
  **/
  @javax.annotation.Nullable

  public List<TXD> getTXD() {
    return TXD;
  }


  public void setTXD(List<TXD> TXD) {
    this.TXD = TXD;
  }


  public TSTKTREQ IFT(List<IFT> IFT) {
    
    this.IFT = IFT;
    return this;
  }

  public TSTKTREQ addIFTItem(IFT IFTItem) {
    if (this.IFT == null) {
      this.IFT = new ArrayList<>();
    }
    this.IFT.add(IFTItem);
    return this;
  }

   /**
   * Get IFT
   * @return IFT
  **/
  @javax.annotation.Nullable

  public List<IFT> getIFT() {
    return IFT;
  }


  public void setIFT(List<IFT> IFT) {
    this.IFT = IFT;
  }


  public TSTKTREQ cri(CRI cri) {
    
    this.cri = cri;
    return this;
  }

   /**
   * Get cri
   * @return cri
  **/
  @javax.annotation.Nullable

  public CRI getCRI() {
    return cri;
  }


  public void setCRI(CRI cri) {
    this.cri = cri;
  }


  public TSTKTREQ far(FAR far) {
    
    this.far = far;
    return this;
  }

   /**
   * Get far
   * @return far
  **/
  @javax.annotation.Nullable

  public FAR getFAR() {
    return far;
  }


  public void setFAR(FAR far) {
    this.far = far;
  }


  public TSTKTREQ fqu(FQU fqu) {
    
    this.fqu = fqu;
    return this;
  }

   /**
   * Get fqu
   * @return fqu
  **/
  @javax.annotation.Nullable

  public FQU getFQU() {
    return fqu;
  }


  public void setFQU(FQU fqu) {
    this.fqu = fqu;
  }


  public TSTKTREQ loop1(List<Loop1TKTREQ> loop1) {
    
    this.loop1 = loop1;
    return this;
  }

  public TSTKTREQ addLoop1Item(Loop1TKTREQ loop1Item) {
    if (this.loop1 == null) {
      this.loop1 = new ArrayList<>();
    }
    this.loop1.add(loop1Item);
    return this;
  }

   /**
   * Get loop1
   * @return loop1
  **/
  @javax.annotation.Nullable

  public List<Loop1TKTREQ> getLoop1() {
    return loop1;
  }


  public void setLoop1(List<Loop1TKTREQ> loop1) {
    this.loop1 = loop1;
  }


  public TSTKTREQ loop3(List<Loop3TKTREQ> loop3) {
    
    this.loop3 = loop3;
    return this;
  }

  public TSTKTREQ addLoop3Item(Loop3TKTREQ loop3Item) {
    if (this.loop3 == null) {
      this.loop3 = new ArrayList<>();
    }
    this.loop3.add(loop3Item);
    return this;
  }

   /**
   * Get loop3
   * @return loop3
  **/
  @javax.annotation.Nullable

  public List<Loop3TKTREQ> getLoop3() {
    return loop3;
  }


  public void setLoop3(List<Loop3TKTREQ> loop3) {
    this.loop3 = loop3;
  }


  public TSTKTREQ unt(UNT unt) {
    
    this.unt = unt;
    return this;
  }

   /**
   * Get unt
   * @return unt
  **/
  @javax.annotation.Nonnull

  public UNT getUNT() {
    return unt;
  }


  public void setUNT(UNT unt) {
    this.unt = unt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TSTKTREQ TSTKTREQ = (TSTKTREQ) o;
    return Objects.equals(this.model, TSTKTREQ.model) &&
        Objects.equals(this.unh, TSTKTREQ.unh) &&
        Objects.equals(this.msg, TSTKTREQ.msg) &&
        Objects.equals(this.org, TSTKTREQ.org) &&
        Objects.equals(this.tai, TSTKTREQ.tai) &&
        Objects.equals(this.rci, TSTKTREQ.rci) &&
        Objects.equals(this.mon, TSTKTREQ.mon) &&
        Objects.equals(this.ptk, TSTKTREQ.ptk) &&
        Objects.equals(this.odi, TSTKTREQ.odi) &&
        Objects.equals(this.tvl, TSTKTREQ.tvl) &&
        Objects.equals(this.fop, TSTKTREQ.fop) &&
        Objects.equals(this.fti, TSTKTREQ.fti) &&
        Objects.equals(this.ati, TSTKTREQ.ati) &&
        Objects.equals(this.eqn, TSTKTREQ.eqn) &&
        Objects.equals(this.TXD, TSTKTREQ.TXD) &&
        Objects.equals(this.IFT, TSTKTREQ.IFT) &&
        Objects.equals(this.cri, TSTKTREQ.cri) &&
        Objects.equals(this.far, TSTKTREQ.far) &&
        Objects.equals(this.fqu, TSTKTREQ.fqu) &&
        Objects.equals(this.loop1, TSTKTREQ.loop1) &&
        Objects.equals(this.loop3, TSTKTREQ.loop3) &&
        Objects.equals(this.unt, TSTKTREQ.unt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, unh, msg, org, tai, rci, mon, ptk, odi, tvl, fop, fti, ati, eqn, TXD, IFT, cri, far, fqu, loop1, loop3, unt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TSTKTREQ {\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    unh: ").append(toIndentedString(unh)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    tai: ").append(toIndentedString(tai)).append("\n");
    sb.append("    rci: ").append(toIndentedString(rci)).append("\n");
    sb.append("    mon: ").append(toIndentedString(mon)).append("\n");
    sb.append("    ptk: ").append(toIndentedString(ptk)).append("\n");
    sb.append("    odi: ").append(toIndentedString(odi)).append("\n");
    sb.append("    tvl: ").append(toIndentedString(tvl)).append("\n");
    sb.append("    fop: ").append(toIndentedString(fop)).append("\n");
    sb.append("    fti: ").append(toIndentedString(fti)).append("\n");
    sb.append("    ati: ").append(toIndentedString(ati)).append("\n");
    sb.append("    eqn: ").append(toIndentedString(eqn)).append("\n");
    sb.append("    TXD: ").append(toIndentedString(TXD)).append("\n");
    sb.append("    IFT: ").append(toIndentedString(IFT)).append("\n");
    sb.append("    cri: ").append(toIndentedString(cri)).append("\n");
    sb.append("    far: ").append(toIndentedString(far)).append("\n");
    sb.append("    fqu: ").append(toIndentedString(fqu)).append("\n");
    sb.append("    loop1: ").append(toIndentedString(loop1)).append("\n");
    sb.append("    loop3: ").append(toIndentedString(loop3)).append("\n");
    sb.append("    unt: ").append(toIndentedString(unt)).append("\n");
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
    openapiFields.add("Model");
    openapiFields.add("UNH");
    openapiFields.add("MSG");
    openapiFields.add("ORG");
    openapiFields.add("TAI");
    openapiFields.add("RCI");
    openapiFields.add("MON");
    openapiFields.add("PTK");
    openapiFields.add("ODI");
    openapiFields.add("TVL");
    openapiFields.add("FOP");
    openapiFields.add("FTI");
    openapiFields.add("ATI");
    openapiFields.add("EQN");
    openapiFields.add("TXD");
    openapiFields.add("IFT");
    openapiFields.add("CRI");
    openapiFields.add("FAR");
    openapiFields.add("FQU");
    openapiFields.add("Loop1");
    openapiFields.add("Loop3");
    openapiFields.add("UNT");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("UNH");
    openapiRequiredFields.add("MSG");
    openapiRequiredFields.add("UNT");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TSTKTREQ
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TSTKTREQ.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TSTKTREQ is not found in the empty JSON string", TSTKTREQ.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TSTKTREQ.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TSTKTREQ` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TSTKTREQ.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Model") != null && !jsonObj.get("Model").isJsonNull()) && !jsonObj.get("Model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Model").toString()));
      }
      // validate the required field `UNH`
      UNH.validateJsonObject(jsonObj.getAsJsonObject("UNH"));
      // validate the required field `MSG`
      MSG.validateJsonObject(jsonObj.getAsJsonObject("MSG"));
      // validate the optional field `ORG`
      if (jsonObj.get("ORG") != null && !jsonObj.get("ORG").isJsonNull()) {
        ORG.validateJsonObject(jsonObj.getAsJsonObject("ORG"));
      }
      // validate the optional field `TAI`
      if (jsonObj.get("TAI") != null && !jsonObj.get("TAI").isJsonNull()) {
        TAI.validateJsonObject(jsonObj.getAsJsonObject("TAI"));
      }
      // validate the optional field `RCI`
      if (jsonObj.get("RCI") != null && !jsonObj.get("RCI").isJsonNull()) {
        RCI.validateJsonObject(jsonObj.getAsJsonObject("RCI"));
      }
      // validate the optional field `MON`
      if (jsonObj.get("MON") != null && !jsonObj.get("MON").isJsonNull()) {
        MON.validateJsonObject(jsonObj.getAsJsonObject("MON"));
      }
      // validate the optional field `PTK`
      if (jsonObj.get("PTK") != null && !jsonObj.get("PTK").isJsonNull()) {
        PTK.validateJsonObject(jsonObj.getAsJsonObject("PTK"));
      }
      // validate the optional field `ODI`
      if (jsonObj.get("ODI") != null && !jsonObj.get("ODI").isJsonNull()) {
        ODI.validateJsonObject(jsonObj.getAsJsonObject("ODI"));
      }
      // validate the optional field `TVL`
      if (jsonObj.get("TVL") != null && !jsonObj.get("TVL").isJsonNull()) {
        TVL.validateJsonObject(jsonObj.getAsJsonObject("TVL"));
      }
      // validate the optional field `FOP`
      if (jsonObj.get("FOP") != null && !jsonObj.get("FOP").isJsonNull()) {
        FOP.validateJsonObject(jsonObj.getAsJsonObject("FOP"));
      }
      // validate the optional field `FTI`
      if (jsonObj.get("FTI") != null && !jsonObj.get("FTI").isJsonNull()) {
        FTI.validateJsonObject(jsonObj.getAsJsonObject("FTI"));
      }
      // validate the optional field `ATI`
      if (jsonObj.get("ATI") != null && !jsonObj.get("ATI").isJsonNull()) {
        ATI.validateJsonObject(jsonObj.getAsJsonObject("ATI"));
      }
      // validate the optional field `EQN`
      if (jsonObj.get("EQN") != null && !jsonObj.get("EQN").isJsonNull()) {
        EQN.validateJsonObject(jsonObj.getAsJsonObject("EQN"));
      }
      if (jsonObj.get("TXD") != null && !jsonObj.get("TXD").isJsonNull()) {
        JsonArray jsonArrayTXD = jsonObj.getAsJsonArray("TXD");
        if (jsonArrayTXD != null) {
          // ensure the json data is an array
          if (!jsonObj.get("TXD").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `TXD` to be an array in the JSON string but got `%s`", jsonObj.get("TXD").toString()));
          }

          // validate the optional field `TXD` (array)
          for (int i = 0; i < jsonArrayTXD.size(); i++) {
            TXD.validateJsonObject(jsonArrayTXD.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("IFT") != null && !jsonObj.get("IFT").isJsonNull()) {
        JsonArray jsonArrayIFT = jsonObj.getAsJsonArray("IFT");
        if (jsonArrayIFT != null) {
          // ensure the json data is an array
          if (!jsonObj.get("IFT").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `IFT` to be an array in the JSON string but got `%s`", jsonObj.get("IFT").toString()));
          }

          // validate the optional field `IFT` (array)
          for (int i = 0; i < jsonArrayIFT.size(); i++) {
            IFT.validateJsonObject(jsonArrayIFT.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `CRI`
      if (jsonObj.get("CRI") != null && !jsonObj.get("CRI").isJsonNull()) {
        CRI.validateJsonObject(jsonObj.getAsJsonObject("CRI"));
      }
      // validate the optional field `FAR`
      if (jsonObj.get("FAR") != null && !jsonObj.get("FAR").isJsonNull()) {
        FAR.validateJsonObject(jsonObj.getAsJsonObject("FAR"));
      }
      // validate the optional field `FQU`
      if (jsonObj.get("FQU") != null && !jsonObj.get("FQU").isJsonNull()) {
        FQU.validateJsonObject(jsonObj.getAsJsonObject("FQU"));
      }
      if (jsonObj.get("Loop1") != null && !jsonObj.get("Loop1").isJsonNull()) {
        JsonArray jsonArrayloop1 = jsonObj.getAsJsonArray("Loop1");
        if (jsonArrayloop1 != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Loop1").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Loop1` to be an array in the JSON string but got `%s`", jsonObj.get("Loop1").toString()));
          }

          // validate the optional field `Loop1` (array)
          for (int i = 0; i < jsonArrayloop1.size(); i++) {
            Loop1TKTREQ.validateJsonObject(jsonArrayloop1.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("Loop3") != null && !jsonObj.get("Loop3").isJsonNull()) {
        JsonArray jsonArrayloop3 = jsonObj.getAsJsonArray("Loop3");
        if (jsonArrayloop3 != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Loop3").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Loop3` to be an array in the JSON string but got `%s`", jsonObj.get("Loop3").toString()));
          }

          // validate the optional field `Loop3` (array)
          for (int i = 0; i < jsonArrayloop3.size(); i++) {
            Loop3TKTREQ.validateJsonObject(jsonArrayloop3.get(i).getAsJsonObject());
          };
        }
      }
      // validate the required field `UNT`
      UNT.validateJsonObject(jsonObj.getAsJsonObject("UNT"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TSTKTREQ.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TSTKTREQ' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TSTKTREQ> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TSTKTREQ.class));

       return (TypeAdapter<T>) new TypeAdapter<TSTKTREQ>() {
           @Override
           public void write(JsonWriter out, TSTKTREQ value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TSTKTREQ read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TSTKTREQ given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TSTKTREQ
  * @throws IOException if the JSON string is invalid with respect to TSTKTREQ
  */
  public static TSTKTREQ fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TSTKTREQ.class);
  }

 /**
  * Convert an instance of TSTKTREQ to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
