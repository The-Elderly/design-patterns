package com.chaoyue.design.patterns.chapter7.facade.equipment;

/**
 * 放大器
 */
public class Amplifier {
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;

    public void on() {
        System.out.println("Amplifier on");
    }

    public void off() {
        System.out.println("Amplifier off");
    }

    public void setCd() {
        System.out.println("Amplifier setCd");
    }

    public void setDvd(String dvd) {
        System.out.println("Amplifier setDvd " + dvd);
    }

    // 设置为立体声
    public void setStereoSound() {
        System.out.println("Amplifier setStereoSound");
    }

    // 设置为环绕声
    public void setSurroundSound() {
        System.out.println("Amplifier setSurroundSound");
    }

    public void setTuner() {
        System.out.println("Amplifier setTuner");
    }

    public void setVolume(Integer volume) {
        System.out.println("Amplifier setVolume " + volume);
    }

    @Override
    public String toString() {
        return "Amplifier{" +
                "tuner=" + tuner +
                ", dvdPlayer=" + dvdPlayer +
                ", cdPlayer=" + cdPlayer +
                '}';
    }
}
