package com.cg.beans;

import java.util.ArrayList;

public class Employee {

	private String firstname;
	private String lastName;
	private int age;
	Department dept;
	
	public Employee(Department d2)
	{
		this.dept=d2;
	}
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	ArrayList<String> skills;
	
	public ArrayList<String> getSkills() {
		return skills;
	}
	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String firstname, String lastName, int age) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.age = age;
	}
	public Employee() {
		//
		//dept=new Department(1,"dev");
		// TODO Auto-generated constructor stub
	}
	public void m1()
	{
		System.out.println("execute");
	}
	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastName=" + lastName + ", age=" + age + ", dept=" + dept
				+  "]";
	}
	
	
}
