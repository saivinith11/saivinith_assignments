package com.springcore.coll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/coll/collconfig.xml");
        Collection collectionmap = (Collection) context.getBean("collectionmap");
        
        System.out.println(collectionmap.getQuestionId());
        System.out.println(collectionmap.getQuestions());
        System.out.println(collectionmap.getAnswers());

	}

}
