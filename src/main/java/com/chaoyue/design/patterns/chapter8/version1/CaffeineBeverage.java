package com.chaoyue.design.patterns.chapter8.version1;

/**
 * 抽象公共的算法为模板方法
 */
abstract class CaffeineBeverage {
    // 定义为final 防止被子类重写（保护模板方法）
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        // 给子类微调主流程的机会
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // 保护重要的方法 申明为private
    private void boilWater() {
        System.out.println("boilWater");
    }

    abstract void brew();

    private void pourInCup() {
        System.out.println("pourInCup");
    }

    abstract void addCondiments();

    // 这就是一个钩子，子类可以通过覆盖这个方法来微调主流程逻辑
    boolean customerWantsCondiments() {
        return true;
    }
}
