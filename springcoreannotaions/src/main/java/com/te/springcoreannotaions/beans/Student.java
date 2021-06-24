package com.te.springcoreannotaions.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Serializable{
	
	private int id;
	private String name;
	
	
	@Autowired(required=false)
	private Teacher teacher;
	
	public Student() {
		
	}
	

}
