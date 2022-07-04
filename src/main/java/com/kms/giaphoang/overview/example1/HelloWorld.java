package com.kms.giaphoang.overview.example1;


public class HelloWorld {
    private String message;
    public void init() {
        System.out.println("Initializing Hello World Bean");
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("My Message : " + message);
    }
    public void destroy() {
        System.out.println("Destroying Bean");
    }
}
