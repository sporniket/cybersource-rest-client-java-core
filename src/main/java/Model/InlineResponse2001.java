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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * InlineResponse2001
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class InlineResponse2001 {
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

  public InlineResponse2001 keyId(String keyId) {
    this.keyId = keyId;
    return this;
  }

   /**
   * The Key ID.
   * @return keyId The Key ID.
  **/
  @ApiModelProperty(value = "The Key ID.")
  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  public InlineResponse2001 token(String token) {
    this.token = token;
    return this;
  }

   /**
   * The generated token. The token replaces card data and is used as the Subscription ID in the CyberSource Simple Order API or SCMP API.
   * @return token The generated token.
  **/
  @ApiModelProperty(value = "The generated token. The token replaces card data and is used as the Subscription ID in the CyberSource Simple Order API or SCMP API.")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public InlineResponse2001 maskedPan(String maskedPan) {
    this.maskedPan = maskedPan;
    return this;
  }

   /**
   * The masked card number displaying the first 6 digits and the last 4 digits.
   * @return maskedPan The masked card number.
  **/
  @ApiModelProperty(value = "The masked card number displaying the first 6 digits and the last 4 digits.")
  public String getMaskedPan() {
    return maskedPan;
  }

  public void setMaskedPan(String maskedPan) {
    this.maskedPan = maskedPan;
  }

  public InlineResponse2001 cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * The card type.
   * @return cardType The card type
  **/
  @ApiModelProperty(value = "The card type.")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public InlineResponse2001 timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The UTC date and time in milliseconds at which the signature was generated.
   * @return timestamp The UTC date and time
  **/
  @ApiModelProperty(value = "The UTC date and time in milliseconds at which the signature was generated.")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public InlineResponse2001 signedFields(String signedFields) {
    this.signedFields = signedFields;
    return this;
  }

   /**
   * Indicates which fields from the response make up the data that is used when verifying the response signature. See the [sample code] (https://github.com/CyberSource/cybersource-flex-samples/blob/master/java/spring-boot/src/main/java/com/cybersource/flex/application/CheckoutController.java) on how to verify the signature.
   * @return signedFields Signed fields.
  **/
  @ApiModelProperty(value = "Indicates which fields from the response make up the data that is used when verifying the response signature. See the [sample code] (https://github.com/CyberSource/cybersource-flex-samples/blob/master/java/spring-boot/src/main/java/com/cybersource/flex/application/CheckoutController.java) on how to verify the signature.")
  public String getSignedFields() {
    return signedFields;
  }

  public void setSignedFields(String signedFields) {
    this.signedFields = signedFields;
  }

  public InlineResponse2001 signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Flex-generated digital signature. To ensure the values have not been tampered with while passing through the client, verify this server-side using the public key generated from the /keys resource.
   * @return signature Flex-generated digital signature.
  **/
  @ApiModelProperty(value = "Flex-generated digital signature. To ensure the values have not been tampered with while passing through the client, verify this server-side using the public key generated from the /keys resource.")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public InlineResponse2001 discoverableServices(Map<String, Object> discoverableServices) {
    this.discoverableServices = discoverableServices;
    return this;
  }

  public InlineResponse2001 putDiscoverableServicesItem(String key, Object discoverableServicesItem) {
    if (this.discoverableServices == null) {
      this.discoverableServices = new HashMap<String, Object>();
    }
    this.discoverableServices.put(key, discoverableServicesItem);
    return this;
  }

   /**
   * Get discoverableServices
   * @return discoverableServices object.
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
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.keyId, inlineResponse2001.keyId) &&
        Objects.equals(this.token, inlineResponse2001.token) &&
        Objects.equals(this.maskedPan, inlineResponse2001.maskedPan) &&
        Objects.equals(this.cardType, inlineResponse2001.cardType) &&
        Objects.equals(this.timestamp, inlineResponse2001.timestamp) &&
        Objects.equals(this.signedFields, inlineResponse2001.signedFields) &&
        Objects.equals(this.signature, inlineResponse2001.signature) &&
        Objects.equals(this.discoverableServices, inlineResponse2001.discoverableServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyId, token, maskedPan, cardType, timestamp, signedFields, signature, discoverableServices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
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

