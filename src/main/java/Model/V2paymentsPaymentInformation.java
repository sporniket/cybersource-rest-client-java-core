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
 * V2paymentsPaymentInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class V2paymentsPaymentInformation {
  @SerializedName("card")
  private V2paymentsPaymentInformationCard card = null;

  @SerializedName("tokenizedCard")
  private V2paymentsPaymentInformationTokenizedCard tokenizedCard = null;

  @SerializedName("fluidData")
  private V2paymentsPaymentInformationFluidData fluidData = null;

  @SerializedName("customer")
  private V2paymentsPaymentInformationCustomer customer = null;

  public V2paymentsPaymentInformation card(V2paymentsPaymentInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public V2paymentsPaymentInformationCard getCard() {
    return card;
  }

  public void setCard(V2paymentsPaymentInformationCard card) {
    this.card = card;
  }

  public V2paymentsPaymentInformation tokenizedCard(V2paymentsPaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
    return this;
  }

   /**
   * Get tokenizedCard
   * @return tokenizedCard
  **/
  @ApiModelProperty(value = "")
  public V2paymentsPaymentInformationTokenizedCard getTokenizedCard() {
    return tokenizedCard;
  }

  public void setTokenizedCard(V2paymentsPaymentInformationTokenizedCard tokenizedCard) {
    this.tokenizedCard = tokenizedCard;
  }

  public V2paymentsPaymentInformation fluidData(V2paymentsPaymentInformationFluidData fluidData) {
    this.fluidData = fluidData;
    return this;
  }

   /**
   * Get fluidData
   * @return fluidData
  **/
  @ApiModelProperty(value = "")
  public V2paymentsPaymentInformationFluidData getFluidData() {
    return fluidData;
  }

  public void setFluidData(V2paymentsPaymentInformationFluidData fluidData) {
    this.fluidData = fluidData;
  }

  public V2paymentsPaymentInformation customer(V2paymentsPaymentInformationCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public V2paymentsPaymentInformationCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(V2paymentsPaymentInformationCustomer customer) {
    this.customer = customer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2paymentsPaymentInformation v2paymentsPaymentInformation = (V2paymentsPaymentInformation) o;
    return Objects.equals(this.card, v2paymentsPaymentInformation.card) &&
        Objects.equals(this.tokenizedCard, v2paymentsPaymentInformation.tokenizedCard) &&
        Objects.equals(this.fluidData, v2paymentsPaymentInformation.fluidData) &&
        Objects.equals(this.customer, v2paymentsPaymentInformation.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, tokenizedCard, fluidData, customer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2paymentsPaymentInformation {\n");
    
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    tokenizedCard: ").append(toIndentedString(tokenizedCard)).append("\n");
    sb.append("    fluidData: ").append(toIndentedString(fluidData)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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

