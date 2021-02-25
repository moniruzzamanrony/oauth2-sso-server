package com.itvillage.auth2ssoresourceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class Auth2SsoResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Auth2SsoResourceServerApplication.class, args);
	}

}
