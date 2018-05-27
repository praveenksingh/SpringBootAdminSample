package com.bootadmin.SprinBootClient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Praveen Singh
 */
@SpringBootApplication
public class SpringBootClient2Application {

	//Change security config to allow all requests
	@Configuration
	public static class SecurityPermitAllConfig extends WebSecurityConfigurerAdapter {
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests().anyRequest().permitAll()
					.and().csrf().disable();
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootClient2Application.class, args);
	}
}
