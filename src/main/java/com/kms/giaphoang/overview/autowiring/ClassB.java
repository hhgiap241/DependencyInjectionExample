package com.kms.giaphoang.overview.autowiring;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 6/8/2022, Wednesday
 * @project: Spring
 **/
public class ClassB {
    private String message;
    public ClassB(String message) {
        System.out.println("Initializing ClassB Bean");
        this.message = message;
    }
    void printMessage() {
        System.out.println(message);
    }
}
