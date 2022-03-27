package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new AnnotationConfigApplicationContext(configclass.class);
		Company company=context.getBean("company",Company.class);
		company.show();
		company.engineer.develpment();
		
	}

}
