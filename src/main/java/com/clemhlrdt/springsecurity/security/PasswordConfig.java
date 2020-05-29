package com.clemhlrdt.springsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig {

	@Bean // to be instanciated by the Java Config
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder(10);
	}
}
