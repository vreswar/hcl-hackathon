/**
 * 
 */
package org.nextgenbank.web;

import org.nextgenbank.repository.service.UserProfileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.nextgenbank.exception.MessageCodeEnum;
import org.nextgenbank.exception.NextGenerationBankException;
import org.nextgenbank.swagger.model.UserProfileRequest;
import org.nextgenbank.swagger.model.UserProfileResponse;

/**
 * @author pushpeswar.r
 *
 */
@RestController
@RequestMapping(value = "${app.context.path}")
public class UserProfileController {
	/** property to hold the static logger instance to log data */
	private static final Logger LOGGER = LoggerFactory.getLogger(UserProfileController.class);
	/** property to hold get transaction history service */
	UserProfileService service;
	
	@CrossOrigin
	@RequestMapping(value = "/profile", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public UserProfileResponse userProfile(
			@RequestBody UserProfileRequest request) throws NextGenerationBankException {
		LOGGER.info("In userProfile method to create profile ");
		if (request != null) {
			UserProfileResponse response = service
					.createProfile(request);
			return response;
		} else {
			throw new NextGenerationBankException(MessageCodeEnum.GET_TRANSACTION_HISTORY_FAILED, "Failed to provide transaction history details.");
		}
	}
}
