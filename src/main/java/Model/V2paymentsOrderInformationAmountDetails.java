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
 * V2paymentsOrderInformationAmountDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class V2paymentsOrderInformationAmountDetails {
  @SerializedName("totalAmount")
  private String totalAmount = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("discountAmount")
  private String discountAmount = null;

  @SerializedName("dutyAmount")
  private String dutyAmount = null;

  @SerializedName("taxAmount")
  private String taxAmount = null;

  @SerializedName("nationalTaxIncluded")
  private String nationalTaxIncluded = null;

  @SerializedName("taxAppliedAfterDiscount")
  private String taxAppliedAfterDiscount = null;

  @SerializedName("taxAppliedLevel")
  private String taxAppliedLevel = null;

  @SerializedName("taxTypeCode")
  private String taxTypeCode = null;

  @SerializedName("freightAmount")
  private String freightAmount = null;

  @SerializedName("foreignAmount")
  private String foreignAmount = null;

  @SerializedName("foreignCurrency")
  private String foreignCurrency = null;

  @SerializedName("exchangeRate")
  private String exchangeRate = null;

  @SerializedName("exchangeRateTimeStamp")
  private String exchangeRateTimeStamp = null;

  @SerializedName("surcharge")
  private V2paymentsOrderInformationAmountDetailsSurcharge surcharge = null;

  @SerializedName("settlementAmount")
  private String settlementAmount = null;

  @SerializedName("settlementCurrency")
  private String settlementCurrency = null;

  @SerializedName("amexAdditionalAmounts")
  private List<V2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts> amexAdditionalAmounts = null;

  @SerializedName("taxDetails")
  private List<V2paymentsOrderInformationAmountDetailsTaxDetails> taxDetails = null;

  public V2paymentsOrderInformationAmountDetails totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Grand total for the order. You can include a decimal point (.), but no other special characters. CyberSource truncates the amount to the correct number of decimal places.  * CTV, FDCCompass, Paymentech (&lt;&#x3D; 12)  For processor-specific information, see the grand_total_amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return totalAmount
  **/
  @ApiModelProperty(value = "Grand total for the order. You can include a decimal point (.), but no other special characters. CyberSource truncates the amount to the correct number of decimal places.  * CTV, FDCCompass, Paymentech (<= 12)  For processor-specific information, see the grand_total_amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  public V2paymentsOrderInformationAmountDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency used for the order. Use the three-character ISO Standard Currency Codes.  For an authorization reversal or a capture, you must use the same currency that you used in your request for Payment API. 
   * @return currency
  **/
  @ApiModelProperty(value = "Currency used for the order. Use the three-character ISO Standard Currency Codes.  For an authorization reversal or a capture, you must use the same currency that you used in your request for Payment API. ")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public V2paymentsOrderInformationAmountDetails discountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Total discount amount applied to the order.  For processor-specific information, see the order_discount_amount field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return discountAmount
  **/
  @ApiModelProperty(value = "Total discount amount applied to the order.  For processor-specific information, see the order_discount_amount field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
  }

  public V2paymentsOrderInformationAmountDetails dutyAmount(String dutyAmount) {
    this.dutyAmount = dutyAmount;
    return this;
  }

   /**
   * Total charges for any import or export duties included in the order.  For processor-specific information, see the duty_amount field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return dutyAmount
  **/
  @ApiModelProperty(value = "Total charges for any import or export duties included in the order.  For processor-specific information, see the duty_amount field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getDutyAmount() {
    return dutyAmount;
  }

  public void setDutyAmount(String dutyAmount) {
    this.dutyAmount = dutyAmount;
  }

  public V2paymentsOrderInformationAmountDetails taxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Total tax amount for all the items in the order.  For processor-specific information, see the total_tax_amount field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return taxAmount
  **/
  @ApiModelProperty(value = "Total tax amount for all the items in the order.  For processor-specific information, see the total_tax_amount field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }

  public V2paymentsOrderInformationAmountDetails nationalTaxIncluded(String nationalTaxIncluded) {
    this.nationalTaxIncluded = nationalTaxIncluded;
    return this;
  }

   /**
   * Flag that indicates whether a national tax is included in the order total.  Possible values:   - **0**: national tax not included  - **1**: national tax included  For processor-specific information, see the national_tax_indicator field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return nationalTaxIncluded
  **/
  @ApiModelProperty(value = "Flag that indicates whether a national tax is included in the order total.  Possible values:   - **0**: national tax not included  - **1**: national tax included  For processor-specific information, see the national_tax_indicator field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getNationalTaxIncluded() {
    return nationalTaxIncluded;
  }

  public void setNationalTaxIncluded(String nationalTaxIncluded) {
    this.nationalTaxIncluded = nationalTaxIncluded;
  }

  public V2paymentsOrderInformationAmountDetails taxAppliedAfterDiscount(String taxAppliedAfterDiscount) {
    this.taxAppliedAfterDiscount = taxAppliedAfterDiscount;
    return this;
  }

   /**
   * Flag that indicates how the merchant manages discounts.  Possible values:   - **0**: no invoice level discount included  - **1**: tax calculated on the postdiscount invoice total  - **2**: tax calculated on the prediscount invoice total  For processor-specific information, see the order_discount_management_indicator field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return taxAppliedAfterDiscount
  **/
  @ApiModelProperty(value = "Flag that indicates how the merchant manages discounts.  Possible values:   - **0**: no invoice level discount included  - **1**: tax calculated on the postdiscount invoice total  - **2**: tax calculated on the prediscount invoice total  For processor-specific information, see the order_discount_management_indicator field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getTaxAppliedAfterDiscount() {
    return taxAppliedAfterDiscount;
  }

  public void setTaxAppliedAfterDiscount(String taxAppliedAfterDiscount) {
    this.taxAppliedAfterDiscount = taxAppliedAfterDiscount;
  }

  public V2paymentsOrderInformationAmountDetails taxAppliedLevel(String taxAppliedLevel) {
    this.taxAppliedLevel = taxAppliedLevel;
    return this;
  }

   /**
   * Flag that indicates how you calculate tax.  Possible values:   - **0**: net prices with tax calculated at line item level  - **1**: net prices with tax calculated at invoice level  - **2**: gross prices with tax provided at line item level  - **3**: gross prices with tax provided at invoice level  - **4**: no tax applies on the invoice for the transaction  For processor-specific information, see the tax_management_indicator field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return taxAppliedLevel
  **/
  @ApiModelProperty(value = "Flag that indicates how you calculate tax.  Possible values:   - **0**: net prices with tax calculated at line item level  - **1**: net prices with tax calculated at invoice level  - **2**: gross prices with tax provided at line item level  - **3**: gross prices with tax provided at invoice level  - **4**: no tax applies on the invoice for the transaction  For processor-specific information, see the tax_management_indicator field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getTaxAppliedLevel() {
    return taxAppliedLevel;
  }

  public void setTaxAppliedLevel(String taxAppliedLevel) {
    this.taxAppliedLevel = taxAppliedLevel;
  }

  public V2paymentsOrderInformationAmountDetails taxTypeCode(String taxTypeCode) {
    this.taxTypeCode = taxTypeCode;
    return this;
  }

   /**
   * For tax amounts that can be categorized as one tax type.  This field contains the tax type code that corresponds to the entry in the _lineItems.taxAmount_ field.  Possible values:   - **056**: sales tax (U.S only)  - **TX~**: all taxes (Canada only)   Note ~ &#x3D; space.  For processor-specific information, see the total_tax_type_code field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return taxTypeCode
  **/
  @ApiModelProperty(value = "For tax amounts that can be categorized as one tax type.  This field contains the tax type code that corresponds to the entry in the _lineItems.taxAmount_ field.  Possible values:   - **056**: sales tax (U.S only)  - **TX~**: all taxes (Canada only)   Note ~ = space.  For processor-specific information, see the total_tax_type_code field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getTaxTypeCode() {
    return taxTypeCode;
  }

  public void setTaxTypeCode(String taxTypeCode) {
    this.taxTypeCode = taxTypeCode;
  }

  public V2paymentsOrderInformationAmountDetails freightAmount(String freightAmount) {
    this.freightAmount = freightAmount;
    return this;
  }

   /**
   * Total freight or shipping and handling charges for the order. When you include this field in your request, you must also include the **totalAmount** field.  For processor-specific information, see the freight_amount field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) 
   * @return freightAmount
  **/
  @ApiModelProperty(value = "Total freight or shipping and handling charges for the order. When you include this field in your request, you must also include the **totalAmount** field.  For processor-specific information, see the freight_amount field in [Level II and Level III Processing Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/Level_2_3_SCMP_API/html) ")
  public String getFreightAmount() {
    return freightAmount;
  }

  public void setFreightAmount(String freightAmount) {
    this.freightAmount = freightAmount;
  }

  public V2paymentsOrderInformationAmountDetails foreignAmount(String foreignAmount) {
    this.foreignAmount = foreignAmount;
    return this;
  }

   /**
   * Converted amount returned by the DCC service.  For processor-specific information, see the foreign_amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return foreignAmount
  **/
  @ApiModelProperty(value = "Converted amount returned by the DCC service.  For processor-specific information, see the foreign_amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getForeignAmount() {
    return foreignAmount;
  }

  public void setForeignAmount(String foreignAmount) {
    this.foreignAmount = foreignAmount;
  }

  public V2paymentsOrderInformationAmountDetails foreignCurrency(String foreignCurrency) {
    this.foreignCurrency = foreignCurrency;
    return this;
  }

   /**
   * Billing currency returned by the DCC service.  For processor-specific information, see the foreign_currency field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return foreignCurrency
  **/
  @ApiModelProperty(value = "Billing currency returned by the DCC service.  For processor-specific information, see the foreign_currency field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getForeignCurrency() {
    return foreignCurrency;
  }

  public void setForeignCurrency(String foreignCurrency) {
    this.foreignCurrency = foreignCurrency;
  }

  public V2paymentsOrderInformationAmountDetails exchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * Exchange rate returned by the DCC service. Includes a decimal point and a maximum of 4 decimal places.  For processor-specific information, see the exchange_rate field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return exchangeRate
  **/
  @ApiModelProperty(value = "Exchange rate returned by the DCC service. Includes a decimal point and a maximum of 4 decimal places.  For processor-specific information, see the exchange_rate field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public V2paymentsOrderInformationAmountDetails exchangeRateTimeStamp(String exchangeRateTimeStamp) {
    this.exchangeRateTimeStamp = exchangeRateTimeStamp;
    return this;
  }

   /**
   * Time stamp for the exchange rate. This value is returned by the DCC service.  Format: &#x60;YYYYMMDD~HH:MM&#x60;  where ~ denotes a space.  For processor-specific information, see the exchange_rate_timestamp field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) 
   * @return exchangeRateTimeStamp
  **/
  @ApiModelProperty(value = "Time stamp for the exchange rate. This value is returned by the DCC service.  Format: `YYYYMMDD~HH:MM`  where ~ denotes a space.  For processor-specific information, see the exchange_rate_timestamp field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html) ")
  public String getExchangeRateTimeStamp() {
    return exchangeRateTimeStamp;
  }

  public void setExchangeRateTimeStamp(String exchangeRateTimeStamp) {
    this.exchangeRateTimeStamp = exchangeRateTimeStamp;
  }

  public V2paymentsOrderInformationAmountDetails surcharge(V2paymentsOrderInformationAmountDetailsSurcharge surcharge) {
    this.surcharge = surcharge;
    return this;
  }

   /**
   * Get surcharge
   * @return surcharge
  **/
  @ApiModelProperty(value = "")
  public V2paymentsOrderInformationAmountDetailsSurcharge getSurcharge() {
    return surcharge;
  }

  public void setSurcharge(V2paymentsOrderInformationAmountDetailsSurcharge surcharge) {
    this.surcharge = surcharge;
  }

  public V2paymentsOrderInformationAmountDetails settlementAmount(String settlementAmount) {
    this.settlementAmount = settlementAmount;
    return this;
  }

   /**
   * This is a multicurrency field. It contains the transaction amount (field 4), converted to the Currency used to bill the cardholderâ€™s account. 
   * @return settlementAmount
  **/
  @ApiModelProperty(value = "This is a multicurrency field. It contains the transaction amount (field 4), converted to the Currency used to bill the cardholderâ€™s account. ")
  public String getSettlementAmount() {
    return settlementAmount;
  }

  public void setSettlementAmount(String settlementAmount) {
    this.settlementAmount = settlementAmount;
  }

  public V2paymentsOrderInformationAmountDetails settlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
    return this;
  }

   /**
   * This is a multicurrency-only field. It contains a 3-digit numeric code that identifies the currency used by the issuer to bill the cardholder&#39;s account. 
   * @return settlementCurrency
  **/
  @ApiModelProperty(value = "This is a multicurrency-only field. It contains a 3-digit numeric code that identifies the currency used by the issuer to bill the cardholder's account. ")
  public String getSettlementCurrency() {
    return settlementCurrency;
  }

  public void setSettlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
  }

  public V2paymentsOrderInformationAmountDetails amexAdditionalAmounts(List<V2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts> amexAdditionalAmounts) {
    this.amexAdditionalAmounts = amexAdditionalAmounts;
    return this;
  }

  public V2paymentsOrderInformationAmountDetails addAmexAdditionalAmountsItem(V2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts amexAdditionalAmountsItem) {
    if (this.amexAdditionalAmounts == null) {
      this.amexAdditionalAmounts = new ArrayList<V2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts>();
    }
    this.amexAdditionalAmounts.add(amexAdditionalAmountsItem);
    return this;
  }

   /**
   * Get amexAdditionalAmounts
   * @return amexAdditionalAmounts
  **/
  @ApiModelProperty(value = "")
  public List<V2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts> getAmexAdditionalAmounts() {
    return amexAdditionalAmounts;
  }

  public void setAmexAdditionalAmounts(List<V2paymentsOrderInformationAmountDetailsAmexAdditionalAmounts> amexAdditionalAmounts) {
    this.amexAdditionalAmounts = amexAdditionalAmounts;
  }

  public V2paymentsOrderInformationAmountDetails taxDetails(List<V2paymentsOrderInformationAmountDetailsTaxDetails> taxDetails) {
    this.taxDetails = taxDetails;
    return this;
  }

  public V2paymentsOrderInformationAmountDetails addTaxDetailsItem(V2paymentsOrderInformationAmountDetailsTaxDetails taxDetailsItem) {
    if (this.taxDetails == null) {
      this.taxDetails = new ArrayList<V2paymentsOrderInformationAmountDetailsTaxDetails>();
    }
    this.taxDetails.add(taxDetailsItem);
    return this;
  }

   /**
   * Get taxDetails
   * @return taxDetails
  **/
  @ApiModelProperty(value = "")
  public List<V2paymentsOrderInformationAmountDetailsTaxDetails> getTaxDetails() {
    return taxDetails;
  }

  public void setTaxDetails(List<V2paymentsOrderInformationAmountDetailsTaxDetails> taxDetails) {
    this.taxDetails = taxDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2paymentsOrderInformationAmountDetails v2paymentsOrderInformationAmountDetails = (V2paymentsOrderInformationAmountDetails) o;
    return Objects.equals(this.totalAmount, v2paymentsOrderInformationAmountDetails.totalAmount) &&
        Objects.equals(this.currency, v2paymentsOrderInformationAmountDetails.currency) &&
        Objects.equals(this.discountAmount, v2paymentsOrderInformationAmountDetails.discountAmount) &&
        Objects.equals(this.dutyAmount, v2paymentsOrderInformationAmountDetails.dutyAmount) &&
        Objects.equals(this.taxAmount, v2paymentsOrderInformationAmountDetails.taxAmount) &&
        Objects.equals(this.nationalTaxIncluded, v2paymentsOrderInformationAmountDetails.nationalTaxIncluded) &&
        Objects.equals(this.taxAppliedAfterDiscount, v2paymentsOrderInformationAmountDetails.taxAppliedAfterDiscount) &&
        Objects.equals(this.taxAppliedLevel, v2paymentsOrderInformationAmountDetails.taxAppliedLevel) &&
        Objects.equals(this.taxTypeCode, v2paymentsOrderInformationAmountDetails.taxTypeCode) &&
        Objects.equals(this.freightAmount, v2paymentsOrderInformationAmountDetails.freightAmount) &&
        Objects.equals(this.foreignAmount, v2paymentsOrderInformationAmountDetails.foreignAmount) &&
        Objects.equals(this.foreignCurrency, v2paymentsOrderInformationAmountDetails.foreignCurrency) &&
        Objects.equals(this.exchangeRate, v2paymentsOrderInformationAmountDetails.exchangeRate) &&
        Objects.equals(this.exchangeRateTimeStamp, v2paymentsOrderInformationAmountDetails.exchangeRateTimeStamp) &&
        Objects.equals(this.surcharge, v2paymentsOrderInformationAmountDetails.surcharge) &&
        Objects.equals(this.settlementAmount, v2paymentsOrderInformationAmountDetails.settlementAmount) &&
        Objects.equals(this.settlementCurrency, v2paymentsOrderInformationAmountDetails.settlementCurrency) &&
        Objects.equals(this.amexAdditionalAmounts, v2paymentsOrderInformationAmountDetails.amexAdditionalAmounts) &&
        Objects.equals(this.taxDetails, v2paymentsOrderInformationAmountDetails.taxDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, currency, discountAmount, dutyAmount, taxAmount, nationalTaxIncluded, taxAppliedAfterDiscount, taxAppliedLevel, taxTypeCode, freightAmount, foreignAmount, foreignCurrency, exchangeRate, exchangeRateTimeStamp, surcharge, settlementAmount, settlementCurrency, amexAdditionalAmounts, taxDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2paymentsOrderInformationAmountDetails {\n");
    
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    dutyAmount: ").append(toIndentedString(dutyAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    nationalTaxIncluded: ").append(toIndentedString(nationalTaxIncluded)).append("\n");
    sb.append("    taxAppliedAfterDiscount: ").append(toIndentedString(taxAppliedAfterDiscount)).append("\n");
    sb.append("    taxAppliedLevel: ").append(toIndentedString(taxAppliedLevel)).append("\n");
    sb.append("    taxTypeCode: ").append(toIndentedString(taxTypeCode)).append("\n");
    sb.append("    freightAmount: ").append(toIndentedString(freightAmount)).append("\n");
    sb.append("    foreignAmount: ").append(toIndentedString(foreignAmount)).append("\n");
    sb.append("    foreignCurrency: ").append(toIndentedString(foreignCurrency)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    exchangeRateTimeStamp: ").append(toIndentedString(exchangeRateTimeStamp)).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
    sb.append("    settlementAmount: ").append(toIndentedString(settlementAmount)).append("\n");
    sb.append("    settlementCurrency: ").append(toIndentedString(settlementCurrency)).append("\n");
    sb.append("    amexAdditionalAmounts: ").append(toIndentedString(amexAdditionalAmounts)).append("\n");
    sb.append("    taxDetails: ").append(toIndentedString(taxDetails)).append("\n");
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

