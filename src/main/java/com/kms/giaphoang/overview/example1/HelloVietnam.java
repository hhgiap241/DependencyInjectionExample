package com.kms.giaphoang.overview.example1;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 6/6/2022, Monday
 * @project: Spring
 **/
public class HelloVietnam {
    private String message;
    private String anotherMessage;
    public void init() {
        System.out.println("Initializing Hello Vietnam Bean");
    }

    public String getAnotherMessage() {
        return anotherMessage;
    }

    public void setAnotherMessage(String anotherMessage) {
        this.anotherMessage = anotherMessage;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("My Message 1: " + message);
        System.out.println("My Message 2: " + anotherMessage);
    }
    public void destroy() {
        System.out.println("Destroying Hello Vietnam  Bean");
    }
}
