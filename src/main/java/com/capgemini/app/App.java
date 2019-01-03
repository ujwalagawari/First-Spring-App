package com.capgemini.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.app.bean.Organization;

/**
 * Hello world!
 *
 */
public class App {
	
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Organization organization = context.getBean(Organization.class, "organization");
        System.out.println(organization);
    }
}
