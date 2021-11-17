package com.springcore.bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("com/springcore/bank/Appconfig.xml");
		BankAccountController obj=(BankAccountController)applicationcontext.getBean("obj");
		obj.withdraw();
	}

}
