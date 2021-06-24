package com.te.springcoreannotaions.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springcoreannotaions.beans.Teacher;

@Configuration
public class TeacherConfig {
	
	@Bean(name="one")
	public Teacher getTeacher() {
		Teacher teacher=new Teacher();
		teacher.setName("Victor");
		teacher.setSubject("Maths");
		return teacher;
	}
	
	@Bean(name="two")
	@Primary
	public Teacher getTeacher2() {
		return new Teacher("Osta","Science");
	}
	
	@Bean(name="three")
	public Teacher getTeacher3() {
		Teacher teacher=new Teacher();
		teacher.setName("Micheal");
		teacher.setSubject("English");
		return teacher;
	
	}

}
