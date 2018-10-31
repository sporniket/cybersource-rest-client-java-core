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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * InlineResponse2002OrderInformationInvoiceDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class InlineResponse2002OrderInformationInvoiceDetails {
  @SerializedName("purchaseOrderNumber")
  private String purchaseOrderNumber = null;

  @SerializedName("purchaseOrderDate")
  private String purchaseOrderDate = null;

  @SerializedName("taxable")
  private Boolean taxable = null;

  @SerializedName("vatInvoiceReferenceNumber")
  private String vatInvoiceReferenceNumber = null;

  @SerializedName("commodityCode")
  private String commodityCode = null;

  @SerializedName("merchandiseCode")
  private BigDecimal merchandiseCode = null;

  @SerializedName("transactionAdviceAddendum")
  private List<V2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum> transactionAdviceAddendum = null;

  @SerializedName("level3TransmissionStatus")
  private Boolean level3TransmissionStatus = null;

  public InlineResponse2002OrderInformationInvoiceDetails purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * Value used by your customer to identify the order. This value is typically a purchase order number. CyberSource recommends that you do not populate the field with all zeros or nines.  For processor-specific information, see the user_po field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return purchaseOrderNumber Value used by your customer to identify the order.
  **/
  @ApiModelProperty(value = "Value used by your customer to identify the order. This value is typically a purchase order number. CyberSource recommends that you do not populate the field with all zeros or nines.  For processor-specific information, see the user_po field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public InlineResponse2002OrderInformationInvoiceDetails purchaseOrderDate(String purchaseOrderDate) {
    this.purchaseOrderDate = purchaseOrderDate;
    return this;
  }

   /**
   * Date the order was processed. For processor-specific information, see the purchaser_order_date field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return purchaseOrderDate Date the order was processed.
  **/
  @ApiModelProperty(value = "Date the order was processed. `Format: YYYY-MM-DD`.  For processor-specific information, see the purchaser_order_date field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getPurchaseOrderDate() {
    return purchaseOrderDate;
  }

  public void setPurchaseOrderDate(String purchaseOrderDate) {
    this.purchaseOrderDate = purchaseOrderDate;
  }

  public InlineResponse2002OrderInformationInvoiceDetails taxable(Boolean taxable) {
    this.taxable = taxable;
    return this;
  }

   /**
   * Flag that indicates whether an order is taxable. This value must be true if the sum of all _lineItems[].taxAmount_ values &gt; 0.  If you do not include any _lineItems[].taxAmount_ values in your request, CyberSource does not include _invoiceDetails.taxable_ in the data it sends to the processor.  For processor-specific information, see the tax_indicator field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return taxable Flag that indicates whether an order is taxable.
  **/
  @ApiModelProperty(value = "Flag that indicates whether an order is taxable. This value must be true if the sum of all _lineItems[].taxAmount_ values > 0.  If you do not include any _lineItems[].taxAmount_ values in your request, CyberSource does not include _invoiceDetails.taxable_ in the data it sends to the processor.  For processor-specific information, see the tax_indicator field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public Boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(Boolean taxable) {
    this.taxable = taxable;
  }

  public InlineResponse2002OrderInformationInvoiceDetails vatInvoiceReferenceNumber(String vatInvoiceReferenceNumber) {
    this.vatInvoiceReferenceNumber = vatInvoiceReferenceNumber;
    return this;
  }

   /**
   * VAT invoice number associated with the transaction.  For processor-specific information, see the vat_invoice_ref_number field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return vatInvoiceReferenceNumber  VAT invoice number associated with the transaction.
  **/
  @ApiModelProperty(value = "VAT invoice number associated with the transaction.  For processor-specific information, see the vat_invoice_ref_number field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getVatInvoiceReferenceNumber() {
    return vatInvoiceReferenceNumber;
  }

  public void setVatInvoiceReferenceNumber(String vatInvoiceReferenceNumber) {
    this.vatInvoiceReferenceNumber = vatInvoiceReferenceNumber;
  }

  public InlineResponse2002OrderInformationInvoiceDetails commodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
    return this;
  }

   /**
   * International description code of the overall ordered goods or services or the Categorizes purchases for VAT reporting. Contact your acquirer for a list of codes.  For processor-specific information, see the summary_commodity_code field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return commodityCode International description code.
  **/
  @ApiModelProperty(value = "International description code of the overall ordered goods or services or the Categorizes purchases for VAT reporting. Contact your acquirer for a list of codes.  For processor-specific information, see the summary_commodity_code field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getCommodityCode() {
    return commodityCode;
  }

  public void setCommodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
  }

  public InlineResponse2002OrderInformationInvoiceDetails merchandiseCode(BigDecimal merchandiseCode) {
    this.merchandiseCode = merchandiseCode;
    return this;
  }

   /**
   * Identifier for the merchandise. Possible value:   - 1000: Gift card  This field is supported only for **American Express Direct**. 
   * @return merchandiseCode Identifier for the merchandise.
  **/
  @ApiModelProperty(value = "Identifier for the merchandise. Possible value:   - 1000: Gift card  This field is supported only for **American Express Direct**. ")
  public BigDecimal getMerchandiseCode() {
    return merchandiseCode;
  }

  public void setMerchandiseCode(BigDecimal merchandiseCode) {
    this.merchandiseCode = merchandiseCode;
  }

  public InlineResponse2002OrderInformationInvoiceDetails transactionAdviceAddendum(List<V2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum> transactionAdviceAddendum) {
    this.transactionAdviceAddendum = transactionAdviceAddendum;
    return this;
  }

  public InlineResponse2002OrderInformationInvoiceDetails addTransactionAdviceAddendumItem(V2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum transactionAdviceAddendumItem) {
    if (this.transactionAdviceAddendum == null) {
      this.transactionAdviceAddendum = new ArrayList<V2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum>();
    }
    this.transactionAdviceAddendum.add(transactionAdviceAddendumItem);
    return this;
  }

   /**
   * Get transactionAdviceAddendum
   * @return transactionAdviceAddendum Transaction Advice Addendum.
  **/
  @ApiModelProperty(value = "")
  public List<V2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum> getTransactionAdviceAddendum() {
    return transactionAdviceAddendum;
  }

  public void setTransactionAdviceAddendum(List<V2paymentsOrderInformationInvoiceDetailsTransactionAdviceAddendum> transactionAdviceAddendum) {
    this.transactionAdviceAddendum = transactionAdviceAddendum;
  }

  public InlineResponse2002OrderInformationInvoiceDetails level3TransmissionStatus(Boolean level3TransmissionStatus) {
    this.level3TransmissionStatus = level3TransmissionStatus;
    return this;
  }

   /**
   * Indicates whether CyberSource sent the Level III information to the processor. The possible values are:  If your account is not enabled for Level III data or if you did not include the purchasing level field in your request, CyberSource does not include the Level III data in the request sent to the processor.  For processor-specific information, see the bill_purchasing_level3_enabled field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return level3TransmissionStatus Indicates whether CyberSource sent the Level III information to the processor.
  **/
  @ApiModelProperty(value = "Indicates whether CyberSource sent the Level III information to the processor. The possible values are:  If your account is not enabled for Level III data or if you did not include the purchasing level field in your request, CyberSource does not include the Level III data in the request sent to the processor.  For processor-specific information, see the bill_purchasing_level3_enabled field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public Boolean getLevel3TransmissionStatus() {
    return level3TransmissionStatus;
  }

  public void setLevel3TransmissionStatus(Boolean level3TransmissionStatus) {
    this.level3TransmissionStatus = level3TransmissionStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002OrderInformationInvoiceDetails inlineResponse2002OrderInformationInvoiceDetails = (InlineResponse2002OrderInformationInvoiceDetails) o;
    return Objects.equals(this.purchaseOrderNumber, inlineResponse2002OrderInformationInvoiceDetails.purchaseOrderNumber) &&
        Objects.equals(this.purchaseOrderDate, inlineResponse2002OrderInformationInvoiceDetails.purchaseOrderDate) &&
        Objects.equals(this.taxable, inlineResponse2002OrderInformationInvoiceDetails.taxable) &&
        Objects.equals(this.vatInvoiceReferenceNumber, inlineResponse2002OrderInformationInvoiceDetails.vatInvoiceReferenceNumber) &&
        Objects.equals(this.commodityCode, inlineResponse2002OrderInformationInvoiceDetails.commodityCode) &&
        Objects.equals(this.merchandiseCode, inlineResponse2002OrderInformationInvoiceDetails.merchandiseCode) &&
        Objects.equals(this.transactionAdviceAddendum, inlineResponse2002OrderInformationInvoiceDetails.transactionAdviceAddendum) &&
        Objects.equals(this.level3TransmissionStatus, inlineResponse2002OrderInformationInvoiceDetails.level3TransmissionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseOrderNumber, purchaseOrderDate, taxable, vatInvoiceReferenceNumber, commodityCode, merchandiseCode, transactionAdviceAddendum, level3TransmissionStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002OrderInformationInvoiceDetails {\n");
    
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    purchaseOrderDate: ").append(toIndentedString(purchaseOrderDate)).append("\n");
    sb.append("    taxable: ").append(toIndentedString(taxable)).append("\n");
    sb.append("    vatInvoiceReferenceNumber: ").append(toIndentedString(vatInvoiceReferenceNumber)).append("\n");
    sb.append("    commodityCode: ").append(toIndentedString(commodityCode)).append("\n");
    sb.append("    merchandiseCode: ").append(toIndentedString(merchandiseCode)).append("\n");
    sb.append("    transactionAdviceAddendum: ").append(toIndentedString(transactionAdviceAddendum)).append("\n");
    sb.append("    level3TransmissionStatus: ").append(toIndentedString(level3TransmissionStatus)).append("\n");
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

