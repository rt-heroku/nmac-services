package com.nmac.payments;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class CORSConfig {

   @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowCredentials(true)
                .allowedHeaders("*")
                .exposedHeaders("Access-Control-Allow-Headers", "Authorization", "x-xsrf-token", "Access-Control-Allow-Headers", "Origin", "Accept", "X-Requested-With"
                		,"Content-Type", "Access-Control-Request-Method", "Access-Control-Request-Headers");
            }
        };
    }
    
	
	/* @Bean
	    public FilterRegistrationBean corsFilter() {
	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	        CorsConfiguration config = new CorsConfiguration();
	        		config.setAllowedOrigins(Arrays.asList("*"));
	        config.setAllowedMethods(Arrays.asList("*"));
	        config.setAllowCredentials(true);
	        source.registerCorsConfiguration("/**", config);
	        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
	        bean.setOrder(0);
	        return bean;
	    }
	    */
}
