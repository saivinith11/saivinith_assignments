package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    
	public static void main(String[] args)
	{
	System.out.println("Hello world!");
    ApplicationContext context=new  ClassPathXmlApplicationContext("config.xml");
    Student Student1=(Student) context.getBean( "Student1");
    System.out.println(Student1);
	}

}
  