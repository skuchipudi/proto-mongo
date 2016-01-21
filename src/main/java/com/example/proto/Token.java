package com.example.proto;



public class Token {

	private String _secretKey;
	
	public Token () {
	}
	
	public Token (String secretKey)
	{
		this._secretKey=secretKey;
	}

	public String getSecretKey() {
		return _secretKey;
	}

	public void setSecretKey(String secretKey) {
		this._secretKey = secretKey;
	}
	
}
