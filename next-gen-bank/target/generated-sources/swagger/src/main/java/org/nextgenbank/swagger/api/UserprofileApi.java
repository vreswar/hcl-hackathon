package org.nextgenbank.swagger.api;

import org.nextgenbank.swagger.ApiException;
import org.nextgenbank.swagger.ApiClient;
import org.nextgenbank.swagger.Configuration;
import org.nextgenbank.swagger.Pair;

import javax.ws.rs.core.GenericType;

import org.nextgenbank.swagger.model.Errors;
import org.nextgenbank.swagger.model.UserProfileResponse;
import org.nextgenbank.swagger.model.UserProfileRequest;
import java.util.Date;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-02T16:25:44.607+02:00")
public class UserprofileApi {
  private ApiClient apiClient;

  public UserprofileApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserprofileApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * post-search
   * 
   * @param authorization 
   * @param _contentType 
   * @param activityid 
   * @param userProfileRequest Bank customer registration request information
   * @param _accept 
   * @param applicationuserid 
   * @param sessionid 
   * @param interactionid 
   * @param workflowid 
   * @param timestamp 
   * @param storeid 
   * @param terminalid 
   * @param tillid 
   * @param dealercode 
   * @param segmentationid 
   * @param authcustomerid 
   * @param authfinancialaccountid 
   * @param authlineofserviceid 
   * @param accessControlRequestHeaders 
   * @param accessControlRequestMethod 
   * @param ifMatch 
   * @param ifModifiedSince 
   * @param ifNoneMatch 
   * @param origin 
   * @return UserProfileResponse
   */
  public UserProfileResponse postSearch(String authorization, String _contentType, String activityid, UserProfileRequest userProfileRequest, String _accept, String applicationuserid, String sessionid, String interactionid, String workflowid, Date timestamp, String storeid, String terminalid, String tillid, Integer dealercode, String segmentationid, String authcustomerid, String authfinancialaccountid, String authlineofserviceid, String accessControlRequestHeaders, String accessControlRequestMethod, String ifMatch, String ifModifiedSince, String ifNoneMatch, String origin) throws ApiException {
    Object postBody = userProfileRequest;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling postSearch");
    }
    
    // verify the required parameter '_contentType' is set
    if (_contentType == null) {
      throw new ApiException(400, "Missing the required parameter '_contentType' when calling postSearch");
    }
    
    // verify the required parameter 'activityid' is set
    if (activityid == null) {
      throw new ApiException(400, "Missing the required parameter 'activityid' when calling postSearch");
    }
    
    // create path and map variables
    String path = "/userprofile".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (authorization != null)
    headerParams.put("Authorization", apiClient.parameterToString(authorization));
    if (_contentType != null)
    headerParams.put("Content-type", apiClient.parameterToString(_contentType));
    if (_accept != null)
    headerParams.put("Accept", apiClient.parameterToString(_accept));
    if (applicationuserid != null)
    headerParams.put("applicationuserid", apiClient.parameterToString(applicationuserid));
    if (sessionid != null)
    headerParams.put("sessionid", apiClient.parameterToString(sessionid));
    if (interactionid != null)
    headerParams.put("interactionid", apiClient.parameterToString(interactionid));
    if (activityid != null)
    headerParams.put("activityid", apiClient.parameterToString(activityid));
    if (workflowid != null)
    headerParams.put("workflowid", apiClient.parameterToString(workflowid));
    if (timestamp != null)
    headerParams.put("timestamp", apiClient.parameterToString(timestamp));
    if (storeid != null)
    headerParams.put("storeid", apiClient.parameterToString(storeid));
    if (terminalid != null)
    headerParams.put("terminalid", apiClient.parameterToString(terminalid));
    if (tillid != null)
    headerParams.put("tillid", apiClient.parameterToString(tillid));
    if (dealercode != null)
    headerParams.put("dealercode", apiClient.parameterToString(dealercode));
    if (segmentationid != null)
    headerParams.put("segmentationid", apiClient.parameterToString(segmentationid));
    if (authcustomerid != null)
    headerParams.put("authcustomerid", apiClient.parameterToString(authcustomerid));
    if (authfinancialaccountid != null)
    headerParams.put("authfinancialaccountid", apiClient.parameterToString(authfinancialaccountid));
    if (authlineofserviceid != null)
    headerParams.put("authlineofserviceid", apiClient.parameterToString(authlineofserviceid));
    if (accessControlRequestHeaders != null)
    headerParams.put("Access-Control-Request-Headers", apiClient.parameterToString(accessControlRequestHeaders));
    if (accessControlRequestMethod != null)
    headerParams.put("Access-Control-Request-Method", apiClient.parameterToString(accessControlRequestMethod));
    if (ifMatch != null)
    headerParams.put("If-Match", apiClient.parameterToString(ifMatch));
    if (ifModifiedSince != null)
    headerParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));
    if (ifNoneMatch != null)
    headerParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));
    if (origin != null)
    headerParams.put("Origin", apiClient.parameterToString(origin));
    

    

    final String[] accepts = {
      "application/json", "application/xml"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json", "application/xml"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<UserProfileResponse> returnType = new GenericType<UserProfileResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
