package org.nextgenbank.repository.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.nextgenbank.domain.UserDetail;
import org.nextgenbank.domain.UserProfile;
import org.nextgenbank.domain.UserTransactions;
import org.nextgenbank.repository.dao.UserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.nextgenbank.exception.MessageCodeEnum;
import org.nextgenbank.exception.NextGenerationBankException;


@Service
public class UserServiceImpl implements UserService {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserProfileServiceImpl.class);
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public UserDetail verifyLogin(String pUserName, String pPassword) throws NextGenerationBankException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetail getAccountSummary(UserDetail userDetailLoggedin) throws NextGenerationBankException {
		// TODO Auto-generated method stub
		return null;
	}

	
}