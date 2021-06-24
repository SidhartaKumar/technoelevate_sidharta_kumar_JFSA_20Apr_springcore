package com.te.springcoreannotaions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotaions.beans.Student;
import com.te.springcoreannotaions.configurations.StudentConfig;

public class StudentTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
		Student student=context.getBean(Student.class);
		System.out.println("Student Id is: "+student.getId());
		System.out.println("Student name is: "+student.getName());
		System.out.println("Teacher name is: "+student.getTeacher().getName());
		System.out.println("Teacher teaches: "+student.getTeacher().getSubject());
	}

}
