package com.chaoyue.design.patterns.chapter6.command;

import com.chaoyue.design.patterns.chapter6.furniture.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
