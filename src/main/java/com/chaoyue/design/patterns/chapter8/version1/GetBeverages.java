package com.chaoyue.design.patterns.chapter8.version1;

/**
 * 模板方法模式 Template Method Pattern
 * 在一个方法中定义一个算法的骨架，而讲一些步骤延迟到子类中。
 * 模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤
 * demo 说明
 * CaffeineBeverage 就是公用的模板方法 brew addCondiments 分别为子类延迟实现的步骤
 * 可以模板方法中插入一些流程控制方法，子类可以通过选择性覆盖这些流程控制方法来控制主方法流程
 * customerWantsCondiments 就是流程控制方法
 */
public class GetBeverages {
    public static void main(String[] args) {
        System.out.println("---- I wan's some coffee ----");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println("---- I wan's some tea ----");
        Tea tea = new Tea();
        tea.prepareRecipe();
        System.out.println("---- I wan's some special coffee");
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        coffeeWithHook.prepareRecipe();
    }
}
