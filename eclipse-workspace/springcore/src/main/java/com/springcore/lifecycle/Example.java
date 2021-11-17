package com.springcore.lifecycle;

import javax.annotation.PreDestroy;

import com.springcore.bean.PostConsrtuct;

public class Example {
     private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	@PostConsrtuct
    public void start() {
    	System.out.println("startinhg method");
    }
	@PreDestroy
    public void end() {
    	System.out.println("ending method");
    }
}
