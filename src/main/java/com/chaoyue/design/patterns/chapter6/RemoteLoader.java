package com.chaoyue.design.patterns.chapter6;


import com.chaoyue.design.patterns.chapter6.command.*;
import com.chaoyue.design.patterns.chapter6.furniture.CeilingFan;
import com.chaoyue.design.patterns.chapter6.furniture.Light;
import com.chaoyue.design.patterns.chapter6.furniture.Stereo;

/**
 * 遥控器
 * 对具体加点的控制都被封装成命令对象，遥控器无须关心命令具体该做什么，只需要把控制命令交给家电类，由家电类去处理就好
 */

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        // 初始化家电们。。。
        Light livingRoomLight = new Light("living room");
        Light kitchenLight = new Light("kitchen");
        Stereo stereo = new Stereo("living room");
        // 初始化具体命令
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        // 为遥控器装配命令
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOnWithCD, stereoOff);
        // 测试执行遥控器命令
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        // 测试UNDO
        remoteControl.undoButtonWasPushed();
        // 测试按下没有设置命令的按钮
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        System.out.println("---- let's test fan -----");
        // 测试复杂的风扇操作
        CeilingFan ceilingFan = new CeilingFan("Living room");
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(4, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(5, ceilingFanHighCommand, ceilingFanOffCommand);

        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(5);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        // 测试宏命令操作
        System.out.println("---- let's test macro -----");
        Command[] allOn = {livingRoomLightOn, kitchenLightOn, stereoOnWithCD, ceilingFanHighCommand};
        Command[] allOff = {livingRoomLightOff, kitchenLightOff, stereoOff, ceilingFanOffCommand};

        MacroCommand macroOn = new MacroCommand(allOn);
        MacroCommand macroOff = new MacroCommand(allOff);

        remoteControl.setCommand(6, macroOn, macroOff);
        remoteControl.onButtonWasPushed(6);
        remoteControl.offButtonWasPushed(6);
        remoteControl.undoButtonWasPushed();

    }
}
