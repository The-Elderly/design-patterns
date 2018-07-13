package com.chaoyue.design.patterns.chapter5.version3;

/**
 * 单例模式
 * version3 改善多线程的处理效率问题方式1
 * 使用急切创建实例，而不用延迟实例化的做法，JVM在加载这个类时马上创建此唯一的单件实例
 * 使用场景为在getInstance()调用频率比较高且对性能要求比较高的时候
 */

public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
