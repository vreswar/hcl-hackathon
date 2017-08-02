package org.nextgenbank.repository.service;

import org.nextgenbank.domain.UserDetail;
import org.nextgenbank.exception.NextGenerationBankException;
import org.nextgenbank.repository.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDAO userDAO;
	@Override
	public UserDetail verifyLogin(String pUserName, String pPassword) throws NextGenerationBankException {
		return userDAO.verifyLogin(pUserName, pPassword);
	}

	@Override
	public UserDetail getAccountSummary(UserDetail userDetailLoggedin) throws NextGenerationBankException {
		// TODO Auto-generated method stub
		return null;
	}

}
