package com.te.springcoreannotaions.configurations;

import org.springframework.context.annotation.Bean;

import com.te.springcoreannotaions.beans.Display;

public class DisplayConfig {
	
	@Bean
	public Display getDisplay() {
		
		return new Display("Amoled",1080);
	}

}
