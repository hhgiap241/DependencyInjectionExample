package com.kms.giaphoang.overview.annotations;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 6/8/2022, Wednesday
 * @project: Spring
 **/
public class Student {
    private StudentIdCard idCard;
//    public Student(){
//        idCard = new StudentIdCard(123);
//    }
    private Integer age;
    private String name;

    public StudentIdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(StudentIdCard idCard) {
        System.out.println("inside setIdCard");
        this.idCard = idCard;
    }
    public Student(){
        System.out.println("Inside Student  default constructor." );
    }
    // only one constructor so we don't need @Autowired here
    @Autowired
    public Student(StudentIdCard idCard) {
        System.out.println("inside student constructor 2");
        this.idCard = idCard;
    }

    @Autowired(required=false)
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }

    @Autowired(required=false)
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
