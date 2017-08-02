package org.nextgenbank.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-02T16:25:44.607+02:00")
public class UserProfileRequest   {
  
  private String title = null;
  private String firstName = null;
  private String middleName = null;
  private String accountType = null;
  private String lastName = null;
  private String shortName = null;
  private String dateOfBirth = null;
  private String nationalSecurityId = null;
  private String mobileNumber = null;
  private String emailId = null;
  private String userId = null;
  private String password = null;
  private String supportingDocBase64 = null;
  private String personalizeFlag = null;
  private String personalizedDoccBase64 = null;

  
  /**
   * provide bank customer user Id
   **/
  
  @ApiModelProperty(value = "provide bank customer user Id")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * encrypted bank customer login password
   **/
  
  @ApiModelProperty(value = "encrypted bank customer login password")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * encrypted bank customer login password
   **/
  
  @ApiModelProperty(value = "encrypted bank customer login password")
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  
  /**
   * encrypted bank customer login password
   **/
  
  @ApiModelProperty(value = "encrypted bank customer login password")
  @JsonProperty("accountType")
  public String getAccountType() {
    return accountType;
  }
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  
  /**
   * encrypted bank customer login password
   **/
  
  @ApiModelProperty(value = "encrypted bank customer login password")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * encrypted bank customer login password
   **/
  
  @ApiModelProperty(value = "encrypted bank customer login password")
  @JsonProperty("shortName")
  public String getShortName() {
    return shortName;
  }
  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  
  /**
   * encrypted bank customer login password
   **/
  
  @ApiModelProperty(value = "encrypted bank customer login password")
  @JsonProperty("dateOfBirth")
  public String getDateOfBirth() {
    return dateOfBirth;
  }
  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  
  /**
   * national security id
   **/
  
  @ApiModelProperty(value = "national security id")
  @JsonProperty("nationalSecurityId")
  public String getNationalSecurityId() {
    return nationalSecurityId;
  }
  public void setNationalSecurityId(String nationalSecurityId) {
    this.nationalSecurityId = nationalSecurityId;
  }

  
  /**
   * mobilenumber
   **/
  
  @ApiModelProperty(value = "mobilenumber")
  @JsonProperty("mobileNumber")
  public String getMobileNumber() {
    return mobileNumber;
  }
  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  
  /**
   * emailid
   **/
  
  @ApiModelProperty(value = "emailid")
  @JsonProperty("emailId")
  public String getEmailId() {
    return emailId;
  }
  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  
  /**
   * userid
   **/
  
  @ApiModelProperty(value = "userid")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * password
   **/
  
  @ApiModelProperty(value = "password")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * docs
   **/
  
  @ApiModelProperty(value = "docs")
  @JsonProperty("supportingDocBase64")
  public String getSupportingDocBase64() {
    return supportingDocBase64;
  }
  public void setSupportingDocBase64(String supportingDocBase64) {
    this.supportingDocBase64 = supportingDocBase64;
  }

  
  /**
   * personalized flag
   **/
  
  @ApiModelProperty(value = "personalized flag")
  @JsonProperty("personalizeFlag")
  public String getPersonalizeFlag() {
    return personalizeFlag;
  }
  public void setPersonalizeFlag(String personalizeFlag) {
    this.personalizeFlag = personalizeFlag;
  }

  
  /**
   * encrypted doc
   **/
  
  @ApiModelProperty(value = "encrypted doc")
  @JsonProperty("personalizedDoccBase64")
  public String getPersonalizedDoccBase64() {
    return personalizedDoccBase64;
  }
  public void setPersonalizedDoccBase64(String personalizedDoccBase64) {
    this.personalizedDoccBase64 = personalizedDoccBase64;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfileRequest userProfileRequest = (UserProfileRequest) o;
    return Objects.equals(title, userProfileRequest.title) &&
        Objects.equals(firstName, userProfileRequest.firstName) &&
        Objects.equals(middleName, userProfileRequest.middleName) &&
        Objects.equals(accountType, userProfileRequest.accountType) &&
        Objects.equals(lastName, userProfileRequest.lastName) &&
        Objects.equals(shortName, userProfileRequest.shortName) &&
        Objects.equals(dateOfBirth, userProfileRequest.dateOfBirth) &&
        Objects.equals(nationalSecurityId, userProfileRequest.nationalSecurityId) &&
        Objects.equals(mobileNumber, userProfileRequest.mobileNumber) &&
        Objects.equals(emailId, userProfileRequest.emailId) &&
        Objects.equals(userId, userProfileRequest.userId) &&
        Objects.equals(password, userProfileRequest.password) &&
        Objects.equals(supportingDocBase64, userProfileRequest.supportingDocBase64) &&
        Objects.equals(personalizeFlag, userProfileRequest.personalizeFlag) &&
        Objects.equals(personalizedDoccBase64, userProfileRequest.personalizedDoccBase64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, firstName, middleName, accountType, lastName, shortName, dateOfBirth, nationalSecurityId, mobileNumber, emailId, userId, password, supportingDocBase64, personalizeFlag, personalizedDoccBase64);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfileRequest {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    nationalSecurityId: ").append(toIndentedString(nationalSecurityId)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    supportingDocBase64: ").append(toIndentedString(supportingDocBase64)).append("\n");
    sb.append("    personalizeFlag: ").append(toIndentedString(personalizeFlag)).append("\n");
    sb.append("    personalizedDoccBase64: ").append(toIndentedString(personalizedDoccBase64)).append("\n");
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

