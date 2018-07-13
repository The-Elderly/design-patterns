package com.chaoyue.design.patterns.chapter7.facade.equipment;

public class CdPlayer {

    private Amplifier amplifier;

    public void on() {
        System.out.println("CdPlayer on");
    }

    public void off() {
        System.out.println("CdPlayer off");
    }

    public void eject() {
        System.out.println("CdPlayer eject");
    }

    public void pause() {
        System.out.println("CdPlayer pause");
    }

    public void play() {
        System.out.println("CdPlayer play");
    }

    public void stop() {
        System.out.println("CdPlayer stop");
    }

    @Override
    public String toString() {
        return "CdPlayer{" +
                "amplifier=" + amplifier +
                '}';
    }
}
