package com.springcore.bean;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements DisposableBean,InitializingBean {
	private String name;
    Person(){
    	System.out.println("construcor of person bran is invoked!");
    }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@PostConsrtuct
	public void afterPropertiesSet() throws Exception {
	System.out.println("initilizing method of person bean is invoked");
		
	}
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("destroy method of person bean is invoked");
		
	}


	
	

}
