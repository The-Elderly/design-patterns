package com.chaoyue.design.patterns.chapter6.command;


import com.chaoyue.design.patterns.chapter6.furniture.Stereo;

public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(12);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
