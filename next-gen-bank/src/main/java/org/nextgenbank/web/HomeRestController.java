package org.nextgenbank.web;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.nextgenbank.domain.AppUser;
import org.nextgenbank.domain.Login;
import org.nextgenbank.domain.UserDetail;
import org.nextgenbank.exception.NextGenerationBankException;
import org.nextgenbank.repository.AppUserRepository;
import org.nextgenbank.repository.service.UserService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * All web services in this controller will be available for all the users
 * 
 * @author Samraj Timmapuram
 *
 */
@RestController
public class HomeRestController {
	@Autowired
	private AppUserRepository appUserRepository;
	@Autowired
	private UserService userService;
	
	/**
	 * This method is used for user registration. Note: user registration is not
	 * require any authentication.
	 * 
	 * @param appUser
	 * @return
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<AppUser> createUser(@RequestBody AppUser appUser) {
		if (appUserRepository.findOneByUsername(appUser.getUsername()) != null) {
			throw new IllegalArgumentException("Username already exist");
		}
		List<String> roles = new ArrayList<>();
		roles.add("CHILD");
		appUser.setRoles(roles);
		return new ResponseEntity<>(appUserRepository.save(appUser), HttpStatus.CREATED);
	}

	/**
	 * This method will return the logged user.
	 * 
	 * @param principal
	 * @return Principal java security principal object
	 */
	@RequestMapping("/user")
	public AppUser user(Principal principal) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String loggedUsername = auth.getName();
		return null;
	}

	/**
	 * @param username
	 * @param password
	 * @param response
	 * @return JSON contains token and user after success authentication.
	 * @throws NextGenerationBankException 
	 * 
	 */
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> login(@RequestBody Login loginUser,HttpServletResponse response) throws NextGenerationBankException{
		String token = null;
		UserDetail appUserDetails = userService.verifyLogin(loginUser.getUsername(), loginUser.getPassword());
		Map<String, Object> tokenMap = new HashMap<>();
		if (null!=appUserDetails) {
			token = generateJWTToken(appUserDetails);
			tokenMap.put("token", token);
			tokenMap.put("accountsummary", appUserDetails);
			return new ResponseEntity<>(tokenMap, HttpStatus.OK);
		} else {
			tokenMap.put("token", null);
			return new ResponseEntity<>(tokenMap, HttpStatus.UNAUTHORIZED);
		}
	}
	
	public String generateJWTToken(UserDetail appUserDetails) {
		return Jwts.builder().setSubject(appUserDetails.getUserName()).claim("roles", appUserDetails.getRoleId()).setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256, "secretkey").compact();
	}
}
