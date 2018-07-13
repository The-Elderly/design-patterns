package com.chaoyue.design.patterns.chapter5.version2;

/**
 * 单例模式
 * version2 添加多线程处理
 */

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    // 在入口处使用线程锁来控制并发导致的问题
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
