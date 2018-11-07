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
import Model.InlineResponse2004ReportDefinitions;
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
 * InlineResponse2004
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-31T18:13:53.731+05:30")
public class InlineResponse2004 {
  @SerializedName("reportDefinitions")
  private List<InlineResponse2004ReportDefinitions> reportDefinitions = null;

  public InlineResponse2004 reportDefinitions(List<InlineResponse2004ReportDefinitions> reportDefinitions) {
    this.reportDefinitions = reportDefinitions;
    return this;
  }

  public InlineResponse2004 addReportDefinitionsItem(InlineResponse2004ReportDefinitions reportDefinitionsItem) {
    if (this.reportDefinitions == null) {
      this.reportDefinitions = new ArrayList<InlineResponse2004ReportDefinitions>();
    }
    this.reportDefinitions.add(reportDefinitionsItem);
    return this;
  }

   /**
   * Get reportDefinitions
   * @return reportDefinitions
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2004ReportDefinitions> getReportDefinitions() {
    return reportDefinitions;
  }

  public void setReportDefinitions(List<InlineResponse2004ReportDefinitions> reportDefinitions) {
    this.reportDefinitions = reportDefinitions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004 inlineResponse2004 = (InlineResponse2004) o;
    return Objects.equals(this.reportDefinitions, inlineResponse2004.reportDefinitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportDefinitions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004 {\n");
    
    sb.append("    reportDefinitions: ").append(toIndentedString(reportDefinitions)).append("\n");
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

