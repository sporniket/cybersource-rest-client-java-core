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
 * InlineResponse201Embedded
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class InlineResponse201Embedded {
  @SerializedName("capture")
  private InlineResponse201EmbeddedCapture capture = null;

  public InlineResponse201Embedded capture(InlineResponse201EmbeddedCapture capture) {
    this.capture = capture;
    return this;
  }

   /**
   * Get capture
   * @return capture
  **/
  @ApiModelProperty(value = "")
  public InlineResponse201EmbeddedCapture getCapture() {
    return capture;
  }

  public void setCapture(InlineResponse201EmbeddedCapture capture) {
    this.capture = capture;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse201Embedded inlineResponse201Embedded = (InlineResponse201Embedded) o;
    return Objects.equals(this.capture, inlineResponse201Embedded.capture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capture);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201Embedded {\n");
    
    sb.append("    capture: ").append(toIndentedString(capture)).append("\n");
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

