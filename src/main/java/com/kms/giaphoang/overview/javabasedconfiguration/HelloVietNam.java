package com.kms.giaphoang.overview.javabasedconfiguration;

import org.springframework.stereotype.Component;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 6/8/2022, Wednesday
 * @project: Spring
 **/

public class HelloVietNam implements Hello{
    private String message;

    public HelloVietNam(String message) {
        this.message = message;
    }

    @Override
    public void printMessage() {
        System.out.println(message);
    }
}
