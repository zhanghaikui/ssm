package cn.itcast.domain;

import java.io.Serializable;

/**
 * 帐户
 */
public class Account implements Serializable{

    private String USER_NAME;

	public String getUSER_NAME() {
		return USER_NAME;
	}

	@Override
	public String toString() {
		return "Account [USER_NAME=" + USER_NAME + "]";
	}

	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
    
    
}
