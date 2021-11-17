package com.springcore.ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Service {
	@Value("${classurl}")
	private String url;
	@Value("${classusername}")
	private String username;
	@Value("${classpass}")
	private String pass;
	
	public void Show() {
		System.out.println("url="+url+",Username="+username+",password="+pass);
	}

}
