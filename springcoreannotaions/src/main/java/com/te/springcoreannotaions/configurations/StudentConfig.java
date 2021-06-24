package com.te.springcoreannotaions.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.te.springcoreannotaions.beans.Student;
import com.te.springcoreannotaions.beans.Teacher;

@Configuration
@Import(TeacherConfig.class)
public class StudentConfig {
	
	
	@Bean
	public Student getStudent() {
		Student student=new Student();
		student.setId(10);
		student.setName("Dinga");
		return student;
	}

}
