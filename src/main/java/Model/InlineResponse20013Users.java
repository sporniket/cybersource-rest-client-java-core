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
import Model.InlineResponse20013AccountInformation;
import Model.InlineResponse20013ContactInformation;
import Model.InlineResponse20013OrganizationInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse20013Users
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-31T18:13:53.731+05:30")
public class InlineResponse20013Users {
  @SerializedName("accountInformation")
  private InlineResponse20013AccountInformation accountInformation = null;

  @SerializedName("organizationInformation")
  private InlineResponse20013OrganizationInformation organizationInformation = null;

  @SerializedName("contactInformation")
  private InlineResponse20013ContactInformation contactInformation = null;

  public InlineResponse20013Users accountInformation(InlineResponse20013AccountInformation accountInformation) {
    this.accountInformation = accountInformation;
    return this;
  }

   /**
   * Get accountInformation
   * @return accountInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse20013AccountInformation getAccountInformation() {
    return accountInformation;
  }

  public void setAccountInformation(InlineResponse20013AccountInformation accountInformation) {
    this.accountInformation = accountInformation;
  }

  public InlineResponse20013Users organizationInformation(InlineResponse20013OrganizationInformation organizationInformation) {
    this.organizationInformation = organizationInformation;
    return this;
  }

   /**
   * Get organizationInformation
   * @return organizationInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse20013OrganizationInformation getOrganizationInformation() {
    return organizationInformation;
  }

  public void setOrganizationInformation(InlineResponse20013OrganizationInformation organizationInformation) {
    this.organizationInformation = organizationInformation;
  }

  public InlineResponse20013Users contactInformation(InlineResponse20013ContactInformation contactInformation) {
    this.contactInformation = contactInformation;
    return this;
  }

   /**
   * Get contactInformation
   * @return contactInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse20013ContactInformation getContactInformation() {
    return contactInformation;
  }

  public void setContactInformation(InlineResponse20013ContactInformation contactInformation) {
    this.contactInformation = contactInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20013Users inlineResponse20013Users = (InlineResponse20013Users) o;
    return Objects.equals(this.accountInformation, inlineResponse20013Users.accountInformation) &&
        Objects.equals(this.organizationInformation, inlineResponse20013Users.organizationInformation) &&
        Objects.equals(this.contactInformation, inlineResponse20013Users.contactInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountInformation, organizationInformation, contactInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20013Users {\n");
    
    sb.append("    accountInformation: ").append(toIndentedString(accountInformation)).append("\n");
    sb.append("    organizationInformation: ").append(toIndentedString(organizationInformation)).append("\n");
    sb.append("    contactInformation: ").append(toIndentedString(contactInformation)).append("\n");
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

