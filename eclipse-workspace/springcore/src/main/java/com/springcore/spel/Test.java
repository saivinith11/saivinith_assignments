package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
      addition a1=context.getBean("addition",addition.class);
      System.out.println(a1);
	}

}
