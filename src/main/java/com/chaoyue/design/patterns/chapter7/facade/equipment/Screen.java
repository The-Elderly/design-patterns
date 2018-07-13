package com.chaoyue.design.patterns.chapter7.facade.equipment;

public class Screen {

    public void up() {
        System.out.println("Screen up");
    }

    public void down() {
        System.out.println("Screen down");
    }

    @Override
    public String toString() {
        return "Screen{}";
    }
}
