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
 * Riskv1decisionsDeviceInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-09T11:41:34.789+05:30")
public class Riskv1decisionsDeviceInformation {
  @SerializedName("cookiesAccepted")
  private String cookiesAccepted = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("hostName")
  private String hostName = null;

  @SerializedName("fingerprintSessionId")
  private String fingerprintSessionId = null;

  @SerializedName("httpBrowserEmail")
  private String httpBrowserEmail = null;

  @SerializedName("userAgent")
  private String userAgent = null;

  public Riskv1decisionsDeviceInformation cookiesAccepted(String cookiesAccepted) {
    this.cookiesAccepted = cookiesAccepted;
    return this;
  }

   /**
   * Whether the customer’s browser accepts cookies. This field can contain one of the following values: - &#x60;yes&#x60;: The customer’s browser accepts cookies. - &#x60;no&#x60;: The customer’s browser does not accept cookies. 
   * @return cookiesAccepted
  **/
  @ApiModelProperty(value = "Whether the customer’s browser accepts cookies. This field can contain one of the following values: - `yes`: The customer’s browser accepts cookies. - `no`: The customer’s browser does not accept cookies. ")
  public String getCookiesAccepted() {
    return cookiesAccepted;
  }

  public void setCookiesAccepted(String cookiesAccepted) {
    this.cookiesAccepted = cookiesAccepted;
  }

  public Riskv1decisionsDeviceInformation ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP address of the customer. 
   * @return ipAddress
  **/
  @ApiModelProperty(value = "IP address of the customer. ")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public Riskv1decisionsDeviceInformation hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * DNS resolved hostname from &#x60;ipAddress&#x60;.
   * @return hostName
  **/
  @ApiModelProperty(value = "DNS resolved hostname from `ipAddress`.")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public Riskv1decisionsDeviceInformation fingerprintSessionId(String fingerprintSessionId) {
    this.fingerprintSessionId = fingerprintSessionId;
    return this;
  }

   /**
   * Field that contains the session ID that you send to Decision Manager to obtain the device fingerprint information. The string can contain uppercase and lowercase letters, digits, hyphen (-), and underscore (_). However, do not use the same uppercase and lowercase letters to indicate different session IDs.  The session ID must be unique for each merchant ID. You can use any string that you are already generating, such as an order number or web session ID.  The session ID must be unique for each page load, regardless of an individual’s web session ID. If a user navigates to a profiled page and is assigned a web session, navigates away from the profiled page, then navigates back to the profiled page, the generated session ID should be different and unique. You may use a web session ID, but it is preferable to use an application GUID (Globally Unique Identifier). This measure ensures that a unique ID is generated every time the page is loaded, even if it is the same user reloading the page. 
   * @return fingerprintSessionId
  **/
  @ApiModelProperty(value = "Field that contains the session ID that you send to Decision Manager to obtain the device fingerprint information. The string can contain uppercase and lowercase letters, digits, hyphen (-), and underscore (_). However, do not use the same uppercase and lowercase letters to indicate different session IDs.  The session ID must be unique for each merchant ID. You can use any string that you are already generating, such as an order number or web session ID.  The session ID must be unique for each page load, regardless of an individual’s web session ID. If a user navigates to a profiled page and is assigned a web session, navigates away from the profiled page, then navigates back to the profiled page, the generated session ID should be different and unique. You may use a web session ID, but it is preferable to use an application GUID (Globally Unique Identifier). This measure ensures that a unique ID is generated every time the page is loaded, even if it is the same user reloading the page. ")
  public String getFingerprintSessionId() {
    return fingerprintSessionId;
  }

  public void setFingerprintSessionId(String fingerprintSessionId) {
    this.fingerprintSessionId = fingerprintSessionId;
  }

  public Riskv1decisionsDeviceInformation httpBrowserEmail(String httpBrowserEmail) {
    this.httpBrowserEmail = httpBrowserEmail;
    return this;
  }

   /**
   * Email address set in the customer’s browser, which may differ from customer email. 
   * @return httpBrowserEmail
  **/
  @ApiModelProperty(value = "Email address set in the customer’s browser, which may differ from customer email. ")
  public String getHttpBrowserEmail() {
    return httpBrowserEmail;
  }

  public void setHttpBrowserEmail(String httpBrowserEmail) {
    this.httpBrowserEmail = httpBrowserEmail;
  }

  public Riskv1decisionsDeviceInformation userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Customer’s browser as identified from the HTTP header data. For example, &#x60;Mozilla&#x60; is the value that identifies the Netscape browser. 
   * @return userAgent
  **/
  @ApiModelProperty(value = "Customer’s browser as identified from the HTTP header data. For example, `Mozilla` is the value that identifies the Netscape browser. ")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1decisionsDeviceInformation riskv1decisionsDeviceInformation = (Riskv1decisionsDeviceInformation) o;
    return Objects.equals(this.cookiesAccepted, riskv1decisionsDeviceInformation.cookiesAccepted) &&
        Objects.equals(this.ipAddress, riskv1decisionsDeviceInformation.ipAddress) &&
        Objects.equals(this.hostName, riskv1decisionsDeviceInformation.hostName) &&
        Objects.equals(this.fingerprintSessionId, riskv1decisionsDeviceInformation.fingerprintSessionId) &&
        Objects.equals(this.httpBrowserEmail, riskv1decisionsDeviceInformation.httpBrowserEmail) &&
        Objects.equals(this.userAgent, riskv1decisionsDeviceInformation.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cookiesAccepted, ipAddress, hostName, fingerprintSessionId, httpBrowserEmail, userAgent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1decisionsDeviceInformation {\n");
    
    sb.append("    cookiesAccepted: ").append(toIndentedString(cookiesAccepted)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    fingerprintSessionId: ").append(toIndentedString(fingerprintSessionId)).append("\n");
    sb.append("    httpBrowserEmail: ").append(toIndentedString(httpBrowserEmail)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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

