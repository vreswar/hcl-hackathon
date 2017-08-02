/**
 * 
 */
package org.nextgenbank.exception;


/**
 * @author pushpeswar.r
 *
 */
public class NextGenerationBankException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3506825307069351984L;
	private final MessageCodeEnum messageCode;
	
	
	public NextGenerationBankException(MessageCodeEnum messageCode, String message) {
		super(message);
		this.messageCode = messageCode;
	}

	/**
	 * @return the messageCode
	 */
	public MessageCodeEnum getMessageCode() {
		return messageCode;
	}
}
