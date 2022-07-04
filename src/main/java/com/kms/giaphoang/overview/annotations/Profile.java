package com.kms.giaphoang.overview.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 6/8/2022, Wednesday
 * @project: Spring
 **/
public class Profile {

    private Student student2;

//    public Profile(@Qualifier("student") Student student2) {
//        this.student2 = student2;
//    }

    public Profile(){
        System.out.println("Inside Profile constructor." );
    }
    public void printAge() {
        System.out.println("Age : " + student2.getAge() );
    }

    @Autowired
    @Qualifier("student2")
    public void setStudent2(Student student2) {
        this.student2 = student2;
    }
    public void printName() {
        System.out.println("Name : " + student2.getName() );
    }
    public void printIdCard() {
        System.out.println("IdCard : " + student2.getIdCard().getNumber() );
    }
}
