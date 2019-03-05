package com.cg.beans;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource=new ClassPathResource("beans.xml");
		XmlBeanFactory factory=new XmlBeanFactory(resource);
		//*We can write this as well
		Employee employee=(Employee) factory.getBean("e1");
		Employee employee1=(Employee) factory.getBean("e2");
		
		//not needed in spring directly done by ioc
		//employee.setFirstname("S");
		//employee.setLastName("A");
		//employee.setAge(20);
		
		System.out.println(employee);
		System.out.println(employee1);
		//System.out.println(employee.getSkills());
		//*can do without taking class
		//UserCredentials users=factory.getBean(UserCredentials.class);
		//System.out.println(users);

	}

}
