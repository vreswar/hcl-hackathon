package org.nextgenbank.repository.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.nextgenbank.domain.UserAccountSummary;
import org.nextgenbank.domain.UserDetail;
import org.nextgenbank.domain.UserProfile;
import org.nextgenbank.domain.UserTransactions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import org.nextgenbank.exception.NextGenerationBankException;

/**
 * UserDAO class to perform user specific operations with database. 1. to verify login
 * @author pushpeswar.r
 *
 */
@Transactional
@Repository
public class UserDAOImpl implements UserDAO {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserDAOImpl.class);
	
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * method to verify the user and  password in the system.
	 * 
	 * @param pUserName - user name
	 * @param pPassword -  password
	 * @return -  returns the user details object. id will be null when not found and proper details are observed if found.
	 * @throws SmartBankCustomerException
	 */
	public UserDetail verifyLogin(String pUserName, String pPassword) throws NextGenerationBankException {
		LOGGER.info("In findCustomerByAccountNumber method, received the account number");
		UserDetail userDetail = new UserDetail();
		
		if(pUserName != null && pPassword != null) {
			TypedQuery<UserDetail> typedQuery = entityManager.createQuery("SELECT userDetail FROM USER_DETAIL userDetail WHERE userDetail.userName = :pUserName AND userDetail.password = :pPassword", UserDetail.class);
            typedQuery.setParameter("pUserName", pUserName);
            typedQuery.setParameter("pPassword", pPassword);
            
            LOGGER.info("Received the user object from database ");
		}
		
		return userDetail;
	}
	
	/**
	 * method to create profile
	 * 
	 * @param pUserName - user name
	 * @param pPassword -  password
	 * @return -  returns the user details object. id will be null when not found and proper details are observed if found.
	 * @throws SmartBankCustomerException
	 */
	public UserProfile createUserProfile(UserProfile profile) throws NextGenerationBankException {
		LOGGER.info("creating the user profile");
		entityManager.persist(profile);
		entityManager.flush();
		
		return profile;
	}
	
	
	public UserDetail createUserDetail(UserDetail detail) throws NextGenerationBankException {
		LOGGER.info("In createUserDetail to create the user");
		entityManager.persist(detail);
		entityManager.flush();
		
		return detail;
	}
	
	/**
	 * method to retrieve the transaction history details for account number.
	 * 
	 * @param pUserName - user name
	 * @return -  returns the list of user transaction details object. 
	 * @throws SmartBankCustomerException
	 */
	public List<UserTransactions> getTransactionHistory(String pAccountNumber) throws NextGenerationBankException {
		LOGGER.info("In findCustomerByAccountNumber method, received the account number");
		List<UserTransactions> transactions = new ArrayList<>();
		
		if(pAccountNumber != null) {
			TypedQuery<UserTransactions> typedQuery = entityManager.createQuery("SELECT userTransactions FROM UserTransactions userTransactions, UserAccountSummary accountSummary WHERE userTransactions.accountNumber = accountSummary.accountNumber AND userTransactions.accountNumber = :accountNumber", UserTransactions.class);
            typedQuery.setParameter("accountNumber", pAccountNumber);
            
            for (UserTransactions transaction : typedQuery.getResultList()) {
				transactions.add(transaction);
			}
            LOGGER.info("Received the user object from database ");
		}
		
		return transactions;
	}
	
	/**
	 * method to find the User Summary Details
	 * 
	 * @param pUserName - account number
	 * @return -  returns the user account summary instance with account details.
	 * @throws SmartBankCustomerException
	 */
	public UserAccountSummary getAccountSummary(String pAccountNumber) throws NextGenerationBankException {
		LOGGER.info("In findCustomerByAccountNumber method, received the account number");
		UserAccountSummary accountSummary = new UserAccountSummary();

		if (pAccountNumber != null) {

			TypedQuery<UserAccountSummary> typedAccountQuery = entityManager.createQuery(
					"SELECT accountSummary FROM UserAccountSummary accountSummary WHERE accountSummary.accountNumber = :accountNumber",
					UserAccountSummary.class);
			typedAccountQuery.setParameter("accountNumber", pAccountNumber);

			accountSummary = typedAccountQuery.getSingleResult();
			LOGGER.info("Received the user account object from database ");
		}

		return accountSummary;
	}
}