package com.kms.giaphoang.overview.circulardi.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 6/28/2022, Tuesday
 * @project: Spring
 **/

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        CircularDependencyA circA = (CircularDependencyA) applicationContext.getBean("circA");
        circA.print();
    }
}
