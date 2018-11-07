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
import Model.InlineResponse2006ReportPreferences;
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
import org.joda.time.DateTime;

/**
 * Subscription Details
 */
@ApiModel(description = "Subscription Details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-31T18:13:53.731+05:30")
public class InlineResponse2006Subscriptions {
  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("reportDefinitionId")
  private String reportDefinitionId = null;

  @SerializedName("reportDefinitionName")
  private String reportDefinitionName = null;

  /**
   * Report Format
   */
  @JsonAdapter(ReportMimeTypeEnum.Adapter.class)
  public enum ReportMimeTypeEnum {
    APPLICATION_XML("application/xml"),
    
    TEXT_CSV("text/csv");

    private String value;

    ReportMimeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReportMimeTypeEnum fromValue(String text) {
      for (ReportMimeTypeEnum b : ReportMimeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReportMimeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReportMimeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReportMimeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReportMimeTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("reportMimeType")
  private ReportMimeTypeEnum reportMimeType = null;

  /**
   * Report Frequency
   */
  @JsonAdapter(ReportFrequencyEnum.Adapter.class)
  public enum ReportFrequencyEnum {
    DAILY("DAILY"),
    
    WEEKLY("WEEKLY"),
    
    MONTHLY("MONTHLY");

    private String value;

    ReportFrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReportFrequencyEnum fromValue(String text) {
      for (ReportFrequencyEnum b : ReportFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReportFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReportFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReportFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReportFrequencyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("reportFrequency")
  private ReportFrequencyEnum reportFrequency = null;

  @SerializedName("reportName")
  private String reportName = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("startTime")
  private DateTime startTime = null;

  @SerializedName("startDay")
  private Integer startDay = null;

  @SerializedName("reportFields")
  private List<String> reportFields = null;

  @SerializedName("reportFilters")
  private List<String> reportFilters = null;

  @SerializedName("reportPreferences")
  private InlineResponse2006ReportPreferences reportPreferences = null;

  @SerializedName("selectedMerchantGroupName")
  private String selectedMerchantGroupName = null;

  public InlineResponse2006Subscriptions organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Organization Id
   * @return organizationId
  **/
  @ApiModelProperty(value = "Organization Id")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public InlineResponse2006Subscriptions reportDefinitionId(String reportDefinitionId) {
    this.reportDefinitionId = reportDefinitionId;
    return this;
  }

   /**
   * Report Definition Id
   * @return reportDefinitionId
  **/
  @ApiModelProperty(value = "Report Definition Id")
  public String getReportDefinitionId() {
    return reportDefinitionId;
  }

  public void setReportDefinitionId(String reportDefinitionId) {
    this.reportDefinitionId = reportDefinitionId;
  }

  public InlineResponse2006Subscriptions reportDefinitionName(String reportDefinitionName) {
    this.reportDefinitionName = reportDefinitionName;
    return this;
  }

   /**
   * Report Definition
   * @return reportDefinitionName
  **/
  @ApiModelProperty(value = "Report Definition")
  public String getReportDefinitionName() {
    return reportDefinitionName;
  }

  public void setReportDefinitionName(String reportDefinitionName) {
    this.reportDefinitionName = reportDefinitionName;
  }

  public InlineResponse2006Subscriptions reportMimeType(ReportMimeTypeEnum reportMimeType) {
    this.reportMimeType = reportMimeType;
    return this;
  }

   /**
   * Report Format
   * @return reportMimeType
  **/
  @ApiModelProperty(example = "application/xml", value = "Report Format")
  public ReportMimeTypeEnum getReportMimeType() {
    return reportMimeType;
  }

  public void setReportMimeType(ReportMimeTypeEnum reportMimeType) {
    this.reportMimeType = reportMimeType;
  }

  public InlineResponse2006Subscriptions reportFrequency(ReportFrequencyEnum reportFrequency) {
    this.reportFrequency = reportFrequency;
    return this;
  }

   /**
   * Report Frequency
   * @return reportFrequency
  **/
  @ApiModelProperty(example = "DAILY", value = "Report Frequency")
  public ReportFrequencyEnum getReportFrequency() {
    return reportFrequency;
  }

  public void setReportFrequency(ReportFrequencyEnum reportFrequency) {
    this.reportFrequency = reportFrequency;
  }

  public InlineResponse2006Subscriptions reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * Report Name
   * @return reportName
  **/
  @ApiModelProperty(example = "My Transaction Request Detail Report", value = "Report Name")
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public InlineResponse2006Subscriptions timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Time Zone
   * @return timezone
  **/
  @ApiModelProperty(example = "America/Chicago", value = "Time Zone")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public InlineResponse2006Subscriptions startTime(DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Start Time
   * @return startTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Start Time")
  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }

  public InlineResponse2006Subscriptions startDay(Integer startDay) {
    this.startDay = startDay;
    return this;
  }

   /**
   * Start Day
   * @return startDay
  **/
  @ApiModelProperty(example = "1", value = "Start Day")
  public Integer getStartDay() {
    return startDay;
  }

  public void setStartDay(Integer startDay) {
    this.startDay = startDay;
  }

  public InlineResponse2006Subscriptions reportFields(List<String> reportFields) {
    this.reportFields = reportFields;
    return this;
  }

  public InlineResponse2006Subscriptions addReportFieldsItem(String reportFieldsItem) {
    if (this.reportFields == null) {
      this.reportFields = new ArrayList<String>();
    }
    this.reportFields.add(reportFieldsItem);
    return this;
  }

   /**
   * List of all fields String values
   * @return reportFields
  **/
  @ApiModelProperty(example = "[\"Request.RequestID\",\"Request.TransactionDate\",\"Request.MerchantID\"]", value = "List of all fields String values")
  public List<String> getReportFields() {
    return reportFields;
  }

  public void setReportFields(List<String> reportFields) {
    this.reportFields = reportFields;
  }

  public InlineResponse2006Subscriptions reportFilters(List<String> reportFilters) {
    this.reportFilters = reportFilters;
    return this;
  }

  public InlineResponse2006Subscriptions addReportFiltersItem(String reportFiltersItem) {
    if (this.reportFilters == null) {
      this.reportFilters = new ArrayList<String>();
    }
    this.reportFilters.add(reportFiltersItem);
    return this;
  }

   /**
   * List of filters to apply
   * @return reportFilters
  **/
  @ApiModelProperty(example = "[\"ics_auth\",\"ics_bill\"]", value = "List of filters to apply")
  public List<String> getReportFilters() {
    return reportFilters;
  }

  public void setReportFilters(List<String> reportFilters) {
    this.reportFilters = reportFilters;
  }

  public InlineResponse2006Subscriptions reportPreferences(InlineResponse2006ReportPreferences reportPreferences) {
    this.reportPreferences = reportPreferences;
    return this;
  }

   /**
   * Get reportPreferences
   * @return reportPreferences
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2006ReportPreferences getReportPreferences() {
    return reportPreferences;
  }

  public void setReportPreferences(InlineResponse2006ReportPreferences reportPreferences) {
    this.reportPreferences = reportPreferences;
  }

  public InlineResponse2006Subscriptions selectedMerchantGroupName(String selectedMerchantGroupName) {
    this.selectedMerchantGroupName = selectedMerchantGroupName;
    return this;
  }

   /**
   * Selected name of the group.
   * @return selectedMerchantGroupName
  **/
  @ApiModelProperty(example = "testGroup", value = "Selected name of the group.")
  public String getSelectedMerchantGroupName() {
    return selectedMerchantGroupName;
  }

  public void setSelectedMerchantGroupName(String selectedMerchantGroupName) {
    this.selectedMerchantGroupName = selectedMerchantGroupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006Subscriptions inlineResponse2006Subscriptions = (InlineResponse2006Subscriptions) o;
    return Objects.equals(this.organizationId, inlineResponse2006Subscriptions.organizationId) &&
        Objects.equals(this.reportDefinitionId, inlineResponse2006Subscriptions.reportDefinitionId) &&
        Objects.equals(this.reportDefinitionName, inlineResponse2006Subscriptions.reportDefinitionName) &&
        Objects.equals(this.reportMimeType, inlineResponse2006Subscriptions.reportMimeType) &&
        Objects.equals(this.reportFrequency, inlineResponse2006Subscriptions.reportFrequency) &&
        Objects.equals(this.reportName, inlineResponse2006Subscriptions.reportName) &&
        Objects.equals(this.timezone, inlineResponse2006Subscriptions.timezone) &&
        Objects.equals(this.startTime, inlineResponse2006Subscriptions.startTime) &&
        Objects.equals(this.startDay, inlineResponse2006Subscriptions.startDay) &&
        Objects.equals(this.reportFields, inlineResponse2006Subscriptions.reportFields) &&
        Objects.equals(this.reportFilters, inlineResponse2006Subscriptions.reportFilters) &&
        Objects.equals(this.reportPreferences, inlineResponse2006Subscriptions.reportPreferences) &&
        Objects.equals(this.selectedMerchantGroupName, inlineResponse2006Subscriptions.selectedMerchantGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, reportDefinitionId, reportDefinitionName, reportMimeType, reportFrequency, reportName, timezone, startTime, startDay, reportFields, reportFilters, reportPreferences, selectedMerchantGroupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006Subscriptions {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    reportDefinitionId: ").append(toIndentedString(reportDefinitionId)).append("\n");
    sb.append("    reportDefinitionName: ").append(toIndentedString(reportDefinitionName)).append("\n");
    sb.append("    reportMimeType: ").append(toIndentedString(reportMimeType)).append("\n");
    sb.append("    reportFrequency: ").append(toIndentedString(reportFrequency)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    startDay: ").append(toIndentedString(startDay)).append("\n");
    sb.append("    reportFields: ").append(toIndentedString(reportFields)).append("\n");
    sb.append("    reportFilters: ").append(toIndentedString(reportFilters)).append("\n");
    sb.append("    reportPreferences: ").append(toIndentedString(reportPreferences)).append("\n");
    sb.append("    selectedMerchantGroupName: ").append(toIndentedString(selectedMerchantGroupName)).append("\n");
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

