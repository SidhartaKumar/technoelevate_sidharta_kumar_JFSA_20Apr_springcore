package com.te.springcorexml.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Teacher implements Serializable {
	
	private String name;
	private String subject;
	
	public Teacher() {
		
	}
	

}
