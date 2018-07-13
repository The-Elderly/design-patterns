package com.chaoyue.design.patterns.chapter6;

import com.chaoyue.design.patterns.chapter6.command.LightOnCommand;
import com.chaoyue.design.patterns.chapter6.furniture.Light;

/**
 * 命令模式 Command Pattern
 * 将 请求 封装成对象 以便使用不同的请求、队列或者日志来参数化其他对象
 * 命令模式也支持可以撤销的操作
 * demo 说明
 * LightOnCommand 就是一组被封装好的对象 SimpleRemoteControl 只调用execute方法即可 无须关心具体实现
 * 命令模式其实还是围绕面向接口编程 Command 就是接口
 */

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
