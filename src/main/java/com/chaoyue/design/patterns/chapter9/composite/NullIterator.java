package com.chaoyue.design.patterns.chapter9.composite;

import java.util.Iterator;

/**
 * chapter6 里面提到的空对象的运用 可以让用户不必要做null值判断 简化使用
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
