package com.kms.giaphoang.overview.circulardi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 6/7/2022, Tuesday
 * @project: Spring
 **/
public class Main {
    public static void main(String[] args) {
//        System.out.println("========== Using constructor injection ==========");
//        ApplicationContext context = new ClassPathXmlApplicationContext("circularDependency.xml");
//        ClassA classA = (ClassA) context.getBean("classA");


        System.out.println("========== Using setter injection ==========");
        ApplicationContext context = new ClassPathXmlApplicationContext("circularDependency.xml");
        ClassAver2 classAver2 = (ClassAver2) context.getBean("classAver2");
        System.out.println(classAver2.getClassBver2().getMessage());
    }
}
