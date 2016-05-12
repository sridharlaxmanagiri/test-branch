package com.kewill.cdr;

import java.io.IOException;

import javax.ws.rs.core.MediaType;

import com.kewill.cdr.bean.CdrConfigurationBean;
import com.kewill.cdr.bean.DocumentServiceResponse;
import com.kewill.cdr.bean.ReportDefinition;
import com.kewill.cdr.constants.CustomMediaType;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.core.util.FeaturesAndProperties;

public class CdrServiceClient {

	private static CdrConfigurationBean getConfigBean(){
		CdrConfigurationBean configBean = new CdrConfigurationBean();
		configBean.setAccessTolenURL("https://10.200.35.11:9448/oauth2/token");
		configBean.setClientID("pK7uRKu8rT5L7fRh_rEZ0pGyNcwa");
		configBean.setClientSecret("Tf5WgX4zNz3SD6KjZlZylTWHkBQa");
		configBean.setUserName("admin");
		configBean.setPassword("admin");
		configBean.setDocumentWebServiceURl("http://10.200.35.11:8284/cdrService/doGenerateReport");
		return configBean;
	}
	
	public static byte[] invokeService(ReportDefinition dob) throws IOException{
		CdrConfigurationBean configBean = getConfigBean();
		byte[] documentBytes = null;
		String accessToken = "Bearer " + OauthClient.getAccessToken(configBean);
		DefaultClientConfig config = new DefaultClientConfig();
		config.getProperties().put(ClientConfig.FEATURE_DISABLE_XML_SECURITY,true);
		config.getFeatures().put(
				FeaturesAndProperties.FEATURE_DISABLE_XML_SECURITY, true);
		Client c = Client.create(config);
		c.setReadTimeout(10000000);
		WebResource webResource = c.resource(configBean.getDocumentWebServiceURl());
		ClientResponse response = webResource
				.accept(MediaType.APPLICATION_XML)
				.header("Authorization", accessToken)
				.type(CustomMediaType.APPLICATION_XML)
				.post(ClientResponse.class, dob);
		
		 DocumentServiceResponse docResponse = response.getEntity(DocumentServiceResponse.class);
		 if(docResponse.getDocument() != null) {
			 	documentBytes = docResponse.getDocument();
			    System.out.println(docResponse.getResponseMessage());
						
		 } else {
			 System.out.println("Report generation failed due to following error");
			 System.out.println(docResponse.getResponseMessage());
		 }
		return documentBytes;
	}

}
