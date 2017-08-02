package org.nextgenbank.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-02T16:25:44.607+02:00")
public class GetTransactionHistoryRequest   {
  
  private String userId = null;
  private String accountNumber = null;

  
  /**
   * provide bank customer user Id
   **/
  
  @ApiModelProperty(value = "provide bank customer user Id")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * encrypted bank customer login password
   **/
  
  @ApiModelProperty(value = "encrypted bank customer login password")
  @JsonProperty("accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransactionHistoryRequest getTransactionHistoryRequest = (GetTransactionHistoryRequest) o;
    return Objects.equals(userId, getTransactionHistoryRequest.userId) &&
        Objects.equals(accountNumber, getTransactionHistoryRequest.accountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, accountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionHistoryRequest {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
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

