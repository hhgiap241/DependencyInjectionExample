package com.kms.giaphoang.overview.di;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 6/7/2022, Tuesday
 * @project: Spring
 **/
public class Wheel {
    private String name;

    public Wheel(String name) {
        System.out.println("Initializing Wheels Bean");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
