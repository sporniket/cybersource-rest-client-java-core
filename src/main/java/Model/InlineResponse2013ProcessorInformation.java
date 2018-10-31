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
 * InlineResponse2013ProcessorInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class InlineResponse2013ProcessorInformation {
  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("forwardedAcquirerCode")
  private String forwardedAcquirerCode = null;

  public InlineResponse2013ProcessorInformation transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Processor transaction ID.  This value identifies the transaction on a host system. This value is supported only for Moneris. It contains this information:   - Terminal used to process the transaction  - Shift during which the transaction took place  - Batch number  - Transaction number within the batch  You must store this value. If you give the customer a receipt, display this value on the receipt.  Example For the value 66012345001069003:   - Terminal ID &#x3D; 66012345  - Shift number &#x3D; 001  - Batch number &#x3D; 069  - Transaction number &#x3D; 003 
   * @return transactionId
  **/
  @ApiModelProperty(value = "Processor transaction ID.  This value identifies the transaction on a host system. This value is supported only for Moneris. It contains this information:   - Terminal used to process the transaction  - Shift during which the transaction took place  - Batch number  - Transaction number within the batch  You must store this value. If you give the customer a receipt, display this value on the receipt.  Example For the value 66012345001069003:   - Terminal ID = 66012345  - Shift number = 001  - Batch number = 069  - Transaction number = 003 ")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public InlineResponse2013ProcessorInformation forwardedAcquirerCode(String forwardedAcquirerCode) {
    this.forwardedAcquirerCode = forwardedAcquirerCode;
    return this;
  }

   /**
   * Name of the Japanese acquirer that processed the transaction. Returned only for CCS (CAFIS) and JCN Gateway. Please contact the CyberSource Japan Support Group for more information. 
   * @return forwardedAcquirerCode
  **/
  @ApiModelProperty(value = "Name of the Japanese acquirer that processed the transaction. Returned only for CCS (CAFIS) and JCN Gateway. Please contact the CyberSource Japan Support Group for more information. ")
  public String getForwardedAcquirerCode() {
    return forwardedAcquirerCode;
  }

  public void setForwardedAcquirerCode(String forwardedAcquirerCode) {
    this.forwardedAcquirerCode = forwardedAcquirerCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2013ProcessorInformation inlineResponse2013ProcessorInformation = (InlineResponse2013ProcessorInformation) o;
    return Objects.equals(this.transactionId, inlineResponse2013ProcessorInformation.transactionId) &&
        Objects.equals(this.forwardedAcquirerCode, inlineResponse2013ProcessorInformation.forwardedAcquirerCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, forwardedAcquirerCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2013ProcessorInformation {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    forwardedAcquirerCode: ").append(toIndentedString(forwardedAcquirerCode)).append("\n");
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

