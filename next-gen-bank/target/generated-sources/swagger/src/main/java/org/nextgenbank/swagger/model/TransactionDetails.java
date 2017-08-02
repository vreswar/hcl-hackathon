package org.nextgenbank.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-02T16:25:44.607+02:00")
public class TransactionDetails   {
  
  private String transactionType = null;
  private String transactionShortForm = null;
  private String transactionDetail = null;
  private String transactionDate = null;
  private String transactionAmount = null;
  private String isDebit = null;

  
  /**
   * transaction type
   **/
  
  @ApiModelProperty(value = "transaction type")
  @JsonProperty("transactionType")
  public String getTransactionType() {
    return transactionType;
  }
  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  
  /**
   * transaction Short Form
   **/
  
  @ApiModelProperty(value = "transaction Short Form")
  @JsonProperty("transactionShortForm")
  public String getTransactionShortForm() {
    return transactionShortForm;
  }
  public void setTransactionShortForm(String transactionShortForm) {
    this.transactionShortForm = transactionShortForm;
  }

  
  /**
   * transaction Detail
   **/
  
  @ApiModelProperty(value = "transaction Detail")
  @JsonProperty("transactionDetail")
  public String getTransactionDetail() {
    return transactionDetail;
  }
  public void setTransactionDetail(String transactionDetail) {
    this.transactionDetail = transactionDetail;
  }

  
  /**
   * transaction Date
   **/
  
  @ApiModelProperty(value = "transaction Date")
  @JsonProperty("transactionDate")
  public String getTransactionDate() {
    return transactionDate;
  }
  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }

  
  /**
   * transaction Amount
   **/
  
  @ApiModelProperty(value = "transaction Amount")
  @JsonProperty("transactionAmount")
  public String getTransactionAmount() {
    return transactionAmount;
  }
  public void setTransactionAmount(String transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  
  /**
   * transaction is debit
   **/
  
  @ApiModelProperty(value = "transaction is debit")
  @JsonProperty("isDebit")
  public String getIsDebit() {
    return isDebit;
  }
  public void setIsDebit(String isDebit) {
    this.isDebit = isDebit;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionDetails transactionDetails = (TransactionDetails) o;
    return Objects.equals(transactionType, transactionDetails.transactionType) &&
        Objects.equals(transactionShortForm, transactionDetails.transactionShortForm) &&
        Objects.equals(transactionDetail, transactionDetails.transactionDetail) &&
        Objects.equals(transactionDate, transactionDetails.transactionDate) &&
        Objects.equals(transactionAmount, transactionDetails.transactionAmount) &&
        Objects.equals(isDebit, transactionDetails.isDebit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionType, transactionShortForm, transactionDetail, transactionDate, transactionAmount, isDebit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDetails {\n");
    
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    transactionShortForm: ").append(toIndentedString(transactionShortForm)).append("\n");
    sb.append("    transactionDetail: ").append(toIndentedString(transactionDetail)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    isDebit: ").append(toIndentedString(isDebit)).append("\n");
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

