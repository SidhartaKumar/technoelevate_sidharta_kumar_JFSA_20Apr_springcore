package com.te.springcorexml.beans;

import java.io.Serializable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageBean implements Serializable,InitializingBean,DisposableBean{
	
	private String msg;
	public MessageBean() {
		System.out.println("Initialization Phase");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("In destroying Phase");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("In Initilizing Phase");
		
	}
	

}
