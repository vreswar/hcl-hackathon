package org.nextgenbank.repository.service;

import java.util.ArrayList;
import java.util.List;

import org.nextgenbank.domain.UserAccountSummary;
import org.nextgenbank.domain.UserTransactions;
import org.nextgenbank.exception.MessageCodeEnum;
import org.nextgenbank.exception.NextGenerationBankException;
import org.nextgenbank.repository.dao.UserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import org.nextgenbank.swagger.model.GetTransactionHistoryResponse;
import org.nextgenbank.swagger.model.TransactionDetails;

@Service
public class GetTransactionHistoryServiceImpl implements GetTransactionHistoryService {
	private static final Logger LOGGER = LoggerFactory.getLogger(GetTransactionHistoryServiceImpl.class);
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public GetTransactionHistoryResponse getTransactionHistory(String pAccountNumber) throws NextGenerationBankException {
		LOGGER.info("In getTransactionHistory response");
		GetTransactionHistoryResponse response = new GetTransactionHistoryResponse();
		List<TransactionDetails> transactionDetailsList = new ArrayList<TransactionDetails>();
		if(pAccountNumber != null) {
			List<UserTransactions> transactions = userDAO.getTransactionHistory(pAccountNumber);
			UserAccountSummary accountSummary = userDAO.getAccountSummary(pAccountNumber);
			
			if(accountSummary != null) {
				response.setAccountNumber(pAccountNumber);
				response.setAccountType(accountSummary.getAccountType());
				response.setBalance(String.valueOf(accountSummary.getBalance()));
				response.setCurrencyCode(accountSummary.getCurrencyCode());
			}
			
			for (UserTransactions userTransactions : transactions) {
				final TransactionDetails details = new TransactionDetails();
				details.setIsDebit(userTransactions.getIsDebit());
				details.setTransactionAmount(Integer.valueOf(userTransactions.getTransactionAmount()).toString());
				details.setTransactionDate(userTransactions.getTransactionDate().toString());
				details.setTransactionDetail(userTransactions.getTransactionDetail());
				details.setTransactionShortForm(userTransactions.getTransactionShortForm());
				details.setTransactionType(userTransactions.getTransactionType());
				transactionDetailsList.add(details);
			}
			response.setTransactions(transactionDetailsList);
			
		} else {
			throw new NextGenerationBankException(MessageCodeEnum.INVALID_REQUEST, "Request data is not available to process the request. Please provide valid inputs to continue.");
		}

		return response;
	}

	
}