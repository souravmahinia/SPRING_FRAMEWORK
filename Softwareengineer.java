package com.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary       //Primary use to tell the componentscan to which engineer inject by default
public class Softwareengineer implements Engineer
{
	@Override
	public void develpment() {
		System.out.println("develping software__________");
	}

}
