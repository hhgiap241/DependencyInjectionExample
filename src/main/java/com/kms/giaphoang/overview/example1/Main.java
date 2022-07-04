package com.kms.giaphoang.overview.example1;

import com.kms.giaphoang.overview.example1.HelloVietnam;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : ${USER}
 * @mailto : hoanghuugiap241@gmail.com
 * @created : ${DATE}, ${DAY_NAME_FULL}
 * @project: $PROJECT_NAME
 **/
public class Main {
    public static void main(String[] args) {
//        System.out.println("===================Config by Java Code===================");
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        HelloWorld helloWorld1 = context.getBean(HelloWorld.class);
//        helloWorld1.getMessage();
//        context.close();
        System.out.println("===================Config by XML===================");
        ApplicationContext context1 = new ClassPathXmlApplicationContext("overviewBean.xml");
//        HelloWorld helloWorld2 = (HelloWorld) context1.getBean("helloWorld");
//        helloWorld2.getMessage();
        HelloVietnam helloVietnam = (HelloVietnam) context1.getBean("helloVietnam");
        helloVietnam.getMessage();
    }
}