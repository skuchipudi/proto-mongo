package com.example.proto;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.Assert;

// This captures the RegistrationInfo that the Subscriber needs to provide to the APE.

public class RegistrationInfo {
	
	@Id
	private String id;
	private Token token;
	

	private String serverAddress;
	private String userId;
	private String password;
	private String remoteDirectory;
	private String localDirectory;
	

	public RegistrationInfo() {}
	
	public RegistrationInfo (Token token, 
							 String serverAddress, 
							 String remoteDirectory,
							 String localDirectory,
							 String userId,
							 String password ) 
	{
			
			Assert.hasText(serverAddress);
			Assert.hasText(remoteDirectory);
			Assert.hasText(localDirectory);
			Assert.hasText(userId);
			Assert.hasText(password);

			this.token=token;
			this.serverAddress = serverAddress;
			this.remoteDirectory = remoteDirectory;
			this.localDirectory = localDirectory;
			this.userId = userId;
			this.password = password;
	}
	
	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	public String getServerAddress() {
		return serverAddress;
	}

	public void setServerAddress(String serverAddress) {
		this.serverAddress = serverAddress;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRemoteDirectory() {
		return remoteDirectory;
	}

	public void setRemoteDirectory(String remoteDirectory) {
		this.remoteDirectory = remoteDirectory;
	}

	public String getLocalDirectory() {
		return localDirectory;
	}

	public void setLocalDirectory(String localDirectory) {
		this.localDirectory = localDirectory;
	}
	
	
	/**
	 * This is a toString() method. Only use for Debugging. Remove calls before production
	 */
	@Override
	public String toString()
	{
		return String.format(
				"RegistrationInfo[token=%s, serverAddress='%s', remoteDirectory='%s',localDirectory='%s', userId='%s', password='%s']",
				token,serverAddress,remoteDirectory,localDirectory, userId, password);
	}

	
}
