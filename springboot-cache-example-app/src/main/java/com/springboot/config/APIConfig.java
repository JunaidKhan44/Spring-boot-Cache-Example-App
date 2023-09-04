/**
 * 
 */
package com.springboot.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.handler.APIFilter;

/**
 * @author Junaid.khan
 *
 */
@Configuration
@EnableCaching
public class APIConfig {

	@Bean
	public APIFilter aPIFilter() {
		return 	new APIFilter();
	}
	
}
