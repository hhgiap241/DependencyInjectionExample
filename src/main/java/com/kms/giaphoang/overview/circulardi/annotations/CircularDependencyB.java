package com.kms.giaphoang.overview.circulardi.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 6/28/2022, Tuesday
 * @project: Spring
 **/
@Component("circB")
public class CircularDependencyB {
    private CircularDependencyA circA;

    @Autowired
    public CircularDependencyB(CircularDependencyA circA) {
        this.circA = circA;
    }
    public void print() {
        System.out.println("CircularDependencyB");
    }
}
