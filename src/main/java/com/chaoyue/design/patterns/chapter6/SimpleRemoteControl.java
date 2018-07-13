package com.chaoyue.design.patterns.chapter6;

import com.chaoyue.design.patterns.chapter6.command.Command;

public class SimpleRemoteControl {
    Command command;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command slot) {
        this.command = slot;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
