package me.whiteship.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.whiteship.UserService;

@Configuration
public class ServiceConfig {

	@Bean
	public UserService userService() {
		return userService();
	}
}
