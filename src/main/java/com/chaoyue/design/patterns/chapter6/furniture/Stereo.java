package com.chaoyue.design.patterns.chapter6.furniture;

public class Stereo {
    private int volume;
    private String name = "";

    public Stereo() {
    }

    public Stereo(String name) {
        this.name = name;
    }


    public void on() {
        System.out.println(name + " Stereo on");
    }

    public void off() {
        System.out.println(name + " Stereo off");
    }

    public void setCd() {
        System.out.println(name + " Stereo add CD");
    }

    public void setDvd() {
        System.out.println(name + " Stereo add DVD");
    }

    public void setRadio() {
        System.out.println(name + " Stereo add Radio");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
