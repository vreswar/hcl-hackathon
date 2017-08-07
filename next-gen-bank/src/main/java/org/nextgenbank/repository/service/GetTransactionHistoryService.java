package org.nextgenbank.repository.service;


import org.nextgenbank.exception.NextGenerationBankException;

import org.nextgenbank.swagger.model.GetTransactionHistoryResponse;

public interface GetTransactionHistoryService {
	GetTransactionHistoryResponse getTransactionHistory(String pUserName, String pAccountNumber) throws NextGenerationBankException;
}