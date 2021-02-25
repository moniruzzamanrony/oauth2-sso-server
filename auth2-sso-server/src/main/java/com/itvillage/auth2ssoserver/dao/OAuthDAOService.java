package com.itvillage.auth2ssoserver.dao;


import com.itvillage.auth2ssoserver.model.UserEntity;

public interface OAuthDAOService {

	public UserEntity getUserDetails(String emailId);
}
