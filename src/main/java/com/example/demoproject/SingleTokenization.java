package com.example.demoproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.demoproject.config.TokenizationProperties;

@Component
public class SingleTokenization {

	@Autowired
	TokenizationProperties tokenProp;
	
	public void get() {
		//System.out.println(tokenProp.getTokenZone());
		//System.out.println(tokenProp.getClientId());
		System.out.println(tokenProp.getTokenSourceApplication());
	}
}
