package com.chaoyue.design.patterns.chapter6.command;

import com.chaoyue.design.patterns.chapter6.furniture.CeilingFan;

public class CeilingFanMediumCommand implements Command {
    private CeilingFan ceilingFan;
    // 为撤销命令准备对象记录撤销前的状态记录
    private int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    // 速度发生改变时 记录改变前的速度 供撤销时使用
    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @SuppressWarnings("Duplicates")
    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
