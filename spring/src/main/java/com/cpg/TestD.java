package com.cpg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cpg.services.B;

public class TestD {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		B b = context.getBean(B.class);
		
		b.register();

	}

}
