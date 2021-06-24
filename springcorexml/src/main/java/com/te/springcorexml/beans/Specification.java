package com.te.springcorexml.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Specification implements Serializable {
	
	private int ram;
	private String os;
	private int battery;
	
	public Specification() {
		
	}

}
