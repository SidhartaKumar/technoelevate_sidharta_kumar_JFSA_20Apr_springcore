package com.te.springcorexml.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mobile implements Serializable {
	
	private String brand;
	private String name;
	
	private Specification specs;
	
	public Mobile() {
		
	}

}
