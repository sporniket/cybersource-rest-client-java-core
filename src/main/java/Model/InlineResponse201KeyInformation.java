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
import Model.InlineResponse201ErrorInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * key information 
 */
@ApiModel(description = "key information ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-27T16:17:50.788+05:30")
public class InlineResponse201KeyInformation {
  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("referenceNumber")
  private String referenceNumber = null;

  @SerializedName("keyId")
  private String keyId = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("expirationDate")
  private String expirationDate = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("errorInformation")
  private InlineResponse201ErrorInformation errorInformation = null;

  public InlineResponse201KeyInformation organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Merchant Id 
   * @return organizationId
  **/
  @ApiModelProperty(value = "Merchant Id ")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public InlineResponse201KeyInformation referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * Reference number is a unique identifier provided by the client along with the organization Id. This is an optional field provided solely for the client’s convenience. If client specifies value for this field in the request, it is expected to be available in the response. 
   * @return referenceNumber
  **/
  @ApiModelProperty(value = "Reference number is a unique identifier provided by the client along with the organization Id. This is an optional field provided solely for the client’s convenience. If client specifies value for this field in the request, it is expected to be available in the response. ")
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public InlineResponse201KeyInformation keyId(String keyId) {
    this.keyId = keyId;
    return this;
  }

   /**
   * Key Serial Number 
   * @return keyId
  **/
  @ApiModelProperty(value = "Key Serial Number ")
  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  public InlineResponse201KeyInformation key(String key) {
    this.key = key;
    return this;
  }

   /**
   * value of the key 
   * @return key
  **/
  @ApiModelProperty(value = "value of the key ")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public InlineResponse201KeyInformation status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the key.  Possible values:  - FAILED  - ACTIVE 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the key.  Possible values:  - FAILED  - ACTIVE ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineResponse201KeyInformation expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The expiration time in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. 
   * @return expirationDate
  **/
  @ApiModelProperty(value = "The expiration time in UTC. `Format: YYYY-MM-DDThh:mm:ssZ`  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. ")
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public InlineResponse201KeyInformation message(String message) {
    this.message = message;
    return this;
  }

   /**
   * message in case of failed key
   * @return message
  **/
  @ApiModelProperty(value = "message in case of failed key")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse201KeyInformation errorInformation(InlineResponse201ErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
    return this;
  }

   /**
   * Get errorInformation
   * @return errorInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse201ErrorInformation getErrorInformation() {
    return errorInformation;
  }

  public void setErrorInformation(InlineResponse201ErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse201KeyInformation inlineResponse201KeyInformation = (InlineResponse201KeyInformation) o;
    return Objects.equals(this.organizationId, inlineResponse201KeyInformation.organizationId) &&
        Objects.equals(this.referenceNumber, inlineResponse201KeyInformation.referenceNumber) &&
        Objects.equals(this.keyId, inlineResponse201KeyInformation.keyId) &&
        Objects.equals(this.key, inlineResponse201KeyInformation.key) &&
        Objects.equals(this.status, inlineResponse201KeyInformation.status) &&
        Objects.equals(this.expirationDate, inlineResponse201KeyInformation.expirationDate) &&
        Objects.equals(this.message, inlineResponse201KeyInformation.message) &&
        Objects.equals(this.errorInformation, inlineResponse201KeyInformation.errorInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, referenceNumber, keyId, key, status, expirationDate, message, errorInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201KeyInformation {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errorInformation: ").append(toIndentedString(errorInformation)).append("\n");
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

