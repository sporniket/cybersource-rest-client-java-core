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
 * V2paymentsidcapturesPaymentInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class V2paymentsidcapturesPaymentInformation {
  @SerializedName("customer")
  private V2paymentsPaymentInformationCustomer customer = null;

  public V2paymentsidcapturesPaymentInformation customer(V2paymentsPaymentInformationCustomer customer) {
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
    V2paymentsidcapturesPaymentInformation v2paymentsidcapturesPaymentInformation = (V2paymentsidcapturesPaymentInformation) o;
    return Objects.equals(this.customer, v2paymentsidcapturesPaymentInformation.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2paymentsidcapturesPaymentInformation {\n");
    
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

