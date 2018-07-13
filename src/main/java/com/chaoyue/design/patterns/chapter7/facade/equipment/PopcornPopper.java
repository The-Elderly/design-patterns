package com.chaoyue.design.patterns.chapter7.facade.equipment;

/**
 * 爆米花机
 */
public class PopcornPopper {
    public void on() {
        System.out.println("PopcornPopper on");
    }

    public void off() {
        System.out.println("PopcornPopper off");
    }

    public void pop() {
        System.out.println("PopcornPopper pop");
    }

    @Override
    public String toString() {
        return "PopcornPopper{}";
    }
}
