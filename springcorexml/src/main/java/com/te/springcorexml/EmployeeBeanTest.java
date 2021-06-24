package com.te.springcorexml;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcorexml.beans.EmployeeBean;

public class EmployeeBeanTest {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("employeeconfig.xml");
		EmployeeBean emp1 = context.getBean("emp" , EmployeeBean.class);
		System.out.println(" Enter the name of First Employee");
		emp1.setName(scanner.nextLine());
		System.out.println(" Enter the ID of First Employee");
		int id = Integer.parseInt(scanner.nextLine());
		emp1.setId(id);
		
		System.out.println(" Employee One " + emp1);
		
		EmployeeBean emp2 = context.getBean("emp", EmployeeBean.class);
		System.out.println(" Enter the name of Second Employee");
		emp2.setName(scanner.nextLine());
		System.out.println(" Enter the ID of Second Employee");
		int id2 = Integer.parseInt(scanner.nextLine());
		emp2.setId(id2);
		
		System.out.println("Employee Two "+ emp2 +" " + emp2.hashCode());
		System.out.println("after  setting values for second object");
		System.out.println(" Employee One " + emp1 + " " + emp1.hashCode());

	}
}
