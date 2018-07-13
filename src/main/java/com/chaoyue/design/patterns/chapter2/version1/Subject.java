package com.chaoyue.design.patterns.chapter2.version1;

/**
 * 作为主题 基础的三个方法分别为（所有观察者模式都需要的）
 * 1、添加观察者
 * 2、移除观察者
 * 3、有新的变更通知订阅自己的观察者们
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
