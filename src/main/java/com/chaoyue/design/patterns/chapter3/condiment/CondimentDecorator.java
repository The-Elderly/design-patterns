package com.chaoyue.design.patterns.chapter3.condiment;

import com.chaoyue.design.patterns.chapter3.beverage.Beverage;

/**
 * 调味料抽象基类 继承饮料基类（用来装饰饮料）
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
