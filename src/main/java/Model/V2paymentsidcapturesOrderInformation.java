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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * V2paymentsidcapturesOrderInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class V2paymentsidcapturesOrderInformation {
  @SerializedName("amountDetails")
  private V2paymentsidcapturesOrderInformationAmountDetails amountDetails = null;

  @SerializedName("billTo")
  private V2paymentsidcapturesOrderInformationBillTo billTo = null;

  @SerializedName("shipTo")
  private V2paymentsidcapturesOrderInformationShipTo shipTo = null;

  @SerializedName("lineItems")
  private List<V2paymentsOrderInformationLineItems> lineItems = null;

  @SerializedName("invoiceDetails")
  private V2paymentsidcapturesOrderInformationInvoiceDetails invoiceDetails = null;

  @SerializedName("shippingDetails")
  private V2paymentsidcapturesOrderInformationShippingDetails shippingDetails = null;

  public V2paymentsidcapturesOrderInformation amountDetails(V2paymentsidcapturesOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public V2paymentsidcapturesOrderInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(V2paymentsidcapturesOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }

  public V2paymentsidcapturesOrderInformation billTo(V2paymentsidcapturesOrderInformationBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public V2paymentsidcapturesOrderInformationBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(V2paymentsidcapturesOrderInformationBillTo billTo) {
    this.billTo = billTo;
  }

  public V2paymentsidcapturesOrderInformation shipTo(V2paymentsidcapturesOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @ApiModelProperty(value = "")
  public V2paymentsidcapturesOrderInformationShipTo getShipTo() {
    return shipTo;
  }

  public void setShipTo(V2paymentsidcapturesOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
  }

  public V2paymentsidcapturesOrderInformation lineItems(List<V2paymentsOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public V2paymentsidcapturesOrderInformation addLineItemsItem(V2paymentsOrderInformationLineItems lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<V2paymentsOrderInformationLineItems>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Get lineItems
   * @return lineItems
  **/
  @ApiModelProperty(value = "")
  public List<V2paymentsOrderInformationLineItems> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<V2paymentsOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
  }

  public V2paymentsidcapturesOrderInformation invoiceDetails(V2paymentsidcapturesOrderInformationInvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
    return this;
  }

   /**
   * Get invoiceDetails
   * @return invoiceDetails
  **/
  @ApiModelProperty(value = "")
  public V2paymentsidcapturesOrderInformationInvoiceDetails getInvoiceDetails() {
    return invoiceDetails;
  }

  public void setInvoiceDetails(V2paymentsidcapturesOrderInformationInvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
  }

  public V2paymentsidcapturesOrderInformation shippingDetails(V2paymentsidcapturesOrderInformationShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
    return this;
  }

   /**
   * Get shippingDetails
   * @return shippingDetails
  **/
  @ApiModelProperty(value = "")
  public V2paymentsidcapturesOrderInformationShippingDetails getShippingDetails() {
    return shippingDetails;
  }

  public void setShippingDetails(V2paymentsidcapturesOrderInformationShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2paymentsidcapturesOrderInformation v2paymentsidcapturesOrderInformation = (V2paymentsidcapturesOrderInformation) o;
    return Objects.equals(this.amountDetails, v2paymentsidcapturesOrderInformation.amountDetails) &&
        Objects.equals(this.billTo, v2paymentsidcapturesOrderInformation.billTo) &&
        Objects.equals(this.shipTo, v2paymentsidcapturesOrderInformation.shipTo) &&
        Objects.equals(this.lineItems, v2paymentsidcapturesOrderInformation.lineItems) &&
        Objects.equals(this.invoiceDetails, v2paymentsidcapturesOrderInformation.invoiceDetails) &&
        Objects.equals(this.shippingDetails, v2paymentsidcapturesOrderInformation.shippingDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDetails, billTo, shipTo, lineItems, invoiceDetails, shippingDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2paymentsidcapturesOrderInformation {\n");
    
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    invoiceDetails: ").append(toIndentedString(invoiceDetails)).append("\n");
    sb.append("    shippingDetails: ").append(toIndentedString(shippingDetails)).append("\n");
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

