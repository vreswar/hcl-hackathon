package org.nextgenbank.repository.service;

import org.nextgenbank.exception.NextGenerationBankException;

import org.nextgenbank.swagger.model.UserProfileRequest;
import org.nextgenbank.swagger.model.UserProfileResponse;


public interface UserProfileService {
	UserProfileResponse createProfile(UserProfileRequest request) throws NextGenerationBankException;
}