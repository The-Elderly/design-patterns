package com.chaoyue.design.patterns.chapter6.furniture;

public class Light {
    private String name = "";

    public Light() {
    }

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " light on");
    }

    public void off() {
        System.out.println(name + " light off");
    }
}
