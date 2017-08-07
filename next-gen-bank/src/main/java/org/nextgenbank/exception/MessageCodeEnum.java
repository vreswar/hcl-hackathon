package org.nextgenbank.exception;

public enum MessageCodeEnum {

	
	FAILED_REQUEST								("1002", "Failed to make request",""),
	USER_VALIDATION_FAIL         				("1003", "Failed to validate user information", ""),
	GET_TRANSACTION_HISTORY_FAILED 				("1004", "Failed to retrieve transaction history details", ""),
	DELETE_TRANSACTION_FAILURE    				("1003", "Failed to Delete the customer", ""),
	CUSTOMER_LOOKUP_FAILED                      ("1003", "Failed to perform find customer by account number", ""),
	INVALID_REQUEST							    ("1005","Invalid Request","");
	
	private String statusCode;
	private String userMessage;
	private String systemMessage;

	MessageCodeEnum(final String statusCode, final String userMessage, final String systemMessage) {
		this.statusCode = statusCode;
		this.userMessage = userMessage;
		this.systemMessage = systemMessage;
	}

	public String getStatusCode() {
		return statusCode;
	}
	public String getUserMessage() {
		return userMessage;
	}
	public String getSystemMessage() {
		return systemMessage;
	}
	public void setSystemMessage(String systemMessage) {
		this.systemMessage= systemMessage;
	}
}