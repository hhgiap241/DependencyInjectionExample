package com.kms.giaphoang.overview.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 6/8/2022, Wednesday
 * @project: Spring
 **/
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
        ClassA classA = (ClassA) context.getBean("classA");
        classA.displayMessage();
    }
}
