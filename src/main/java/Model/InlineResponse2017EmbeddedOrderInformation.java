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
import Model.InlineResponse2017EmbeddedOrderInformationBillTo;
import Model.InlineResponse2017EmbeddedOrderInformationShipTo;
import Model.Ptsv2paymentsidreversalsReversalInformationAmountDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse2017EmbeddedOrderInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-31T18:13:53.731+05:30")
public class InlineResponse2017EmbeddedOrderInformation {
  @SerializedName("billTo")
  private InlineResponse2017EmbeddedOrderInformationBillTo billTo = null;

  @SerializedName("shipTo")
  private InlineResponse2017EmbeddedOrderInformationShipTo shipTo = null;

  @SerializedName("amountDetails")
  private Ptsv2paymentsidreversalsReversalInformationAmountDetails amountDetails = null;

  public InlineResponse2017EmbeddedOrderInformation billTo(InlineResponse2017EmbeddedOrderInformationBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2017EmbeddedOrderInformationBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(InlineResponse2017EmbeddedOrderInformationBillTo billTo) {
    this.billTo = billTo;
  }

  public InlineResponse2017EmbeddedOrderInformation shipTo(InlineResponse2017EmbeddedOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2017EmbeddedOrderInformationShipTo getShipTo() {
    return shipTo;
  }

  public void setShipTo(InlineResponse2017EmbeddedOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
  }

  public InlineResponse2017EmbeddedOrderInformation amountDetails(Ptsv2paymentsidreversalsReversalInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidreversalsReversalInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(Ptsv2paymentsidreversalsReversalInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2017EmbeddedOrderInformation inlineResponse2017EmbeddedOrderInformation = (InlineResponse2017EmbeddedOrderInformation) o;
    return Objects.equals(this.billTo, inlineResponse2017EmbeddedOrderInformation.billTo) &&
        Objects.equals(this.shipTo, inlineResponse2017EmbeddedOrderInformation.shipTo) &&
        Objects.equals(this.amountDetails, inlineResponse2017EmbeddedOrderInformation.amountDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billTo, shipTo, amountDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2017EmbeddedOrderInformation {\n");
    
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
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

