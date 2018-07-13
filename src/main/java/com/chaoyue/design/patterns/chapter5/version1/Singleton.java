package com.chaoyue.design.patterns.chapter5.version1;

/**
 * 单例模式 Singleton Pattern
 * 确保一个类只有一个实例，并提供一个全局访问点
 * version1 经典的单例模式实现
 */

public class Singleton {
    // 使用静态变量来记录唯一实例
    private static Singleton uniqueInstance;

    // 构造方法私有化，防止被其他类调用
    private Singleton() {
    }

    // 提供统一的入口创建类
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
