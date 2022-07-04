package com.kms.giaphoang.overview.autowiring;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 6/8/2022, Wednesday
 * @project: Spring
 **/
public class ClassA {
    private ClassB classB;

    public ClassA() {
        System.out.println("Initializing ClassA Bean");
    }

    public ClassA(ClassB classB) {
        System.out.println("Initializing ClassA Bean from parameter constructor");
        this.classB = classB;
    }

    public ClassB getClassB() {
        return classB;
    }
    public void printMessage() {
        System.out.println("Hello World from ClassA");
    }

    public void setClassB(ClassB classB) {
        System.out.println("setter classB1");
        this.classB = classB;
    }

    public void displayMessage() {
        this.printMessage();
        classB.printMessage();
    }
}
