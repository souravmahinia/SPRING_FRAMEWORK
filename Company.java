package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Value("Infosys Limited")
	String companyname;
	
	@Autowired
	@Qualifier("hardwareengineer")   //Qualifier tells that which Engineer inject or run
   	Engineer engineer;
	//Softwareengineer engineer;
	
//	public void setEngineer(Softwareengineer engineer) {
//		this.engineer = engineer;
//		System.out.println("I am setter to inject engineer using Bean annonation ");	
//		 }

	public void show() {
		
		System.out.println("Hello guys I am Enginner from a company");
		System.out.println("I Work in" + companyname);
	}

}
//1-METHOD=@AUTOWIRED WITH @COMPONENT,@COMPONENTSCAN,@CONFIGURATION
//2-METHOD=@BEAN WITH GETTER , CONSTRUCTOR
//NOTE-1ST METHOD IS EASY
//NOTE- @QUALIFIER USE ONLY SMALL(CAMEL) LETTER
 