package org.hisrc.openskynetwork.client.api;

import com.sun.jersey.api.client.GenericType;

import org.hisrc.openskynetwork.client.invoker.ApiException;
import org.hisrc.openskynetwork.client.invoker.ApiClient;
import org.hisrc.openskynetwork.client.invoker.Configuration;
import org.hisrc.openskynetwork.client.invoker.Pair;

import org.hisrc.openskynetwork.client.model.States;



import java.util.*;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-19T00:05:49.893+01:00")

public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * 
   * Information about the currently tracked flights.
   * @param time Target timestamp
   * @return States
   */
  public States statesTimeGet(Long time) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'time' is set
     if (time == null) {
        throw new ApiException(400, "Missing the required parameter 'time' when calling statesTimeGet");
     }
     
    // create path and map variables
    String path = "/states/time".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "time", time));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<States> returnType = new GenericType<States>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

