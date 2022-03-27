package com.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Keys{
	
	public void run(engine key) {
		
		key.start2();
		
		
	}
}
public class mainjava{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac= new ClassPathXmlApplicationContext("beans.xml");
		engine Key=(engine)ac.getBean("Engine");
		new Keys().run(Key);

	}

}


