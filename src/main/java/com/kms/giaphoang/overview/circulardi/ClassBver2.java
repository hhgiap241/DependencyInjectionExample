package com.kms.giaphoang.overview.circulardi;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 6/7/2022, Tuesday
 * @project: Spring
 **/
public class ClassBver2 {
    private ClassAver2 classAver2;
    private String message = "Hello from class B ver 2";

    public ClassBver2() {
        System.out.println("Initializing ClassBver2 Bean");
    }
    public ClassAver2 getClassAver2() {
        return classAver2;
    }

    public void setClassAver2(ClassAver2 classAver2) {
        System.out.println("Setting ClassAver2 Bean");
        this.classAver2 = classAver2;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
