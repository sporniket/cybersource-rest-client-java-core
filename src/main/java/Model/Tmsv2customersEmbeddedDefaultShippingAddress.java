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
import Model.Tmsv2customersEmbeddedDefaultShippingAddressLinks;
import Model.Tmsv2customersEmbeddedDefaultShippingAddressMetadata;
import Model.Tmsv2customersEmbeddedDefaultShippingAddressShipTo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Tmsv2customersEmbeddedDefaultShippingAddress
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-27T16:17:50.788+05:30")
public class Tmsv2customersEmbeddedDefaultShippingAddress {
  @SerializedName("_links")
  private Tmsv2customersEmbeddedDefaultShippingAddressLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("shipTo")
  private Tmsv2customersEmbeddedDefaultShippingAddressShipTo shipTo = null;

  @SerializedName("metadata")
  private Tmsv2customersEmbeddedDefaultShippingAddressMetadata metadata = null;

  public Tmsv2customersEmbeddedDefaultShippingAddress links(Tmsv2customersEmbeddedDefaultShippingAddressLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultShippingAddressLinks getLinks() {
    return links;
  }

  public void setLinks(Tmsv2customersEmbeddedDefaultShippingAddressLinks links) {
    this.links = links;
  }

  public Tmsv2customersEmbeddedDefaultShippingAddress id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the Shipping Address Token.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the Shipping Address Token.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Tmsv2customersEmbeddedDefaultShippingAddress shipTo(Tmsv2customersEmbeddedDefaultShippingAddressShipTo shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultShippingAddressShipTo getShipTo() {
    return shipTo;
  }

  public void setShipTo(Tmsv2customersEmbeddedDefaultShippingAddressShipTo shipTo) {
    this.shipTo = shipTo;
  }

  public Tmsv2customersEmbeddedDefaultShippingAddress metadata(Tmsv2customersEmbeddedDefaultShippingAddressMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultShippingAddressMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Tmsv2customersEmbeddedDefaultShippingAddressMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersEmbeddedDefaultShippingAddress tmsv2customersEmbeddedDefaultShippingAddress = (Tmsv2customersEmbeddedDefaultShippingAddress) o;
    return Objects.equals(this.links, tmsv2customersEmbeddedDefaultShippingAddress.links) &&
        Objects.equals(this.id, tmsv2customersEmbeddedDefaultShippingAddress.id) &&
        Objects.equals(this.shipTo, tmsv2customersEmbeddedDefaultShippingAddress.shipTo) &&
        Objects.equals(this.metadata, tmsv2customersEmbeddedDefaultShippingAddress.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, shipTo, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersEmbeddedDefaultShippingAddress {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

