package com.te.springcorexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcorexml.beans.EmployeeBean;



public class EmployeeTest {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		EmployeeBean emp=context.getBean("emp",EmployeeBean.class);
		System.out.println("Employee Id "+emp.getId());
		System.out.println("Employee name: "+emp.getName());
		System.out.println("Employee department id "+emp.getDept().getDid());
		System.out.println("Employee department "+ emp.getDept().getDname());
		
	}

}
