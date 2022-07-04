package com.kms.giaphoang.overview.circulardi.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 6/28/2022, Tuesday
 * @project: Spring
 **/
@Component("circA")
public class CircularDependencyA {
    private CircularDependencyB circB;

    @Autowired
    public CircularDependencyA(CircularDependencyB circB) {
        this.circB = circB;
    }
    public void print() {
        System.out.println("CircularDependencyA");
    }
}
