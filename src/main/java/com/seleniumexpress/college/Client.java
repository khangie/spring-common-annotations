package com.seleniumexpress.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Use the CollegeConfig class instead of beans.xml
        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);

        System.out.println("CollegeConfig.class used for configuration");
        College college = context.getBean("collegeBean", College.class);
        System.out.println("The college object created by spring is: " + college);
        college.test();

    }

}
