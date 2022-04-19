package com.tehtava.openshift;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().cors().and().authorizeRequests()
        		.antMatchers("GET", "/h2-console", "/h2-console/**").permitAll()
                .anyRequest()
                .permitAll();
              // .authenticated();

		// http.csrf().disable().cors().and().authorizeRequests()
		// .antMatchers("GET", "/swagger-ui.html").permitAll()
		// .antMatchers("GET", "api/**").permitAll()
		// .anyRequest()
		// .authenticated();
		
        http.oauth2ResourceServer()
                .jwt();
    }
	
	@Bean
    CorsConfigurationSource corsConfigurationSource() {
        UrlBasedCorsConfigurationSource source = 
            new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        //config.setAllowedOrigins(Arrays.asList("https://kyselyfrontend.herokuapp.com", "http://localhost:3000/", "http://kyselyfrontend.herokuapp.com", "http://kyselyfrontend.herokuapp.com/**"));
        config.setAllowedOrigins(Arrays.asList("*"));
        config.setAllowedMethods(Arrays.asList("*"));
        config.setAllowedHeaders(Arrays.asList("*"));
        //config.setAllowCredentials(true);
        config.applyPermitDefaultValues();
        
        source.registerCorsConfiguration("/**", config);
        return source;
  }

}
