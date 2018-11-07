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
 * InlineResponse2017EmbeddedMerchantInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-31T18:13:53.731+05:30")
public class InlineResponse2017EmbeddedMerchantInformation {
  @SerializedName("resellerId")
  private String resellerId = null;

  public InlineResponse2017EmbeddedMerchantInformation resellerId(String resellerId) {
    this.resellerId = resellerId;
    return this;
  }

   /**
   * An unique identification number assigned by CyberSource to identify the submitted request.
   * @return resellerId
  **/
  @ApiModelProperty(value = "An unique identification number assigned by CyberSource to identify the submitted request.")
  public String getResellerId() {
    return resellerId;
  }

  public void setResellerId(String resellerId) {
    this.resellerId = resellerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2017EmbeddedMerchantInformation inlineResponse2017EmbeddedMerchantInformation = (InlineResponse2017EmbeddedMerchantInformation) o;
    return Objects.equals(this.resellerId, inlineResponse2017EmbeddedMerchantInformation.resellerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resellerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2017EmbeddedMerchantInformation {\n");
    
    sb.append("    resellerId: ").append(toIndentedString(resellerId)).append("\n");
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

