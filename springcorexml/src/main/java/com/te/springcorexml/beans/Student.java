package com.te.springcorexml.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Serializable{
	
	private int id;
	private String name;
	
	private Teacher tec;
	//private Library lib;
	
	public Student() {
		
	}
	

}
