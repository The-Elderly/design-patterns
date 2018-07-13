package com.chaoyue.design.patterns.chapter7.facade.equipment;

/**
 * 剧院灯光
 */
public class TheaterLights {
    public void on() {
        System.out.println("TheaterLights on");
    }

    public void off() {
        System.out.println("TheaterLights off");
    }

    // 昏暗模式
    public void dim(int level) {
        System.out.println("TheaterLights dim " + level);
    }

    @Override
    public String toString() {
        return "TheaterLights{}";
    }
}
