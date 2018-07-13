package com.chaoyue.design.patterns.chapter9.composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * 使用迭代器模式处理
 * 其实就是迭代器模式的递归使用 用迭代器取出迭代器 再取元素
 */
public class CompositeIterator implements Iterator {
    private Stack<Iterator> stack = new Stack<>();

    // 初始化的时候传入的是顶层节点的迭代器
    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator iterator = stack.peek();
            if (!iterator.hasNext()) {
                //如果当前迭代器已经没有元素了 则算作无效的迭代器，弹出取下一个
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = stack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if (menuComponent instanceof Menu) {
                stack.push(menuComponent.createIterator());
            }
            return menuComponent;
        } else {
            return null;
        }
    }
}
