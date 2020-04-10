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
 * The public key in DER format. Used to validate the response from the Tokenize Card request. Additionally this format is useful for client side encryption in Android and iOS implementations.
 */
@ApiModel(description = "The public key in DER format. Used to validate the response from the Tokenize Card request. Additionally this format is useful for client side encryption in Android and iOS implementations.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-09T11:41:34.789+05:30")
public class DerPublicKey {
  @SerializedName("format")
  private String format = null;

  @SerializedName("algorithm")
  private String algorithm = null;

  @SerializedName("publicKey")
  private String publicKey = null;

  public DerPublicKey format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Specifies the format of the public key; currently X.509.
   * @return format
  **/
  @ApiModelProperty(value = "Specifies the format of the public key; currently X.509.")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public DerPublicKey algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

   /**
   * Algorithm used to encrypt the public key.
   * @return algorithm
  **/
  @ApiModelProperty(value = "Algorithm used to encrypt the public key.")
  public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  public DerPublicKey publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Base64 encoded public key value.
   * @return publicKey
  **/
  @ApiModelProperty(value = "Base64 encoded public key value.")
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DerPublicKey derPublicKey = (DerPublicKey) o;
    return Objects.equals(this.format, derPublicKey.format) &&
        Objects.equals(this.algorithm, derPublicKey.algorithm) &&
        Objects.equals(this.publicKey, derPublicKey.publicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, algorithm, publicKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DerPublicKey {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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

