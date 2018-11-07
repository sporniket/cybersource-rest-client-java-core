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
 * InlineResponseDefaultResponseStatusDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-31T18:13:53.731+05:30")
public class InlineResponseDefaultResponseStatusDetails {
  @SerializedName("location")
  private String location = null;

  @SerializedName("message")
  private String message = null;

  public InlineResponseDefaultResponseStatusDetails location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Field name referred to for validation issues.
   * @return location
  **/
  @ApiModelProperty(value = "Field name referred to for validation issues.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public InlineResponseDefaultResponseStatusDetails message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Description or code of any error response.
   * @return message
  **/
  @ApiModelProperty(value = "Description or code of any error response.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponseDefaultResponseStatusDetails inlineResponseDefaultResponseStatusDetails = (InlineResponseDefaultResponseStatusDetails) o;
    return Objects.equals(this.location, inlineResponseDefaultResponseStatusDetails.location) &&
        Objects.equals(this.message, inlineResponseDefaultResponseStatusDetails.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponseDefaultResponseStatusDetails {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

