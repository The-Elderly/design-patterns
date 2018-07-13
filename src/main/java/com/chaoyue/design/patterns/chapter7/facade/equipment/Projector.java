package com.chaoyue.design.patterns.chapter7.facade.equipment;

/**
 * 投影仪
 */
public class Projector {
    private DvdPlayer dvdPlayer;

    public void on() {
        System.out.println("Projector on");
    }

    public void off() {
        System.out.println("Projector off");
    }

    public void tvMode() {
        System.out.println("Projector tvMode");
    }

    // 宽屏模式
    public void wideScreenMode() {
        System.out.println("Projector wideScreenMode");
    }

    @Override
    public String toString() {
        return "Projector{" +
                "dvdPlayer=" + dvdPlayer +
                '}';
    }
}
