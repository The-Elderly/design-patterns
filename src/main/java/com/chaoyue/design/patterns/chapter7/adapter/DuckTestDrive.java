package com.chaoyue.design.patterns.chapter7.adapter;

/**
 * 适配器模式 Adapter Pattern
 * 将一个类的接口，转换成客户期望的另一个接口。适配器让原本不兼容的类可以合作无间
 * demo说明
 * TurkeyAdapter 适配器接收 Turkey 类型对象 并将其处理后转换成 Duck 对象
 * TurkeyAdapter 让所有的 Turkey 都可以作为 Duck 来使用
 * <p>
 * PS：TurkeyAdapter为对象适配器 就是直接将一个对象转换为另外一个对象，
 * 还有一种是类适配器(多继承 JAVA不支持，同时继承 Turkey Duck 进行方法层面的转接)
 */

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey ...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n The Real Duck ...");
        testDuck(duck);

        System.out.println("\n The Fake Duck ...");
        // 不使用适配器 无法通过校验
        //testDuck(turkey);
        // 使用适配器包装
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
