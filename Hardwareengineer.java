package com.annotation;

import org.springframework.stereotype.Component;

@Component
public class Hardwareengineer implements Engineer {
	@Override
	public void develpment() {
		System.out.println("develping Hardware of computer__________");
	}

}
