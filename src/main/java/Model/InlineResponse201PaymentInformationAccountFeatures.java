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

/**
 * InlineResponse201PaymentInformationAccountFeatures
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-31T18:13:53.731+05:30")
public class InlineResponse201PaymentInformationAccountFeatures {
  @SerializedName("accountType")
  private String accountType = null;

  @SerializedName("accountStatus")
  private String accountStatus = null;

  @SerializedName("balanceAmount")
  private String balanceAmount = null;

  @SerializedName("balanceAmountType")
  private String balanceAmountType = null;

  @SerializedName("currency")
  private String currency = null;

  /**
   * Sign for the remaining balance on the account. Returned only when the processor returns this value. Possible values: 
   */
  @JsonAdapter(BalanceSignEnum.Adapter.class)
  public enum BalanceSignEnum {
    PLUS("+"),
    
    MINUS("-");

    private String value;

    BalanceSignEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BalanceSignEnum fromValue(String text) {
      for (BalanceSignEnum b : BalanceSignEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BalanceSignEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BalanceSignEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BalanceSignEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BalanceSignEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("balanceSign")
  private BalanceSignEnum balanceSign = null;

  @SerializedName("affluenceIndicator")
  private String affluenceIndicator = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("commercial")
  private String commercial = null;

  @SerializedName("group")
  private String group = null;

  @SerializedName("healthCare")
  private String healthCare = null;

  @SerializedName("payroll")
  private String payroll = null;

  @SerializedName("level3Eligible")
  private String level3Eligible = null;

  @SerializedName("pinlessDebit")
  private String pinlessDebit = null;

  @SerializedName("signatureDebit")
  private String signatureDebit = null;

  @SerializedName("prepaid")
  private String prepaid = null;

  @SerializedName("regulated")
  private String regulated = null;

  public InlineResponse201PaymentInformationAccountFeatures accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Type of account. This value is returned only if you requested a balance inquiry. Possible values:   - **00**: Not applicable or not specified  - **10**: Savings account  - **20**: Checking account  - **30**: Credit card account  - **40**: Universal account 
   * @return accountType
  **/
  @ApiModelProperty(value = "Type of account. This value is returned only if you requested a balance inquiry. Possible values:   - **00**: Not applicable or not specified  - **10**: Savings account  - **20**: Checking account  - **30**: Credit card account  - **40**: Universal account ")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public InlineResponse201PaymentInformationAccountFeatures accountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * Possible values:   - **N**: Nonregulated  - **R**: Regulated  &#x60;Note&#x60; This field is returned only for CyberSource through VisaNet. 
   * @return accountStatus
  **/
  @ApiModelProperty(value = "Possible values:   - **N**: Nonregulated  - **R**: Regulated  `Note` This field is returned only for CyberSource through VisaNet. ")
  public String getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }

  public InlineResponse201PaymentInformationAccountFeatures balanceAmount(String balanceAmount) {
    this.balanceAmount = balanceAmount;
    return this;
  }

   /**
   * Remaining balance on the account. 
   * @return balanceAmount
  **/
  @ApiModelProperty(value = "Remaining balance on the account. ")
  public String getBalanceAmount() {
    return balanceAmount;
  }

  public void setBalanceAmount(String balanceAmount) {
    this.balanceAmount = balanceAmount;
  }

  public InlineResponse201PaymentInformationAccountFeatures balanceAmountType(String balanceAmountType) {
    this.balanceAmountType = balanceAmountType;
    return this;
  }

   /**
   * Type of amount. This value is returned only if you requested a balance inquiry. The issuer determines the value that is returned. Possible values for deposit accounts:   - **01**: Current ledger (posted) balance.  - **02**: Current available balance, which is typically the ledger balance less outstanding authorizations.  Some depository institutions also include pending deposits and the credit or overdraft line associated with the account. Possible values for credit card accounts:   - **01**: Credit amount remaining for customer (open to buy).  - **02**: Credit limit. 
   * @return balanceAmountType
  **/
  @ApiModelProperty(value = "Type of amount. This value is returned only if you requested a balance inquiry. The issuer determines the value that is returned. Possible values for deposit accounts:   - **01**: Current ledger (posted) balance.  - **02**: Current available balance, which is typically the ledger balance less outstanding authorizations.  Some depository institutions also include pending deposits and the credit or overdraft line associated with the account. Possible values for credit card accounts:   - **01**: Credit amount remaining for customer (open to buy).  - **02**: Credit limit. ")
  public String getBalanceAmountType() {
    return balanceAmountType;
  }

  public void setBalanceAmountType(String balanceAmountType) {
    this.balanceAmountType = balanceAmountType;
  }

  public InlineResponse201PaymentInformationAccountFeatures currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency of the remaining balance on the account. For the possible values, see the ISO Standard Currency Codes. 
   * @return currency
  **/
  @ApiModelProperty(value = "Currency of the remaining balance on the account. For the possible values, see the ISO Standard Currency Codes. ")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public InlineResponse201PaymentInformationAccountFeatures balanceSign(BalanceSignEnum balanceSign) {
    this.balanceSign = balanceSign;
    return this;
  }

   /**
   * Sign for the remaining balance on the account. Returned only when the processor returns this value. Possible values: 
   * @return balanceSign
  **/
  @ApiModelProperty(value = "Sign for the remaining balance on the account. Returned only when the processor returns this value. Possible values: ")
  public BalanceSignEnum getBalanceSign() {
    return balanceSign;
  }

  public void setBalanceSign(BalanceSignEnum balanceSign) {
    this.balanceSign = balanceSign;
  }

  public InlineResponse201PaymentInformationAccountFeatures affluenceIndicator(String affluenceIndicator) {
    this.affluenceIndicator = affluenceIndicator;
    return this;
  }

   /**
   * **Chase Paymentech Solutions**  Indicates whether a customer has high credit limits. This information enables you to market high cost items to these customers and to understand the kinds of cards that high income customers are using.  This field is supported for Visa, Mastercard, Discover, and Diners Club. Possible values:   - **Y**: Yes  - **N**: No  - **X**: Not applicable / Unknown  **Litle**  Flag that indicates that a Visa cardholder or Mastercard cardholder is in one of the affluent categories. Possible values:   - **AFFLUENT**: High income customer with high spending pattern (&gt;100k USD annual income and &gt;40k USD annual    card usage).  - **MASS AFFLUENT**: High income customer (&gt;100k USD annual income).  **Processor specific maximum length**:   - Chase Paymentech Solutions: 1  - Litle: 13 
   * @return affluenceIndicator
  **/
  @ApiModelProperty(value = "**Chase Paymentech Solutions**  Indicates whether a customer has high credit limits. This information enables you to market high cost items to these customers and to understand the kinds of cards that high income customers are using.  This field is supported for Visa, Mastercard, Discover, and Diners Club. Possible values:   - **Y**: Yes  - **N**: No  - **X**: Not applicable / Unknown  **Litle**  Flag that indicates that a Visa cardholder or Mastercard cardholder is in one of the affluent categories. Possible values:   - **AFFLUENT**: High income customer with high spending pattern (>100k USD annual income and >40k USD annual    card usage).  - **MASS AFFLUENT**: High income customer (>100k USD annual income).  **Processor specific maximum length**:   - Chase Paymentech Solutions: 1  - Litle: 13 ")
  public String getAffluenceIndicator() {
    return affluenceIndicator;
  }

  public void setAffluenceIndicator(String affluenceIndicator) {
    this.affluenceIndicator = affluenceIndicator;
  }

  public InlineResponse201PaymentInformationAccountFeatures category(String category) {
    this.category = category;
    return this;
  }

   /**
   * **CyberSource through VisaNet**  Visa product ID.  **GPN**  Visa or Mastercard product ID.  **Litle**  Type of card used in the transaction. The only possible value is:   - PREPAID: Prepaid Card  **RBS WorldPay Atlanta**  Type of card used in the transaction. Possible values:   - **B**: Business Card  - **O**: Noncommercial Card  - **R**: Corporate Card  - **S**: Purchase Card  - **Blank**: Purchase card not supported  **Maximum length for processors**:   - CyberSource through VisaNet: 3  - GPN: 3  - Litle: 7  - RBS WorldPay Atlanta: 1 
   * @return category
  **/
  @ApiModelProperty(value = "**CyberSource through VisaNet**  Visa product ID.  **GPN**  Visa or Mastercard product ID.  **Litle**  Type of card used in the transaction. The only possible value is:   - PREPAID: Prepaid Card  **RBS WorldPay Atlanta**  Type of card used in the transaction. Possible values:   - **B**: Business Card  - **O**: Noncommercial Card  - **R**: Corporate Card  - **S**: Purchase Card  - **Blank**: Purchase card not supported  **Maximum length for processors**:   - CyberSource through VisaNet: 3  - GPN: 3  - Litle: 7  - RBS WorldPay Atlanta: 1 ")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public InlineResponse201PaymentInformationAccountFeatures commercial(String commercial) {
    this.commercial = commercial;
    return this;
  }

   /**
   * Indicates whether the card is a commercial card, which enables you to include Level II data in your transaction requests. This field is supported for Visa and Mastercard on **Chase Paymentech Solutions**. Possible values:   - **Y**: Yes  - **N**: No  - **X**: Not applicable / Unknown 
   * @return commercial
  **/
  @ApiModelProperty(value = "Indicates whether the card is a commercial card, which enables you to include Level II data in your transaction requests. This field is supported for Visa and Mastercard on **Chase Paymentech Solutions**. Possible values:   - **Y**: Yes  - **N**: No  - **X**: Not applicable / Unknown ")
  public String getCommercial() {
    return commercial;
  }

  public void setCommercial(String commercial) {
    this.commercial = commercial;
  }

  public InlineResponse201PaymentInformationAccountFeatures group(String group) {
    this.group = group;
    return this;
  }

   /**
   * Type of commercial card. This field is supported only for CyberSource through VisaNet. Possible values:   - **B**: Business card  - **R**: Corporate card  - **S**: Purchasing card  - **0**: Noncommercial card 
   * @return group
  **/
  @ApiModelProperty(value = "Type of commercial card. This field is supported only for CyberSource through VisaNet. Possible values:   - **B**: Business card  - **R**: Corporate card  - **S**: Purchasing card  - **0**: Noncommercial card ")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public InlineResponse201PaymentInformationAccountFeatures healthCare(String healthCare) {
    this.healthCare = healthCare;
    return this;
  }

   /**
   * Indicates whether the card is a healthcare card. This field is supported for Visa and Mastercard on **Chase Paymentech Solutions**. Possible values:   - **Y**: Yes  - **N**: No  - **X**: Not applicable / Unknown 
   * @return healthCare
  **/
  @ApiModelProperty(value = "Indicates whether the card is a healthcare card. This field is supported for Visa and Mastercard on **Chase Paymentech Solutions**. Possible values:   - **Y**: Yes  - **N**: No  - **X**: Not applicable / Unknown ")
  public String getHealthCare() {
    return healthCare;
  }

  public void setHealthCare(String healthCare) {
    this.healthCare = healthCare;
  }

  public InlineResponse201PaymentInformationAccountFeatures payroll(String payroll) {
    this.payroll = payroll;
    return this;
  }

   /**
   * Indicates whether the card is a payroll card. This field is supported for Visa, Discover, Diners Club, and JCB on **Chase Paymentech Solutions**. Possible values:   - **Y**: Yes  - **N**: No  - **X**: Not applicable / Unknown 
   * @return payroll
  **/
  @ApiModelProperty(value = "Indicates whether the card is a payroll card. This field is supported for Visa, Discover, Diners Club, and JCB on **Chase Paymentech Solutions**. Possible values:   - **Y**: Yes  - **N**: No  - **X**: Not applicable / Unknown ")
  public String getPayroll() {
    return payroll;
  }

  public void setPayroll(String payroll) {
    this.payroll = payroll;
  }

  public InlineResponse201PaymentInformationAccountFeatures level3Eligible(String level3Eligible) {
    this.level3Eligible = level3Eligible;
    return this;
  }

   /**
   * Indicates whether the card is eligible for Level III interchange fees, which enables you to include Level III data in your transaction requests. This field is supported for Visa and Mastercard on **Chase Paymentech Solutions**. Possible values:   - **Y**: Yes  - **N**: No  - **X**: Not applicable / Unknown 
   * @return level3Eligible
  **/
  @ApiModelProperty(value = "Indicates whether the card is eligible for Level III interchange fees, which enables you to include Level III data in your transaction requests. This field is supported for Visa and Mastercard on **Chase Paymentech Solutions**. Possible values:   - **Y**: Yes  - **N**: No  - **X**: Not applicable / Unknown ")
  public String getLevel3Eligible() {
    return level3Eligible;
  }

  public void setLevel3Eligible(String level3Eligible) {
    this.level3Eligible = level3Eligible;
  }

  public InlineResponse201PaymentInformationAccountFeatures pinlessDebit(String pinlessDebit) {
    this.pinlessDebit = pinlessDebit;
    return this;
  }

   /**
   * Indicates whether the card is a PINless debit card. This field is supported for Visa and Mastercard on **Chase Paymentech Solutions**. Possible values:   - **Y**: Yes  - **N**: No  - **X**: Not applicable / Unknown 
   * @return pinlessDebit
  **/
  @ApiModelProperty(value = "Indicates whether the card is a PINless debit card. This field is supported for Visa and Mastercard on **Chase Paymentech Solutions**. Possible values:   - **Y**: Yes  - **N**: No  - **X**: Not applicable / Unknown ")
  public String getPinlessDebit() {
    return pinlessDebit;
  }

  public void setPinlessDebit(String pinlessDebit) {
    this.pinlessDebit = pinlessDebit;
  }

  public InlineResponse201PaymentInformationAccountFeatures signatureDebit(String signatureDebit) {
    this.signatureDebit = signatureDebit;
    return this;
  }

   /**
   * Indicates whether the card is a signature debit card. This information enables you to alter the way an order is processed. For example, you might not want to reauthorize a transaction for a signature debit card, or you might want to perform reversals promptly for a signature debit card. This field is supported for Visa, Mastercard, and Maestro (International) on Chase Paymentech Solutions. Possible values:   - **Y**: Yes  - **N**: No  - **X**: Not applicable / Unknown 
   * @return signatureDebit
  **/
  @ApiModelProperty(value = "Indicates whether the card is a signature debit card. This information enables you to alter the way an order is processed. For example, you might not want to reauthorize a transaction for a signature debit card, or you might want to perform reversals promptly for a signature debit card. This field is supported for Visa, Mastercard, and Maestro (International) on Chase Paymentech Solutions. Possible values:   - **Y**: Yes  - **N**: No  - **X**: Not applicable / Unknown ")
  public String getSignatureDebit() {
    return signatureDebit;
  }

  public void setSignatureDebit(String signatureDebit) {
    this.signatureDebit = signatureDebit;
  }

  public InlineResponse201PaymentInformationAccountFeatures prepaid(String prepaid) {
    this.prepaid = prepaid;
    return this;
  }

   /**
   * Indicates whether the card is a prepaid card. This information enables you to determine when a gift card or prepaid card is presented for use when establishing a new recurring, installment, or deferred billing relationship.  This field is supported for Visa, Mastercard, Discover, Diners Club, and JCB on Chase Paymentech Solutions. Possible values:   - **Y**: Yes  - **N**: No  - **X**: Not applicable / Unknown 
   * @return prepaid
  **/
  @ApiModelProperty(value = "Indicates whether the card is a prepaid card. This information enables you to determine when a gift card or prepaid card is presented for use when establishing a new recurring, installment, or deferred billing relationship.  This field is supported for Visa, Mastercard, Discover, Diners Club, and JCB on Chase Paymentech Solutions. Possible values:   - **Y**: Yes  - **N**: No  - **X**: Not applicable / Unknown ")
  public String getPrepaid() {
    return prepaid;
  }

  public void setPrepaid(String prepaid) {
    this.prepaid = prepaid;
  }

  public InlineResponse201PaymentInformationAccountFeatures regulated(String regulated) {
    this.regulated = regulated;
    return this;
  }

   /**
   * Indicates whether the card is regulated according to the Durbin Amendment. If the card is regulated, the card issuer is subject to price caps and interchange rules. This field is supported for Visa, Mastercard, Discover, Diners Club, and JCB on Chase Paymentech Solutions. Possible values:   - **Y**: Yes (assets greater than 10B USD)  - **N**: No (assets less than 10B USD)  - **X**: Not applicable / Unknown 
   * @return regulated
  **/
  @ApiModelProperty(value = "Indicates whether the card is regulated according to the Durbin Amendment. If the card is regulated, the card issuer is subject to price caps and interchange rules. This field is supported for Visa, Mastercard, Discover, Diners Club, and JCB on Chase Paymentech Solutions. Possible values:   - **Y**: Yes (assets greater than 10B USD)  - **N**: No (assets less than 10B USD)  - **X**: Not applicable / Unknown ")
  public String getRegulated() {
    return regulated;
  }

  public void setRegulated(String regulated) {
    this.regulated = regulated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse201PaymentInformationAccountFeatures inlineResponse201PaymentInformationAccountFeatures = (InlineResponse201PaymentInformationAccountFeatures) o;
    return Objects.equals(this.accountType, inlineResponse201PaymentInformationAccountFeatures.accountType) &&
        Objects.equals(this.accountStatus, inlineResponse201PaymentInformationAccountFeatures.accountStatus) &&
        Objects.equals(this.balanceAmount, inlineResponse201PaymentInformationAccountFeatures.balanceAmount) &&
        Objects.equals(this.balanceAmountType, inlineResponse201PaymentInformationAccountFeatures.balanceAmountType) &&
        Objects.equals(this.currency, inlineResponse201PaymentInformationAccountFeatures.currency) &&
        Objects.equals(this.balanceSign, inlineResponse201PaymentInformationAccountFeatures.balanceSign) &&
        Objects.equals(this.affluenceIndicator, inlineResponse201PaymentInformationAccountFeatures.affluenceIndicator) &&
        Objects.equals(this.category, inlineResponse201PaymentInformationAccountFeatures.category) &&
        Objects.equals(this.commercial, inlineResponse201PaymentInformationAccountFeatures.commercial) &&
        Objects.equals(this.group, inlineResponse201PaymentInformationAccountFeatures.group) &&
        Objects.equals(this.healthCare, inlineResponse201PaymentInformationAccountFeatures.healthCare) &&
        Objects.equals(this.payroll, inlineResponse201PaymentInformationAccountFeatures.payroll) &&
        Objects.equals(this.level3Eligible, inlineResponse201PaymentInformationAccountFeatures.level3Eligible) &&
        Objects.equals(this.pinlessDebit, inlineResponse201PaymentInformationAccountFeatures.pinlessDebit) &&
        Objects.equals(this.signatureDebit, inlineResponse201PaymentInformationAccountFeatures.signatureDebit) &&
        Objects.equals(this.prepaid, inlineResponse201PaymentInformationAccountFeatures.prepaid) &&
        Objects.equals(this.regulated, inlineResponse201PaymentInformationAccountFeatures.regulated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, accountStatus, balanceAmount, balanceAmountType, currency, balanceSign, affluenceIndicator, category, commercial, group, healthCare, payroll, level3Eligible, pinlessDebit, signatureDebit, prepaid, regulated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201PaymentInformationAccountFeatures {\n");
    
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    balanceAmount: ").append(toIndentedString(balanceAmount)).append("\n");
    sb.append("    balanceAmountType: ").append(toIndentedString(balanceAmountType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    balanceSign: ").append(toIndentedString(balanceSign)).append("\n");
    sb.append("    affluenceIndicator: ").append(toIndentedString(affluenceIndicator)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    commercial: ").append(toIndentedString(commercial)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    healthCare: ").append(toIndentedString(healthCare)).append("\n");
    sb.append("    payroll: ").append(toIndentedString(payroll)).append("\n");
    sb.append("    level3Eligible: ").append(toIndentedString(level3Eligible)).append("\n");
    sb.append("    pinlessDebit: ").append(toIndentedString(pinlessDebit)).append("\n");
    sb.append("    signatureDebit: ").append(toIndentedString(signatureDebit)).append("\n");
    sb.append("    prepaid: ").append(toIndentedString(prepaid)).append("\n");
    sb.append("    regulated: ").append(toIndentedString(regulated)).append("\n");
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

