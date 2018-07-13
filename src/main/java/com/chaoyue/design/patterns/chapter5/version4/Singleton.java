package com.chaoyue.design.patterns.chapter5.version4;

/**
 * 单例模式
 * version4 改善多线程的处理效率问题方式2
 * 使用 双重检查加锁 在getInstance()中减少使用同步
 * 使用 volatile 关键字保证一致性 将原子性操作控制到实例化的过程中，而不需要对整个getInstance()加锁
 * 使用场景为在getInstance()调用频率比较高且对性能要求比较高的时候
 */

public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
