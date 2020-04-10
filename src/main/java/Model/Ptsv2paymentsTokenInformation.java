/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsTokenInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-09T11:41:34.789+05:30")
public class Ptsv2paymentsTokenInformation {
  @SerializedName("jti")
  private String jti = null;

  @SerializedName("transientTokenJwt")
  private String transientTokenJwt = null;

  public Ptsv2paymentsTokenInformation jti(String jti) {
    this.jti = jti;
    return this;
  }

   /**
   * TMS Transient Token, 64 hexadecimal id value representing captured payment credentials (including Sensitive Authentication Data, e.g. CVV). 
   * @return jti
  **/
  @ApiModelProperty(value = "TMS Transient Token, 64 hexadecimal id value representing captured payment credentials (including Sensitive Authentication Data, e.g. CVV). ")
  public String getJti() {
    return jti;
  }

  public void setJti(String jti) {
    this.jti = jti;
  }

  public Ptsv2paymentsTokenInformation transientTokenJwt(String transientTokenJwt) {
    this.transientTokenJwt = transientTokenJwt;
    return this;
  }

   /**
   * Flex API Transient Token encoded as JWT (JSON Web Token), e.g. Flex microform or Unified Payment checkout result. 
   * @return transientTokenJwt
  **/
  @ApiModelProperty(value = "Flex API Transient Token encoded as JWT (JSON Web Token), e.g. Flex microform or Unified Payment checkout result. ")
  public String getTransientTokenJwt() {
    return transientTokenJwt;
  }

  public void setTransientTokenJwt(String transientTokenJwt) {
    this.transientTokenJwt = transientTokenJwt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsTokenInformation ptsv2paymentsTokenInformation = (Ptsv2paymentsTokenInformation) o;
    return Objects.equals(this.jti, ptsv2paymentsTokenInformation.jti) &&
        Objects.equals(this.transientTokenJwt, ptsv2paymentsTokenInformation.transientTokenJwt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jti, transientTokenJwt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsTokenInformation {\n");
    
    sb.append("    jti: ").append(toIndentedString(jti)).append("\n");
    sb.append("    transientTokenJwt: ").append(toIndentedString(transientTokenJwt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

