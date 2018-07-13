package com.chaoyue.design.patterns.chapter9.composite;

import java.util.Iterator;

/**
 * 菜单组件抽象类
 * 每个方法都给个默认的实现 但是因为直接调用没有意义，所以都抛出 UnsupportedOperationException 异常
 * 具体实现由子类覆盖实现
 */
public abstract class MenuComponent {
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    // 所有节点都要有 Iterator 可以设计成抽象方法
    abstract Iterator createIterator();
}
