package com.kms.giaphoang.overview.circulardi;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 6/7/2022, Tuesday
 * @project: Spring
 **/
public class ClassAver2 {
    private ClassBver2 classBver2;
    private String message = "Hello from class A ver 2";

    public ClassAver2() {
        System.out.println("Initializing ClassAver2 Bean");
    }
    public ClassBver2 getClassBver2() {
        return classBver2;
    }
    public void setClassBver2(ClassBver2 classBver2) {
        System.out.println("Setting ClassBver2 Bean");
        this.classBver2 = classBver2;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
