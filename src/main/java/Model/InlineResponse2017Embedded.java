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
import Model.InlineResponse2017EmbeddedTransactionSummaries;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2017Embedded
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-31T18:13:53.731+05:30")
public class InlineResponse2017Embedded {
  @SerializedName("transactionSummaries")
  private List<InlineResponse2017EmbeddedTransactionSummaries> transactionSummaries = null;

  public InlineResponse2017Embedded transactionSummaries(List<InlineResponse2017EmbeddedTransactionSummaries> transactionSummaries) {
    this.transactionSummaries = transactionSummaries;
    return this;
  }

  public InlineResponse2017Embedded addTransactionSummariesItem(InlineResponse2017EmbeddedTransactionSummaries transactionSummariesItem) {
    if (this.transactionSummaries == null) {
      this.transactionSummaries = new ArrayList<InlineResponse2017EmbeddedTransactionSummaries>();
    }
    this.transactionSummaries.add(transactionSummariesItem);
    return this;
  }

   /**
   * transaction search summary
   * @return transactionSummaries
  **/
  @ApiModelProperty(value = "transaction search summary")
  public List<InlineResponse2017EmbeddedTransactionSummaries> getTransactionSummaries() {
    return transactionSummaries;
  }

  public void setTransactionSummaries(List<InlineResponse2017EmbeddedTransactionSummaries> transactionSummaries) {
    this.transactionSummaries = transactionSummaries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2017Embedded inlineResponse2017Embedded = (InlineResponse2017Embedded) o;
    return Objects.equals(this.transactionSummaries, inlineResponse2017Embedded.transactionSummaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionSummaries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2017Embedded {\n");
    
    sb.append("    transactionSummaries: ").append(toIndentedString(transactionSummaries)).append("\n");
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

