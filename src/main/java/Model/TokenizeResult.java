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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TokenizeResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-31T18:13:53.731+05:30")
public class TokenizeResult {
  @SerializedName("keyId")
  private String keyId = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("maskedPan")
  private String maskedPan = null;

  @SerializedName("cardType")
  private String cardType = null;

  @SerializedName("timestamp")
  private Long timestamp = null;

  @SerializedName("signedFields")
  private String signedFields = null;

  @SerializedName("signature")
  private String signature = null;

  @SerializedName("discoverableServices")
  private Map<String, Object> discoverableServices = null;

  public TokenizeResult keyId(String keyId) {
    this.keyId = keyId;
    return this;
  }

   /**
   * The Key ID.
   * @return keyId
  **/
  @ApiModelProperty(value = "The Key ID.")
  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  public TokenizeResult token(String token) {
    this.token = token;
    return this;
  }

   /**
   * The generated token. The token replaces card data and is used as the Subscription ID in the CyberSource Simple Order API or SCMP API.
   * @return token
  **/
  @ApiModelProperty(value = "The generated token. The token replaces card data and is used as the Subscription ID in the CyberSource Simple Order API or SCMP API.")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public TokenizeResult maskedPan(String maskedPan) {
    this.maskedPan = maskedPan;
    return this;
  }

   /**
   * The masked card number displaying the first 6 digits and the last 4 digits.
   * @return maskedPan
  **/
  @ApiModelProperty(value = "The masked card number displaying the first 6 digits and the last 4 digits.")
  public String getMaskedPan() {
    return maskedPan;
  }

  public void setMaskedPan(String maskedPan) {
    this.maskedPan = maskedPan;
  }

  public TokenizeResult cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * The card type.
   * @return cardType
  **/
  @ApiModelProperty(value = "The card type.")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public TokenizeResult timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The UTC date and time in milliseconds at which the signature was generated.
   * @return timestamp
  **/
  @ApiModelProperty(value = "The UTC date and time in milliseconds at which the signature was generated.")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public TokenizeResult signedFields(String signedFields) {
    this.signedFields = signedFields;
    return this;
  }

   /**
   * Indicates which fields from the response make up the data that is used when verifying the response signature. See the [sample code] (https://github.com/CyberSource/cybersource-flex-samples/blob/master/java/spring-boot/src/main/java/com/cybersource/flex/application/CheckoutController.java) on how to verify the signature.
   * @return signedFields
  **/
  @ApiModelProperty(value = "Indicates which fields from the response make up the data that is used when verifying the response signature. See the [sample code] (https://github.com/CyberSource/cybersource-flex-samples/blob/master/java/spring-boot/src/main/java/com/cybersource/flex/application/CheckoutController.java) on how to verify the signature.")
  public String getSignedFields() {
    return signedFields;
  }

  public void setSignedFields(String signedFields) {
    this.signedFields = signedFields;
  }

  public TokenizeResult signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Flex-generated digital signature. To ensure the values have not been tampered with while passing through the client, verify this server-side using the public key generated from the /keys resource.
   * @return signature
  **/
  @ApiModelProperty(value = "Flex-generated digital signature. To ensure the values have not been tampered with while passing through the client, verify this server-side using the public key generated from the /keys resource.")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public TokenizeResult discoverableServices(Map<String, Object> discoverableServices) {
    this.discoverableServices = discoverableServices;
    return this;
  }

  public TokenizeResult putDiscoverableServicesItem(String key, Object discoverableServicesItem) {
    if (this.discoverableServices == null) {
      this.discoverableServices = new HashMap<String, Object>();
    }
    this.discoverableServices.put(key, discoverableServicesItem);
    return this;
  }

   /**
   * Get discoverableServices
   * @return discoverableServices
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getDiscoverableServices() {
    return discoverableServices;
  }

  public void setDiscoverableServices(Map<String, Object> discoverableServices) {
    this.discoverableServices = discoverableServices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenizeResult tokenizeResult = (TokenizeResult) o;
    return Objects.equals(this.keyId, tokenizeResult.keyId) &&
        Objects.equals(this.token, tokenizeResult.token) &&
        Objects.equals(this.maskedPan, tokenizeResult.maskedPan) &&
        Objects.equals(this.cardType, tokenizeResult.cardType) &&
        Objects.equals(this.timestamp, tokenizeResult.timestamp) &&
        Objects.equals(this.signedFields, tokenizeResult.signedFields) &&
        Objects.equals(this.signature, tokenizeResult.signature) &&
        Objects.equals(this.discoverableServices, tokenizeResult.discoverableServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyId, token, maskedPan, cardType, timestamp, signedFields, signature, discoverableServices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizeResult {\n");
    
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    maskedPan: ").append(toIndentedString(maskedPan)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    signedFields: ").append(toIndentedString(signedFields)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    discoverableServices: ").append(toIndentedString(discoverableServices)).append("\n");
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

