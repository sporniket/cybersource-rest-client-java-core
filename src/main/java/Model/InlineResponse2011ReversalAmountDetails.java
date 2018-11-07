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
 * InlineResponse2011ReversalAmountDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-31T18:13:53.731+05:30")
public class InlineResponse2011ReversalAmountDetails {
  @SerializedName("reversedAmount")
  private String reversedAmount = null;

  @SerializedName("originalTransactionAmount")
  private String originalTransactionAmount = null;

  @SerializedName("currency")
  private String currency = null;

  public InlineResponse2011ReversalAmountDetails reversedAmount(String reversedAmount) {
    this.reversedAmount = reversedAmount;
    return this;
  }

   /**
   * Total reversed amount.
   * @return reversedAmount
  **/
  @ApiModelProperty(value = "Total reversed amount.")
  public String getReversedAmount() {
    return reversedAmount;
  }

  public void setReversedAmount(String reversedAmount) {
    this.reversedAmount = reversedAmount;
  }

  public InlineResponse2011ReversalAmountDetails originalTransactionAmount(String originalTransactionAmount) {
    this.originalTransactionAmount = originalTransactionAmount;
    return this;
  }

   /**
   * Amount of the original transaction.
   * @return originalTransactionAmount
  **/
  @ApiModelProperty(value = "Amount of the original transaction.")
  public String getOriginalTransactionAmount() {
    return originalTransactionAmount;
  }

  public void setOriginalTransactionAmount(String originalTransactionAmount) {
    this.originalTransactionAmount = originalTransactionAmount;
  }

  public InlineResponse2011ReversalAmountDetails currency(String currency) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2011ReversalAmountDetails inlineResponse2011ReversalAmountDetails = (InlineResponse2011ReversalAmountDetails) o;
    return Objects.equals(this.reversedAmount, inlineResponse2011ReversalAmountDetails.reversedAmount) &&
        Objects.equals(this.originalTransactionAmount, inlineResponse2011ReversalAmountDetails.originalTransactionAmount) &&
        Objects.equals(this.currency, inlineResponse2011ReversalAmountDetails.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reversedAmount, originalTransactionAmount, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2011ReversalAmountDetails {\n");
    
    sb.append("    reversedAmount: ").append(toIndentedString(reversedAmount)).append("\n");
    sb.append("    originalTransactionAmount: ").append(toIndentedString(originalTransactionAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

