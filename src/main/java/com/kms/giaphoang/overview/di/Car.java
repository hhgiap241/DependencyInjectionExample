package com.kms.giaphoang.overview.di;

import javax.annotation.PostConstruct;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 6/7/2022, Tuesday
 * @project: Spring
 **/
public class Car {
    private String name;
    private String color;
    private Engine engine;
    private Wheel wheel;

    public Car() {
        System.out.println("Initializing Car Bean 0");
    }

    public Car(String name, String color, Engine engine, Wheel wheel) {
        System.out.println("Initializing Car Bean 2");
        this.name = name;
        this.color = color;
        this.engine = engine;
        this.wheel = wheel;
    }

    public Car(String name, String color) {
        System.out.println("Initializing Car Bean 1");
        this.name = name;
        this.color = color;
    }

    public void setEngine(Engine engine) {
        System.out.println("Setter for engine");
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }



    public void printInfo() {
        System.out.println("Car name: " + name);
        System.out.println("Car color: " + color);
        System.out.println("Car engine: " + engine.getName());
    }
    public void printInfo2() {
        System.out.println("Car name: " + name);
        System.out.println("Car color: " + color);
        System.out.println("Car engine: " + engine.getName());
        System.out.println("Car wheel: " + wheel.getName());
    }
}
