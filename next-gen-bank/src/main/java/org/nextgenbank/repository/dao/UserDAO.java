package org.nextgenbank.repository.dao;

import java.util.List;

import org.nextgenbank.domain.UserDetail;
import org.nextgenbank.domain.UserProfile;
import org.nextgenbank.domain.UserTransactions;
import org.nextgenbank.exception.NextGenerationBankException;

/**
 * Interface contract for user DAO to have verify login method implemented. T
 * his will throws exception of NextGenerationBankException 
 * @author pushpeswar.r
 *
 */
public interface UserDAO {
	UserDetail verifyLogin(String pUserName, String pPassword) throws NextGenerationBankException;
	List<UserTransactions> getTransactionHistory(String pUserName, String pPassword) throws NextGenerationBankException;
	UserDetail createUserDetail(UserDetail detail) throws NextGenerationBankException;
	UserProfile createUserProfile(UserProfile profile) throws NextGenerationBankException;
}