package com.example.demoproject.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "tokenization")
public class TokenizationProperties {

	
	private String tokenZone;
	private String clientId;
	@Value(value = "tokenSource")
	private String tokenSourceApplication;
	
	public String getTokenZone() {
		return tokenZone;
	}
	public void setTokenZone(String tokenZone) {
		this.tokenZone = tokenZone;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getTokenSourceApplication() {
		return tokenSourceApplication;
	}
	public void setTokenSourceApplication(String tokenSourceApplication) {
		this.tokenSourceApplication = tokenSourceApplication;
	}
}
