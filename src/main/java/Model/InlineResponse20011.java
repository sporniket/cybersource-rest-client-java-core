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
import Model.InlineResponse20011Links;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse20011
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-31T18:13:53.731+05:30")
public class InlineResponse20011 {
  @SerializedName("_links")
  private InlineResponse20011Links links = null;

  /**
   * Shows the response is a collection of objects.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    COLLECTION("collection");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String text) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ObjectEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("object")
  private ObjectEnum object = null;

  @SerializedName("offset")
  private String offset = null;

  @SerializedName("limit")
  private String limit = null;

  @SerializedName("count")
  private String count = null;

  @SerializedName("total")
  private String total = null;

  @SerializedName("_embedded")
  private Object embedded = null;

  public InlineResponse20011 links(InlineResponse20011Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public InlineResponse20011Links getLinks() {
    return links;
  }

  public void setLinks(InlineResponse20011Links links) {
    this.links = links;
  }

   /**
   * Shows the response is a collection of objects.
   * @return object
  **/
  @ApiModelProperty(example = "collection", value = "Shows the response is a collection of objects.")
  public ObjectEnum getObject() {
    return object;
  }

   /**
   * The offset parameter supplied in the request.
   * @return offset
  **/
  @ApiModelProperty(example = "20", value = "The offset parameter supplied in the request.")
  public String getOffset() {
    return offset;
  }

   /**
   * The limit parameter supplied in the request.
   * @return limit
  **/
  @ApiModelProperty(example = "1", value = "The limit parameter supplied in the request.")
  public String getLimit() {
    return limit;
  }

   /**
   * The number of Payment Instruments returned in the array.
   * @return count
  **/
  @ApiModelProperty(example = "1", value = "The number of Payment Instruments returned in the array.")
  public String getCount() {
    return count;
  }

   /**
   * The total number of Payment Instruments associated with the Instrument Identifier in the zero-based dataset.
   * @return total
  **/
  @ApiModelProperty(example = "39", value = "The total number of Payment Instruments associated with the Instrument Identifier in the zero-based dataset.")
  public String getTotal() {
    return total;
  }

  public InlineResponse20011 embedded(Object embedded) {
    this.embedded = embedded;
    return this;
  }

   /**
   * Array of Payment Instruments returned for the supplied Instrument Identifier.
   * @return embedded
  **/
  @ApiModelProperty(value = "Array of Payment Instruments returned for the supplied Instrument Identifier.")
  public Object getEmbedded() {
    return embedded;
  }

  public void setEmbedded(Object embedded) {
    this.embedded = embedded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20011 inlineResponse20011 = (InlineResponse20011) o;
    return Objects.equals(this.links, inlineResponse20011.links) &&
        Objects.equals(this.object, inlineResponse20011.object) &&
        Objects.equals(this.offset, inlineResponse20011.offset) &&
        Objects.equals(this.limit, inlineResponse20011.limit) &&
        Objects.equals(this.count, inlineResponse20011.count) &&
        Objects.equals(this.total, inlineResponse20011.total) &&
        Objects.equals(this.embedded, inlineResponse20011.embedded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, object, offset, limit, count, total, embedded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20011 {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
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

