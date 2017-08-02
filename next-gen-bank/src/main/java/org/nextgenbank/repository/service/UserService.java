package org.nextgenbank.repository.service;

import org.nextgenbank.domain.UserDetail;

import org.nextgenbank.exception.NextGenerationBankException;

/**
 * Interface contract for user DAO to have verify login method implemented. T
 * his will throws exception of NextGenerationBankException 
 * @author pushpeswar.r
 *
 */
public interface UserService {
	UserDetail verifyLogin(String pUserName, String pPassword) throws NextGenerationBankException;
	UserDetail getAccountSummary(UserDetail userDetailLoggedin) throws NextGenerationBankException;
}