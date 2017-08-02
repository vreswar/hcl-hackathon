package org.nextgenbank.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Used to pass error information in a response.
 **/

@ApiModel(description = "Used to pass error information in a response.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-02T16:25:44.607+02:00")
public class ResponseError   {
  
  private String code = null;
  private String userMessage = null;
  private String systemMessage = null;

  
  /**
   * Used to pass error codes
   **/
  
  @ApiModelProperty(value = "Used to pass error codes")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   * Use to pass human friendly information to the user.
   **/
  
  @ApiModelProperty(value = "Use to pass human friendly information to the user.")
  @JsonProperty("userMessage")
  public String getUserMessage() {
    return userMessage;
  }
  public void setUserMessage(String userMessage) {
    this.userMessage = userMessage;
  }

  
  /**
   * Used to pass system information.
   **/
  
  @ApiModelProperty(value = "Used to pass system information.")
  @JsonProperty("systemMessage")
  public String getSystemMessage() {
    return systemMessage;
  }
  public void setSystemMessage(String systemMessage) {
    this.systemMessage = systemMessage;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseError responseError = (ResponseError) o;
    return Objects.equals(code, responseError.code) &&
        Objects.equals(userMessage, responseError.userMessage) &&
        Objects.equals(systemMessage, responseError.systemMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, userMessage, systemMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    userMessage: ").append(toIndentedString(userMessage)).append("\n");
    sb.append("    systemMessage: ").append(toIndentedString(systemMessage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

