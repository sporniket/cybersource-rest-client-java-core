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
 * InlineResponse2008Links
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class InlineResponse2008Links {
  @SerializedName("self")
  private InlineResponse2008LinksSelf self = null;

  @SerializedName("first")
  private InlineResponse2008LinksFirst first = null;

  @SerializedName("prev")
  private InlineResponse2008LinksPrev prev = null;

  @SerializedName("next")
  private InlineResponse2008LinksNext next = null;

  @SerializedName("last")
  private InlineResponse2008LinksLast last = null;

  public InlineResponse2008Links self(InlineResponse2008LinksSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self Get self.
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2008LinksSelf getSelf() {
    return self;
  }

  public void setSelf(InlineResponse2008LinksSelf self) {
    this.self = self;
  }

  public InlineResponse2008Links first(InlineResponse2008LinksFirst first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first Get first.
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2008LinksFirst getFirst() {
    return first;
  }

  public void setFirst(InlineResponse2008LinksFirst first) {
    this.first = first;
  }

  public InlineResponse2008Links prev(InlineResponse2008LinksPrev prev) {
    this.prev = prev;
    return this;
  }

   /**
   * Get prev
   * @return prev previous.
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2008LinksPrev getPrev() {
    return prev;
  }

  public void setPrev(InlineResponse2008LinksPrev prev) {
    this.prev = prev;
  }

  public InlineResponse2008Links next(InlineResponse2008LinksNext next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next Next.
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2008LinksNext getNext() {
    return next;
  }

  public void setNext(InlineResponse2008LinksNext next) {
    this.next = next;
  }

  public InlineResponse2008Links last(InlineResponse2008LinksLast last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last Last.
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2008LinksLast getLast() {
    return last;
  }

  public void setLast(InlineResponse2008LinksLast last) {
    this.last = last;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008Links inlineResponse2008Links = (InlineResponse2008Links) o;
    return Objects.equals(this.self, inlineResponse2008Links.self) &&
        Objects.equals(this.first, inlineResponse2008Links.first) &&
        Objects.equals(this.prev, inlineResponse2008Links.prev) &&
        Objects.equals(this.next, inlineResponse2008Links.next) &&
        Objects.equals(this.last, inlineResponse2008Links.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, first, prev, next, last);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008Links {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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

