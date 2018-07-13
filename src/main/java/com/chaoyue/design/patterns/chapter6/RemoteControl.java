package com.chaoyue.design.patterns.chapter6;

import com.chaoyue.design.patterns.chapter6.command.Command;
import com.chaoyue.design.patterns.chapter6.command.NoCommand;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    // 假设遥控器各有 7个ON按钮 和 7个OFF按钮 1个撤销按钮
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        // 15个按钮全部初始化为 onCommand(什么都不做)
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    /**
     * 设置命令
     *
     * @param slot       遥控器按钮的位置 从0开始
     * @param onCommand  ON按钮按下时执行的命令
     * @param offCommand OFF按钮按下时执行的命令
     */
    void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    // ON 按钮按下时，执行设置的ON按钮方法 并设置UNDO按钮的命令以供撤销按钮使用
    void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    //OFF 按钮按下时，执行设置的OFF按钮方法 并设置UNDO按钮的命令以供撤销按钮使用
    void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    //UNDO 按钮按下时，执行设置的UNDO按钮方法
    void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("\n ----- Remote Control -----\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot ").append(i).append(" ]").append(onCommands[i].getClass().getName()).append("  ").append(offCommands[i].getClass().getName()).append("\n");
        }
        return stringBuffer.toString();
    }
}
