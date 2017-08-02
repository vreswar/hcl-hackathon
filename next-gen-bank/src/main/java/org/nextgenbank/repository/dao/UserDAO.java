package org.nextgenbank.repository.dao;

import org.nextgenbank.domain.UserDetail;

import org.nextgenbank.exception.NextGenerationBankException;

/**
 * Interface contract for user DAO to have verify login method implemented. T
 * his will throws exception of NextGenerationBankException 
 * @author pushpeswar.r
 *
 */
public interface UserDAO {
	UserDetail verifyLogin(String pUserName, String pPassword) throws NextGenerationBankException;
}