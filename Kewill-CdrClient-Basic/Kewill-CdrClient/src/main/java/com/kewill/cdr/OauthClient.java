package com.kewill.cdr;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.common.message.types.GrantType;

import com.kewill.cdr.bean.CdrConfigurationBean;


public class OauthClient {

	public static String getAccessToken(CdrConfigurationBean configBean) {
			init();
			String accessToken = null;
			try
		    {
		        OAuthClientRequest  request = OAuthClientRequest
		                .tokenLocation(configBean.getAccessTolenURL())
		                .setClientId(configBean.getClientID())
		                .setUsername(configBean.getUserName())
		                .setPassword(configBean.getPassword())
		                .setClientSecret(configBean.getClientSecret())	
		                .setGrantType(GrantType.PASSWORD)
		                .buildBodyMessage();/** or buildHeaderMessage() or buildQueryMessage()*/
		        OAuthClient oAuthClient = new OAuthClient(new URLConnectionClient());
		        oAuthClient.accessToken(request);
		        OAuthJSONAccessTokenResponse tokenResponse = oAuthClient.accessToken(request, OAuthJSONAccessTokenResponse.class);
		        accessToken = tokenResponse.getAccessToken();
		    }
		    catch (Exception e)
		    {
		        e.printStackTrace();
		    }
			return accessToken;
		}
		
	private static void init() {
			try{
				SSLContext sc;
				// Get SSL context
				sc = SSLContext.getInstance("SSL");
				// Create empty HostnameVerifier
				HostnameVerifier hv = new HostnameVerifier() {
					public boolean verify(String urlHostName, SSLSession session) {
						return true;
					}
				};

				// Create a trust manager that does not validate certificate chains
				TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
					public java.security.cert.X509Certificate[] getAcceptedIssuers() {
						return null;
					}

					public void checkClientTrusted(java.security.cert.X509Certificate[] certs,
							String authType) {
					}

					public void checkServerTrusted(java.security.cert.X509Certificate[] certs,
							String authType) {
					}
				} };

				sc.init(null, trustAllCerts, new java.security.SecureRandom());
		        SSLContext.setDefault(sc);
				HttpsURLConnection.setDefaultHostnameVerifier(hv);
			}catch(Exception e){
				e.printStackTrace();
			}
		}

}
