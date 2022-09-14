package com.nidservices.yekoregistration.model;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User implements Serializable {
	private UUID id;
	private String userIdentifier;
	private String userType;
	
	
	public String getUserIdentifier() {
		return userIdentifier;
	}
	public void setUserIdentifier(String userIdentifier) {
		this.userIdentifier = userIdentifier;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
	@Override
	public String toString() {
		return "User [userIdentifier=" + userIdentifier + ", UserType=" + userType + "]";
		
	}

}
