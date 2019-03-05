package com.cg.spring.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.spring.bean.Employee;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.cg")
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=SpringApplication.run(Client.class, args);
		Employee ep=(Employee) context.getBean("emp");
		System.out.println(ep);
	}

}
