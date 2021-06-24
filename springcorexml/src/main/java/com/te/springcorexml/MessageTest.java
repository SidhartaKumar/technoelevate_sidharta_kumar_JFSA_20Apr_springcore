package com.te.springcorexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcorexml.beans.MessageBean;

public class MessageTest {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("messageConfig.xml");
		
		MessageBean messageBean=context.getBean("test",MessageBean.class);
		
		System.out.println(messageBean.getMsg());
		((AbstractApplicationContext) context).registerShutdownHook();
		
	}

}
