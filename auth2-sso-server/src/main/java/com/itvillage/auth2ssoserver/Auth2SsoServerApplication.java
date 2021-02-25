package com.itvillage.auth2ssoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class Auth2SsoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Auth2SsoServerApplication.class, args);
	}

}
