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
 * key information 
 */
@ApiModel(description = "key information ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-27T16:17:50.788+05:30")
public class Kmsv2keyssymdeletesKeyInformation {
  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("referenceNumber")
  private String referenceNumber = null;

  @SerializedName("keyId")
  private String keyId = null;

  public Kmsv2keyssymdeletesKeyInformation organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Merchant Id 
   * @return organizationId
  **/
  @ApiModelProperty(required = true, value = "Merchant Id ")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public Kmsv2keyssymdeletesKeyInformation referenceNumber(String referenceNumber) {
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

  public Kmsv2keyssymdeletesKeyInformation keyId(String keyId) {
    this.keyId = keyId;
    return this;
  }

   /**
   * Key Serial Number
   * @return keyId
  **/
  @ApiModelProperty(required = true, value = "Key Serial Number")
  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Kmsv2keyssymdeletesKeyInformation kmsv2keyssymdeletesKeyInformation = (Kmsv2keyssymdeletesKeyInformation) o;
    return Objects.equals(this.organizationId, kmsv2keyssymdeletesKeyInformation.organizationId) &&
        Objects.equals(this.referenceNumber, kmsv2keyssymdeletesKeyInformation.referenceNumber) &&
        Objects.equals(this.keyId, kmsv2keyssymdeletesKeyInformation.keyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, referenceNumber, keyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Kmsv2keyssymdeletesKeyInformation {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
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

