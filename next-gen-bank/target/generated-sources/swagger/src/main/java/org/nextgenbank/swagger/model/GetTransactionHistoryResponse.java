package org.nextgenbank.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import org.nextgenbank.swagger.model.TransactionDetails;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-02T16:25:44.607+02:00")
public class GetTransactionHistoryResponse   {
  
  private String accountType = null;
  private String accountNumber = null;
  private String balance = null;
  private String currencyCode = null;
  private List<TransactionDetails> transactions = new ArrayList<TransactionDetails>();

  
  /**
   * provide bank customer account Type
   **/
  
  @ApiModelProperty(value = "provide bank customer account Type")
  @JsonProperty("accountType")
  public String getAccountType() {
    return accountType;
  }
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  
  /**
   * encrypted bank customer account number
   **/
  
  @ApiModelProperty(value = "encrypted bank customer account number")
  @JsonProperty("accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  
  /**
   * encrypted bank customer balance
   **/
  
  @ApiModelProperty(value = "encrypted bank customer balance")
  @JsonProperty("balance")
  public String getBalance() {
    return balance;
  }
  public void setBalance(String balance) {
    this.balance = balance;
  }

  
  /**
   * encrypted bank customer currency code
   **/
  
  @ApiModelProperty(value = "encrypted bank customer currency code")
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("transactions")
  public List<TransactionDetails> getTransactions() {
    return transactions;
  }
  public void setTransactions(List<TransactionDetails> transactions) {
    this.transactions = transactions;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransactionHistoryResponse getTransactionHistoryResponse = (GetTransactionHistoryResponse) o;
    return Objects.equals(accountType, getTransactionHistoryResponse.accountType) &&
        Objects.equals(accountNumber, getTransactionHistoryResponse.accountNumber) &&
        Objects.equals(balance, getTransactionHistoryResponse.balance) &&
        Objects.equals(currencyCode, getTransactionHistoryResponse.currencyCode) &&
        Objects.equals(transactions, getTransactionHistoryResponse.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, accountNumber, balance, currencyCode, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionHistoryResponse {\n");
    
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

