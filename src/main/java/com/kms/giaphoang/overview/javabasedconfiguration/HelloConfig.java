package com.kms.giaphoang.overview.javabasedconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 6/8/2022, Wednesday
 * @project: Spring
 **/
@Configuration
@ComponentScan("com.kms.giaphoang.overview.javabasedconfiguration")
public class HelloConfig {

    @Bean(name = "hello")
    public HelloWorld helloWorld(){
        return new HelloWorld("Hello World");
    }
    @Bean(name = "helloVietNam")
    public HelloVietNam helloVietNam(){
        return new HelloVietNam("Hello Viet Nam");
    }
}
