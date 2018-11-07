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
import Model.InlineResponse20012ApplicationInformation;
import Model.InlineResponse20012FraudMarkingInformation;
import Model.InlineResponse20012MerchantDefinedInformation;
import Model.InlineResponse2017EmbeddedBuyerInformation;
import Model.InlineResponse2017EmbeddedClientReferenceInformation;
import Model.InlineResponse2017EmbeddedConsumerAuthenticationInformation;
import Model.InlineResponse2017EmbeddedDeviceInformation;
import Model.InlineResponse2017EmbeddedLinks;
import Model.InlineResponse2017EmbeddedMerchantInformation;
import Model.InlineResponse2017EmbeddedOrderInformation;
import Model.InlineResponse2017EmbeddedPaymentInformation;
import Model.InlineResponse2017EmbeddedPointOfSaleInformation;
import Model.InlineResponse2017EmbeddedProcessingInformation;
import Model.InlineResponse2017EmbeddedProcessorInformation;
import Model.InlineResponse2017EmbeddedRiskInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2017EmbeddedTransactionSummaries
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-31T18:13:53.731+05:30")
public class InlineResponse2017EmbeddedTransactionSummaries {
  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("merchantId")
  private String merchantId = null;

  @SerializedName("applicationInformation")
  private InlineResponse20012ApplicationInformation applicationInformation = null;

  @SerializedName("buyerInformation")
  private InlineResponse2017EmbeddedBuyerInformation buyerInformation = null;

  @SerializedName("clientReferenceInformation")
  private InlineResponse2017EmbeddedClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("consumerAuthenticationInformation")
  private InlineResponse2017EmbeddedConsumerAuthenticationInformation consumerAuthenticationInformation = null;

  @SerializedName("deviceInformation")
  private InlineResponse2017EmbeddedDeviceInformation deviceInformation = null;

  @SerializedName("fraudMarkingInformation")
  private InlineResponse20012FraudMarkingInformation fraudMarkingInformation = null;

  @SerializedName("merchantDefinedInformation")
  private List<InlineResponse20012MerchantDefinedInformation> merchantDefinedInformation = null;

  @SerializedName("merchantInformation")
  private InlineResponse2017EmbeddedMerchantInformation merchantInformation = null;

  @SerializedName("orderInformation")
  private InlineResponse2017EmbeddedOrderInformation orderInformation = null;

  @SerializedName("paymentInformation")
  private InlineResponse2017EmbeddedPaymentInformation paymentInformation = null;

  @SerializedName("processingInformation")
  private InlineResponse2017EmbeddedProcessingInformation processingInformation = null;

  @SerializedName("processorInformation")
  private InlineResponse2017EmbeddedProcessorInformation processorInformation = null;

  @SerializedName("pointOfSaleInformation")
  private InlineResponse2017EmbeddedPointOfSaleInformation pointOfSaleInformation = null;

  @SerializedName("riskInformation")
  private InlineResponse2017EmbeddedRiskInformation riskInformation = null;

  @SerializedName("_links")
  private InlineResponse2017EmbeddedLinks links = null;

  public InlineResponse2017EmbeddedTransactionSummaries id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identification number assigned by CyberSource to identify the submitted request.
   * @return id
  **/
  @ApiModelProperty(value = "An unique identification number assigned by CyberSource to identify the submitted request.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse2017EmbeddedTransactionSummaries submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. `Format: YYYY-MM-DDThh:mm:ssZ`  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public InlineResponse2017EmbeddedTransactionSummaries merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * The description for this field is not available.
   * @return merchantId
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public InlineResponse2017EmbeddedTransactionSummaries applicationInformation(InlineResponse20012ApplicationInformation applicationInformation) {
    this.applicationInformation = applicationInformation;
    return this;
  }

   /**
   * Get applicationInformation
   * @return applicationInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse20012ApplicationInformation getApplicationInformation() {
    return applicationInformation;
  }

  public void setApplicationInformation(InlineResponse20012ApplicationInformation applicationInformation) {
    this.applicationInformation = applicationInformation;
  }

  public InlineResponse2017EmbeddedTransactionSummaries buyerInformation(InlineResponse2017EmbeddedBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2017EmbeddedBuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(InlineResponse2017EmbeddedBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }

  public InlineResponse2017EmbeddedTransactionSummaries clientReferenceInformation(InlineResponse2017EmbeddedClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2017EmbeddedClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(InlineResponse2017EmbeddedClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public InlineResponse2017EmbeddedTransactionSummaries consumerAuthenticationInformation(InlineResponse2017EmbeddedConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
    return this;
  }

   /**
   * Get consumerAuthenticationInformation
   * @return consumerAuthenticationInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2017EmbeddedConsumerAuthenticationInformation getConsumerAuthenticationInformation() {
    return consumerAuthenticationInformation;
  }

  public void setConsumerAuthenticationInformation(InlineResponse2017EmbeddedConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
  }

  public InlineResponse2017EmbeddedTransactionSummaries deviceInformation(InlineResponse2017EmbeddedDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
    return this;
  }

   /**
   * Get deviceInformation
   * @return deviceInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2017EmbeddedDeviceInformation getDeviceInformation() {
    return deviceInformation;
  }

  public void setDeviceInformation(InlineResponse2017EmbeddedDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
  }

  public InlineResponse2017EmbeddedTransactionSummaries fraudMarkingInformation(InlineResponse20012FraudMarkingInformation fraudMarkingInformation) {
    this.fraudMarkingInformation = fraudMarkingInformation;
    return this;
  }

   /**
   * Get fraudMarkingInformation
   * @return fraudMarkingInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse20012FraudMarkingInformation getFraudMarkingInformation() {
    return fraudMarkingInformation;
  }

  public void setFraudMarkingInformation(InlineResponse20012FraudMarkingInformation fraudMarkingInformation) {
    this.fraudMarkingInformation = fraudMarkingInformation;
  }

  public InlineResponse2017EmbeddedTransactionSummaries merchantDefinedInformation(List<InlineResponse20012MerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
    return this;
  }

  public InlineResponse2017EmbeddedTransactionSummaries addMerchantDefinedInformationItem(InlineResponse20012MerchantDefinedInformation merchantDefinedInformationItem) {
    if (this.merchantDefinedInformation == null) {
      this.merchantDefinedInformation = new ArrayList<InlineResponse20012MerchantDefinedInformation>();
    }
    this.merchantDefinedInformation.add(merchantDefinedInformationItem);
    return this;
  }

   /**
   * The description for this field is not available.
   * @return merchantDefinedInformation
  **/
  @ApiModelProperty(value = "The description for this field is not available.")
  public List<InlineResponse20012MerchantDefinedInformation> getMerchantDefinedInformation() {
    return merchantDefinedInformation;
  }

  public void setMerchantDefinedInformation(List<InlineResponse20012MerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
  }

  public InlineResponse2017EmbeddedTransactionSummaries merchantInformation(InlineResponse2017EmbeddedMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2017EmbeddedMerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(InlineResponse2017EmbeddedMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public InlineResponse2017EmbeddedTransactionSummaries orderInformation(InlineResponse2017EmbeddedOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2017EmbeddedOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(InlineResponse2017EmbeddedOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public InlineResponse2017EmbeddedTransactionSummaries paymentInformation(InlineResponse2017EmbeddedPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2017EmbeddedPaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(InlineResponse2017EmbeddedPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public InlineResponse2017EmbeddedTransactionSummaries processingInformation(InlineResponse2017EmbeddedProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2017EmbeddedProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(InlineResponse2017EmbeddedProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public InlineResponse2017EmbeddedTransactionSummaries processorInformation(InlineResponse2017EmbeddedProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
    return this;
  }

   /**
   * Get processorInformation
   * @return processorInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2017EmbeddedProcessorInformation getProcessorInformation() {
    return processorInformation;
  }

  public void setProcessorInformation(InlineResponse2017EmbeddedProcessorInformation processorInformation) {
    this.processorInformation = processorInformation;
  }

  public InlineResponse2017EmbeddedTransactionSummaries pointOfSaleInformation(InlineResponse2017EmbeddedPointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
    return this;
  }

   /**
   * Get pointOfSaleInformation
   * @return pointOfSaleInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2017EmbeddedPointOfSaleInformation getPointOfSaleInformation() {
    return pointOfSaleInformation;
  }

  public void setPointOfSaleInformation(InlineResponse2017EmbeddedPointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
  }

  public InlineResponse2017EmbeddedTransactionSummaries riskInformation(InlineResponse2017EmbeddedRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
    return this;
  }

   /**
   * Get riskInformation
   * @return riskInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2017EmbeddedRiskInformation getRiskInformation() {
    return riskInformation;
  }

  public void setRiskInformation(InlineResponse2017EmbeddedRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
  }

  public InlineResponse2017EmbeddedTransactionSummaries links(InlineResponse2017EmbeddedLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2017EmbeddedLinks getLinks() {
    return links;
  }

  public void setLinks(InlineResponse2017EmbeddedLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2017EmbeddedTransactionSummaries inlineResponse2017EmbeddedTransactionSummaries = (InlineResponse2017EmbeddedTransactionSummaries) o;
    return Objects.equals(this.id, inlineResponse2017EmbeddedTransactionSummaries.id) &&
        Objects.equals(this.submitTimeUtc, inlineResponse2017EmbeddedTransactionSummaries.submitTimeUtc) &&
        Objects.equals(this.merchantId, inlineResponse2017EmbeddedTransactionSummaries.merchantId) &&
        Objects.equals(this.applicationInformation, inlineResponse2017EmbeddedTransactionSummaries.applicationInformation) &&
        Objects.equals(this.buyerInformation, inlineResponse2017EmbeddedTransactionSummaries.buyerInformation) &&
        Objects.equals(this.clientReferenceInformation, inlineResponse2017EmbeddedTransactionSummaries.clientReferenceInformation) &&
        Objects.equals(this.consumerAuthenticationInformation, inlineResponse2017EmbeddedTransactionSummaries.consumerAuthenticationInformation) &&
        Objects.equals(this.deviceInformation, inlineResponse2017EmbeddedTransactionSummaries.deviceInformation) &&
        Objects.equals(this.fraudMarkingInformation, inlineResponse2017EmbeddedTransactionSummaries.fraudMarkingInformation) &&
        Objects.equals(this.merchantDefinedInformation, inlineResponse2017EmbeddedTransactionSummaries.merchantDefinedInformation) &&
        Objects.equals(this.merchantInformation, inlineResponse2017EmbeddedTransactionSummaries.merchantInformation) &&
        Objects.equals(this.orderInformation, inlineResponse2017EmbeddedTransactionSummaries.orderInformation) &&
        Objects.equals(this.paymentInformation, inlineResponse2017EmbeddedTransactionSummaries.paymentInformation) &&
        Objects.equals(this.processingInformation, inlineResponse2017EmbeddedTransactionSummaries.processingInformation) &&
        Objects.equals(this.processorInformation, inlineResponse2017EmbeddedTransactionSummaries.processorInformation) &&
        Objects.equals(this.pointOfSaleInformation, inlineResponse2017EmbeddedTransactionSummaries.pointOfSaleInformation) &&
        Objects.equals(this.riskInformation, inlineResponse2017EmbeddedTransactionSummaries.riskInformation) &&
        Objects.equals(this.links, inlineResponse2017EmbeddedTransactionSummaries.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, submitTimeUtc, merchantId, applicationInformation, buyerInformation, clientReferenceInformation, consumerAuthenticationInformation, deviceInformation, fraudMarkingInformation, merchantDefinedInformation, merchantInformation, orderInformation, paymentInformation, processingInformation, processorInformation, pointOfSaleInformation, riskInformation, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2017EmbeddedTransactionSummaries {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    applicationInformation: ").append(toIndentedString(applicationInformation)).append("\n");
    sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    consumerAuthenticationInformation: ").append(toIndentedString(consumerAuthenticationInformation)).append("\n");
    sb.append("    deviceInformation: ").append(toIndentedString(deviceInformation)).append("\n");
    sb.append("    fraudMarkingInformation: ").append(toIndentedString(fraudMarkingInformation)).append("\n");
    sb.append("    merchantDefinedInformation: ").append(toIndentedString(merchantDefinedInformation)).append("\n");
    sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    processorInformation: ").append(toIndentedString(processorInformation)).append("\n");
    sb.append("    pointOfSaleInformation: ").append(toIndentedString(pointOfSaleInformation)).append("\n");
    sb.append("    riskInformation: ").append(toIndentedString(riskInformation)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

