/*
 * CyberSource Flex API
 * Simple PAN tokenization service
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

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * TokenizeRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class TokenizeRequest {
  @SerializedName("keyId")
  private String keyId = null;

  @SerializedName("cardInfo")
  private Paymentsflexv1tokensCardInfo cardInfo = null;

  public TokenizeRequest keyId(String keyId) {
    this.keyId = keyId;
    return this;
  }

   /**
   * Unique identifier for the generated token. This is obtained from the Generate Key request. See the [Java Script and Java examples] (http://apps.cybersource.com/library/documentation/dev_guides/Secure_Acceptance_Flex/Key/html) on how to import the key and encrypt using the imported key.
   * @return keyId
  **/
  @ApiModelProperty(value = "Unique identifier for the generated token. This is obtained from the Generate Key request. See the [Java Script and Java examples] (http://apps.cybersource.com/library/documentation/dev_guides/Secure_Acceptance_Flex/Key/html) on how to import the key and encrypt using the imported key.")
  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  public TokenizeRequest cardInfo(Paymentsflexv1tokensCardInfo cardInfo) {
    this.cardInfo = cardInfo;
    return this;
  }

   /**
   * Get cardInfo
   * @return cardInfo
  **/
  @ApiModelProperty(value = "")
  public Paymentsflexv1tokensCardInfo getCardInfo() {
    return cardInfo;
  }

  public void setCardInfo(Paymentsflexv1tokensCardInfo cardInfo) {
    this.cardInfo = cardInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenizeRequest tokenizeRequest = (TokenizeRequest) o;
    return Objects.equals(this.keyId, tokenizeRequest.keyId) &&
        Objects.equals(this.cardInfo, tokenizeRequest.cardInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyId, cardInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizeRequest {\n");
    
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    cardInfo: ").append(toIndentedString(cardInfo)).append("\n");
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

