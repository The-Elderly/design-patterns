package com.chaoyue.design.patterns.chapter3.beverage;

/**
 * 饮料抽象基类 如果直接实例化则需要实现抽象方法cost
 */
public abstract class Beverage {
    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
