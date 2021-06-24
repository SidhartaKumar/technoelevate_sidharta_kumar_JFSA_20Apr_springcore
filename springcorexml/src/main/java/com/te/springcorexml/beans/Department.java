package com.te.springcorexml.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Department implements Serializable{

	public Department() {

	}
	
	private int did;
	
	private String dname;
	

}
