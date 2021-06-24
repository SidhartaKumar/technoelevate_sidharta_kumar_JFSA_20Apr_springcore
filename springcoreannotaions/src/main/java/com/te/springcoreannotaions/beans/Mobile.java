package com.te.springcoreannotaions.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component

public class Mobile implements Serializable{
	
	private Display display;
	private Software software;
	
	@Autowired
	public Mobile(Display display,Software software) {
		super();
		this.display=display;
		this.software=software;
	}
	
	
	

}
