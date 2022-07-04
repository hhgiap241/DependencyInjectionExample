package com.kms.giaphoang.overview.javabasedconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 6/8/2022, Wednesday
 * @project: Spring
 **/

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new File();
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        helloWorld.printMessage();
        HelloVietNam helloVietNam = (HelloVietNam) applicationContext.getBean("helloVietNam");
        helloVietNam.printMessage();
    }
}
