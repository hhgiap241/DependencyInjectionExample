package com.kms.giaphoang.overview.annotations;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 6/8/2022, Wednesday
 * @project: Spring
 **/
public class StudentIdCard {
    private int number;

    public int getNumber() {
        System.out.println("Inside StudentIdCard constructor." );
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public StudentIdCard(int number) {
        this.number = number;
    }
}
