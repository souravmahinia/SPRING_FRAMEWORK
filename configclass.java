package com.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages="com.annotation")
public class configclass {

	//Using setter and bean annotation
//	@Bean
//	public Softwareengineer engineer() {
//		return new Softwareengineer();
//	}
//	
//	@Bean
//	public Company company() {
//		Company company=new Company();
//		company.setEngineer(engineer());  
//		return  company;
//	}
}
