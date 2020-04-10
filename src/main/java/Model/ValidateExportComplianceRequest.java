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
import Model.Riskv1addressverificationsBuyerInformation;
import Model.Riskv1addressverificationsClientReferenceInformation;
import Model.Riskv1exportcomplianceinquiriesDeviceInformation;
import Model.Riskv1exportcomplianceinquiriesExportComplianceInformation;
import Model.Riskv1exportcomplianceinquiriesOrderInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ValidateExportComplianceRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-09T11:41:34.789+05:30")
public class ValidateExportComplianceRequest {
  @SerializedName("clientReferenceInformation")
  private Riskv1addressverificationsClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("orderInformation")
  private Riskv1exportcomplianceinquiriesOrderInformation orderInformation = null;

  @SerializedName("buyerInformation")
  private Riskv1addressverificationsBuyerInformation buyerInformation = null;

  @SerializedName("deviceInformation")
  private Riskv1exportcomplianceinquiriesDeviceInformation deviceInformation = null;

  @SerializedName("exportComplianceInformation")
  private Riskv1exportcomplianceinquiriesExportComplianceInformation exportComplianceInformation = null;

  public ValidateExportComplianceRequest clientReferenceInformation(Riskv1addressverificationsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1addressverificationsClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Riskv1addressverificationsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public ValidateExportComplianceRequest orderInformation(Riskv1exportcomplianceinquiriesOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1exportcomplianceinquiriesOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Riskv1exportcomplianceinquiriesOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public ValidateExportComplianceRequest buyerInformation(Riskv1addressverificationsBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1addressverificationsBuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(Riskv1addressverificationsBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }

  public ValidateExportComplianceRequest deviceInformation(Riskv1exportcomplianceinquiriesDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
    return this;
  }

   /**
   * Get deviceInformation
   * @return deviceInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1exportcomplianceinquiriesDeviceInformation getDeviceInformation() {
    return deviceInformation;
  }

  public void setDeviceInformation(Riskv1exportcomplianceinquiriesDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
  }

  public ValidateExportComplianceRequest exportComplianceInformation(Riskv1exportcomplianceinquiriesExportComplianceInformation exportComplianceInformation) {
    this.exportComplianceInformation = exportComplianceInformation;
    return this;
  }

   /**
   * Get exportComplianceInformation
   * @return exportComplianceInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1exportcomplianceinquiriesExportComplianceInformation getExportComplianceInformation() {
    return exportComplianceInformation;
  }

  public void setExportComplianceInformation(Riskv1exportcomplianceinquiriesExportComplianceInformation exportComplianceInformation) {
    this.exportComplianceInformation = exportComplianceInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateExportComplianceRequest validateExportComplianceRequest = (ValidateExportComplianceRequest) o;
    return Objects.equals(this.clientReferenceInformation, validateExportComplianceRequest.clientReferenceInformation) &&
        Objects.equals(this.orderInformation, validateExportComplianceRequest.orderInformation) &&
        Objects.equals(this.buyerInformation, validateExportComplianceRequest.buyerInformation) &&
        Objects.equals(this.deviceInformation, validateExportComplianceRequest.deviceInformation) &&
        Objects.equals(this.exportComplianceInformation, validateExportComplianceRequest.exportComplianceInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, orderInformation, buyerInformation, deviceInformation, exportComplianceInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateExportComplianceRequest {\n");
    
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
    sb.append("    deviceInformation: ").append(toIndentedString(deviceInformation)).append("\n");
    sb.append("    exportComplianceInformation: ").append(toIndentedString(exportComplianceInformation)).append("\n");
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

