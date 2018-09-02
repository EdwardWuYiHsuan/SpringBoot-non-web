package com.edward.nonweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.edward.nonweb.services.HelloMessageService;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {
	
	@Autowired
	private HelloMessageService helloMessageService;
	
	
	public static void main(String[] args) 
	{
		SpringApplication application = new SpringApplication(SpringBootConsoleApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}
	
	@Override
	public void run(String... args) throws Exception 
	{
		if (args.length > 0) {
			System.out.println(helloMessageService.helloMessage(args[0]));
		} else {
			System.out.println(helloMessageService.helloMessage());
		}
		
		System.exit(0);
	}
	
}
