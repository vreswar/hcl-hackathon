package org.nextgenbank.repository.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

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
	 * method to verify the user and  password in the system.
	 * 
	 * @param pUserName - user name
	 * @param pPassword -  password
	 * @return -  returns the list of user details object. id will be null when not found and proper details are observed if found.
	 * @throws SmartBankCustomerException
	 */
	public List<UserTransactions> getTransactionHistory(String pUserName, String pPassword) throws NextGenerationBankException {
		LOGGER.info("In findCustomerByAccountNumber method, received the account number");
		List<UserTransactions> transactions = new ArrayList<>();
		
		if(pUserName != null && pPassword != null) {
			TypedQuery<UserTransactions> typedQuery = entityManager.createQuery("SELECT userTransactions FROM UserTransactions userTransactions, UserAccountSummary accountSummary WHERE userTransactions.accountNumber = accountSummary.accountNumber AND accountSummary.userId = :userId and UserProfile.id = accountSummary.userId", UserTransactions.class);
            typedQuery.setParameter("userId", pUserName);
            typedQuery.setParameter("pPassword", pPassword);
            
            for (UserTransactions transaction : typedQuery.getResultList()) {
				transactions.add(transaction);
			}
            LOGGER.info("Received the user object from database ");
		}
		
		return transactions;
	}
}