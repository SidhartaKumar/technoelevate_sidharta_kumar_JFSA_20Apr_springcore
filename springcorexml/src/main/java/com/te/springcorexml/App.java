package com.te.springcorexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcorexml.beans.EmployeeBean;
import com.te.springcorexml.beans.Mobile;
import com.te.springcorexml.beans.Student;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("employeeconfig.xml");
		EmployeeBean employeeBean = context.getBean("empOne", EmployeeBean.class);
		
		System.out.println("----- contructor ------");
		System.out.println(employeeBean.getName());
		System.out.println(employeeBean.getId());
		System.out.println(employeeBean.getDept().getDname());
		
		System.out.println("--- Property ---");
		EmployeeBean employeeBean2 = context.getBean("empTwo", EmployeeBean.class);
		System.out.println(employeeBean2.getName());
		System.out.println(employeeBean2.getId());
		System.out.println(employeeBean2.getDept().getDname());
		System.out.println("--------------------------------------------------------------------");
		System.out.println();
		
		
		Student studentBean=context.getBean("stud1",Student.class);
		System.out.println("Student id is: "+studentBean.getId());
		System.out.println("Student Name is: "+studentBean.getName());
		System.out.println("Teacher Name is:"+studentBean.getTec().getName());
		System.out.println("Teacher Subject is: "+studentBean.getTec().getSubject());
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		
		
		Mobile mobileBean=context.getBean("mobile",Mobile.class);
		System.out.println("Mobile Brand is: "+mobileBean.getBrand());
		System.out.println("Mobile Name is: "+mobileBean.getName());
		System.out.println("Ram: "+mobileBean.getSpecs().getRam());
		System.out.println("Os: "+mobileBean.getSpecs().getOs());
		System.out.println("Battery Capacity is: "+mobileBean.getSpecs().getBattery());
		
	}
}
 