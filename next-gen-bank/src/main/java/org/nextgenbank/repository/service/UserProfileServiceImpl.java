package org.nextgenbank.repository.service;

import java.util.Calendar;

import org.nextgenbank.domain.UserDetail;
import org.nextgenbank.domain.UserProfile;
import org.nextgenbank.repository.dao.UserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.nextgenbank.exception.NextGenerationBankException;
import com.nextgenbank.swagger.model.UserProfileRequest;
import com.nextgenbank.swagger.model.UserProfileResponse;

@Service
public class UserProfileServiceImpl implements UserProfileService {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserProfileServiceImpl.class);
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public UserProfileResponse createProfile(UserProfileRequest request) throws NextGenerationBankException{
		LOGGER.info("In getTransactionHistory response");
		UserProfileResponse response = new UserProfileResponse();
		
		UserDetail detail = userDAO.createUserDetail(mapRequestToUserDetail(request));
		userDAO.createUserProfile(mapRequestToUserProfile(request, Integer.valueOf(detail.getRoleId())));
		
			
		return response;
	}

	private UserDetail mapRequestToUserDetail(UserProfileRequest request) {
		UserDetail detail = new UserDetail();
		if(request != null) {
			detail.setCreatedDate(Calendar.getInstance().getTime()); 
			detail.setPassword(request.getPassword());
			detail.setRoleId("2");
			detail.setUserName(request.getUserId());
		}
		return detail;
	}
	
	private UserProfile mapRequestToUserProfile(UserProfileRequest request, Integer pRoleId ) {
		UserProfile userProfile = new UserProfile();
		if(request != null) {
			userProfile.setFirstName(request.getFirstName()); 
			userProfile.setLastName(request.getLastName());
			userProfile.setTitle(request.getEmailId());
			userProfile.setMobileNumber(request.getMobileNumber());
			userProfile.setRoleId(pRoleId);
			userProfile.setTitle(request.getTitle());
		}
		return userProfile;
	}

	
}