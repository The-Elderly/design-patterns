package com.chaoyue.design.patterns.chapter7.facade.equipment;

public class DvdPlayer {
    private Amplifier amplifier;

    public void on() {
        System.out.println("DvdPlayer on");
    }

    public void off() {
        System.out.println("DvdPlayer off");
    }

    public void eject() {
        System.out.println("DvdPlayer eject");
    }

    public void pause() {
        System.out.println("DvdPlayer pause");
    }

    public void play(String dvd) {
        System.out.println("DvdPlayer play " + dvd);
    }

    public void stop() {
        System.out.println("DvdPlayer stop");
    }

    public void setSurroundSound() {
        System.out.println("DvdPlayer setSurroundSound");
    }

    public void setTwoChannelAudio() {
        System.out.println("DvdPlayer setTwoChannelAudio");
    }

    @Override
    public String toString() {
        return "DvdPlayer{" +
                "amplifier=" + amplifier +
                '}';
    }
}
