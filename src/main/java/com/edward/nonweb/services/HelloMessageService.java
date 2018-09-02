package com.edward.nonweb.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloMessageService {

	@Value("${name:unknow}")
	private String name;
	
	public String helloMessage() 
	{
		return this.helloMessage(this.name);
	}
	
	public String helloMessage(String name)
	{
		return String.format("Hello %s", name);
	}
}
