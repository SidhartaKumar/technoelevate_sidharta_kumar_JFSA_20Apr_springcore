package com.te.springcoreannotaions.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Display implements Serializable{
	
	private String type;
	private int resolution;
	
	public Display() {
		
	}
	

}
