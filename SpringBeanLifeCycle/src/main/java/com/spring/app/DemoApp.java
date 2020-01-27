package com.spring.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Person;

public class DemoApp {

    public static void main(String[] args) {
 
        // Reading configuration from the spring configuration file.
        AbstractApplicationContext   context = new ClassPathXmlApplicationContext("spring-config.xml");
 
        Person myperson = context.getBean("personBean", Person.class);
 
        System.out.println("Name= " + myperson.getName());
 
        // Closing the context object.
        context.close();
    }
}
