package com.cg.beans;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml"); 
		DBCConfig config=(DBCConfig)context.getBean(DBCConfig.class);
		System.out.println(config.getDriverName());
		System.out.println(config.getUrl());
		System.out.println(config.getUserName());
		System.out.println(config.getPassword());
			
}
}
	