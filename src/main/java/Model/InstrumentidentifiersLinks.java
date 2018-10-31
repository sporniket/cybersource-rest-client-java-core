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
 * InstrumentidentifiersLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class InstrumentidentifiersLinks {
  @SerializedName("self")
  private InstrumentidentifiersLinksSelf self = null;

  @SerializedName("ancestor")
  private InstrumentidentifiersLinksSelf ancestor = null;

  @SerializedName("successor")
  private InstrumentidentifiersLinksSelf successor = null;

  public InstrumentidentifiersLinks self(InstrumentidentifiersLinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public InstrumentidentifiersLinksSelf getSelf() {
    return self;
  }

  public void setSelf(InstrumentidentifiersLinksSelf self) {
    this.self = self;
  }

  public InstrumentidentifiersLinks ancestor(InstrumentidentifiersLinksSelf ancestor) {
    this.ancestor = ancestor;
    return this;
  }

   /**
   * Get ancestor
   * @return ancestor
  **/
  @ApiModelProperty(value = "")
  public InstrumentidentifiersLinksSelf getAncestor() {
    return ancestor;
  }

  public void setAncestor(InstrumentidentifiersLinksSelf ancestor) {
    this.ancestor = ancestor;
  }

  public InstrumentidentifiersLinks successor(InstrumentidentifiersLinksSelf successor) {
    this.successor = successor;
    return this;
  }

   /**
   * Get successor
   * @return successor
  **/
  @ApiModelProperty(value = "")
  public InstrumentidentifiersLinksSelf getSuccessor() {
    return successor;
  }

  public void setSuccessor(InstrumentidentifiersLinksSelf successor) {
    this.successor = successor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentidentifiersLinks instrumentidentifiersLinks = (InstrumentidentifiersLinks) o;
    return Objects.equals(this.self, instrumentidentifiersLinks.self) &&
        Objects.equals(this.ancestor, instrumentidentifiersLinks.ancestor) &&
        Objects.equals(this.successor, instrumentidentifiersLinks.successor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, ancestor, successor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentidentifiersLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    ancestor: ").append(toIndentedString(ancestor)).append("\n");
    sb.append("    successor: ").append(toIndentedString(successor)).append("\n");
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

