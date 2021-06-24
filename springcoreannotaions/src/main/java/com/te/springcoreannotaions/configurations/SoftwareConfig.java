package com.te.springcoreannotaions.configurations;

import org.springframework.context.annotation.Bean;

import com.te.springcoreannotaions.beans.Software;

public class SoftwareConfig {
	
	
	@Bean
	public Software getSoftware() {
		return new Software(11,"Oxygen Os");
		
	}

}
