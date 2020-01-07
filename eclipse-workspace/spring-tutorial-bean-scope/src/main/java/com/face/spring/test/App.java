package com.face.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) { 
	ApplicationContext appcontext = new ClassPathXmlApplicationContext("com/face/spring/test/beans/beans.xml");
		Person person = (Person) appcontext.getBean("person");
	person.display();
	Address address= (Address) appcontext.getBean("address");
	System.out.println(person);
	System.out.println(address);
((ClassPathXmlApplicationContext)appcontext).close();
	}

}
