/*
 * Created on 5 Sep 2017 ( Time 14:30:03 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */

package com.nmac.payments.security;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
@ComponentScan("co.rtapps.security")
@Order(99999)
public class ServiceSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.cors().and()
		.httpBasic().and().authorizeRequests()
			.antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
			.antMatchers("/user/**").hasAuthority("ROLE_ADMIN")
			.antMatchers(HttpMethod.POST,"/user/add").hasAnyAuthority("ROLE_ADMIN")
			.antMatchers(HttpMethod.DELETE,"/user/**").hasAnyAuthority("ROLE_ADMIN")
			.antMatchers("/**").hasAnyAuthority("ROLE_USER","ROLE_ADMIN")
/*
* Generated for each one of the end points
* Uncomment for more control
*/
/*

                .antMatchers(HttpMethod.GET, "/nmacpymntacntshss/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.POST, "/nmacpymntacntshss/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.PUT, "/nmacpymntacntshss/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.DELETE, "/nmacpymntacntshss/**").hasAnyAuthority("ROLE_USER")

                .antMatchers(HttpMethod.GET, "/nmacpymntshss/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.POST, "/nmacpymntshss/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.PUT, "/nmacpymntshss/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.DELETE, "/nmacpymntshss/**").hasAnyAuthority("ROLE_USER")

                .antMatchers(HttpMethod.GET, "/nmacpymntss/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.POST, "/nmacpymntss/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.PUT, "/nmacpymntss/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.DELETE, "/nmacpymntss/**").hasAnyAuthority("ROLE_USER")

                .antMatchers(HttpMethod.GET, "/nmacpymntacntss/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.POST, "/nmacpymntacntss/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.PUT, "/nmacpymntacntss/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.DELETE, "/nmacpymntacntss/**").hasAnyAuthority("ROLE_USER")

                .antMatchers(HttpMethod.GET, "/nmacusrprfls/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.POST, "/nmacusrprfls/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.PUT, "/nmacusrprfls/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.DELETE, "/nmacusrprfls/**").hasAnyAuthority("ROLE_USER")
*/
/*
* Generated for each one of the end points
* Uncomment for more control.
*/
/*

                .antMatchers(HttpMethod.GET, "/api/v1/nmacpymntacntshs/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.POST, "/api/v1/nmacpymntacntshs/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.PUT, "/api/v1/nmacpymntacntshs/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.DELETE, "/api/v1/nmacpymntacntshs/**").hasAnyAuthority("ROLE_USER")

                .antMatchers(HttpMethod.GET, "/api/v1/nmacpymntshs/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.POST, "/api/v1/nmacpymntshs/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.PUT, "/api/v1/nmacpymntshs/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.DELETE, "/api/v1/nmacpymntshs/**").hasAnyAuthority("ROLE_USER")

                .antMatchers(HttpMethod.GET, "/api/v1/nmacpymnts/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.POST, "/api/v1/nmacpymnts/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.PUT, "/api/v1/nmacpymnts/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.DELETE, "/api/v1/nmacpymnts/**").hasAnyAuthority("ROLE_USER")

                .antMatchers(HttpMethod.GET, "/api/v1/nmacpymntacnts/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.POST, "/api/v1/nmacpymntacnts/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.PUT, "/api/v1/nmacpymntacnts/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.DELETE, "/api/v1/nmacpymntacnts/**").hasAnyAuthority("ROLE_USER")

                .antMatchers(HttpMethod.GET, "/api/v1/nmacusrprfl/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.POST, "/api/v1/nmacusrprfl/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.PUT, "/api/v1/nmacusrprfl/**").hasAnyAuthority("ROLE_USER")
                .antMatchers(HttpMethod.DELETE, "/api/v1/nmacusrprfl/**").hasAnyAuthority("ROLE_USER")
*/
			.anyRequest()
			.authenticated().and().csrf().disable();
	}
	
	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowedOrigins(Arrays.asList("*"));
		configuration.setAllowedMethods(Arrays.asList("*"));
		configuration.setAllowCredentials(true);
		configuration.setExposedHeaders(Arrays.asList("Access-Control-Allow-Headers", "Authorization", "x-xsrf-token", "Access-Control-Allow-Headers", "Origin", "Accept", "X-Requested-With", 
	            "Content-Type", "Access-Control-Request-Method", "Access-Control-Request-Headers"));
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
	}

}
