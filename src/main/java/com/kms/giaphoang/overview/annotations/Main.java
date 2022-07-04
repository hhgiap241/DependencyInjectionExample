package com.kms.giaphoang.overview.annotations;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("annotations.xml");
        Profile profile = context.getBean("profile", Profile.class);
        profile.printIdCard();
        profile.printName();
        profile.printAge();
    }
}
