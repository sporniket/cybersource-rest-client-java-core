/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
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
 * Riskv1liststypeentriesDeviceInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-27T16:17:50.788+05:30")
public class Riskv1liststypeentriesDeviceInformation {
  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("networkIpAddress")
  private String networkIpAddress = null;

  public Riskv1liststypeentriesDeviceInformation ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address of the customer.  #### Used by **Authorization, Capture, and Credit** Optional field. 
   * @return ipAddress
  **/
  @ApiModelProperty(value = "IP address of the customer.  #### Used by **Authorization, Capture, and Credit** Optional field. ")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public Riskv1liststypeentriesDeviceInformation networkIpAddress(String networkIpAddress) {
    this.networkIpAddress = networkIpAddress;
    return this;
  }

   /**
   * Network IP address of the customer (for example, 10.1.27). A network IP address includes up to 256 IP addresses. 
   * @return networkIpAddress
  **/
  @ApiModelProperty(value = "Network IP address of the customer (for example, 10.1.27). A network IP address includes up to 256 IP addresses. ")
  public String getNetworkIpAddress() {
    return networkIpAddress;
  }

  public void setNetworkIpAddress(String networkIpAddress) {
    this.networkIpAddress = networkIpAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1liststypeentriesDeviceInformation riskv1liststypeentriesDeviceInformation = (Riskv1liststypeentriesDeviceInformation) o;
    return Objects.equals(this.ipAddress, riskv1liststypeentriesDeviceInformation.ipAddress) &&
        Objects.equals(this.networkIpAddress, riskv1liststypeentriesDeviceInformation.networkIpAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, networkIpAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1liststypeentriesDeviceInformation {\n");
    
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    networkIpAddress: ").append(toIndentedString(networkIpAddress)).append("\n");
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

