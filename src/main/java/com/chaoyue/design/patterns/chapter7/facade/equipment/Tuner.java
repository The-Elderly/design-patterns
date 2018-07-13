package com.chaoyue.design.patterns.chapter7.facade.equipment;

/**
 * 调音器
 */
public class Tuner {
    private Amplifier amplifier;

    public void on() {
        System.out.println("Tuner on");
    }

    public void off() {
        System.out.println("Tuner off");
    }

    public void setAm() {
        System.out.println("Tuner setAm");
    }

    public void setFm() {
        System.out.println("Tuner setFm");
    }

    public void setFrequency() {
        System.out.println("Tuner setFrequency");
    }

    @Override
    public String toString() {
        return "Tuner{" +
                "amplifier=" + amplifier +
                '}';
    }
}
