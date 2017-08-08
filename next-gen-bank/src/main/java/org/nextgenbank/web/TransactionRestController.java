/**
 * 
 */
package org.nextgenbank.web;

import org.nextgenbank.exception.MessageCodeEnum;
import org.nextgenbank.exception.NextGenerationBankException;
import org.nextgenbank.repository.service.GetTransactionHistoryService;
import org.nextgenbank.swagger.model.GetTransactionHistoryRequest;
import org.nextgenbank.swagger.model.GetTransactionHistoryResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pushpeswar.r
 *
 */
@RestController
@RequestMapping(value = "${app.context.path}")
public class TransactionRestController {
	/** property to hold the static logger instance to log data */
	private static final Logger LOGGER = LoggerFactory.getLogger(TransactionRestController.class);
	/** property to hold get transaction history service */
	@Autowired
	GetTransactionHistoryService service;
	
	@CrossOrigin
	@RequestMapping(value = "/getTransactionHistory", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public GetTransactionHistoryResponse getTransactionHistory(
			@RequestBody GetTransactionHistoryRequest request) throws NextGenerationBankException {
		LOGGER.info("In getTransactionHistory method to get transaction history ");
		if (request != null) {
			GetTransactionHistoryResponse response = service
					.getTransactionHistory(request.getAccountNumber());
			return response;
		} else {
			throw new NextGenerationBankException(MessageCodeEnum.GET_TRANSACTION_HISTORY_FAILED, "Failed to provide transaction history details.");
		}
	}
}
