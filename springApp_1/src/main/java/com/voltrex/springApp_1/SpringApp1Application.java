package com.voltrex.springApp_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringApp1Application {

	public static void main(String[] args) {

		ApplicationContext context;
		context = SpringApplication.run(SpringApp1Application.class, args);

		Alien obj = context.getBean(Alien.class);
		obj.build();
	}
}
