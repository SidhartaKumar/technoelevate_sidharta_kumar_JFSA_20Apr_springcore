package com.te.springcoreannotaions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotaions.beans.Mobile;
import com.te.springcoreannotaions.configurations.MobileConfig;

public class MobileTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(MobileConfig.class);
		
		Mobile mobile =context.getBean(Mobile.class);
		
		System.out.println("Mobile Display Type: "+mobile.getDisplay().getType());
		System.out.println("Mobile Resolution: "+mobile.getDisplay().getResolution());
		
		
		
		System.out.println("Mobile Android Version "+ mobile.getSoftware().getAndroidVersion());
		System.out.println("Mobile UI "+ mobile.getSoftware().getUi());
		
		
		
	}

}
