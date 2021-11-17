package com.springcore.bean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/bean/beanconfig.xml");
		Person myperson=(Person) context.getBean("personBean");
        System.out.println("Name="+myperson.getName());
        context.close();
	}

}
