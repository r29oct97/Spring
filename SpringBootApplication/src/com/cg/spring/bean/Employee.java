package com.cg.spring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component("emp")
public class Employee {
	@Value("Rahul")
	private String firstName;
	@Value("Chauhan")
	private String lastName;
	@Autowired
	private Department dept;
	
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", dept=" + dept + "]";
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("object initialize");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("clean up the work");
	}
	

}
