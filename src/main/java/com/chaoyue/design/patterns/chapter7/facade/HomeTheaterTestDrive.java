package com.chaoyue.design.patterns.chapter7.facade;

import com.chaoyue.design.patterns.chapter7.facade.equipment.*;

/**
 * 外观模式 Facade Pattern
 * 提供了一个统一的接口，来访问子系统中的一群接口，外观定义了一个高层接口，让子系统更容易使用
 * demo 说明
 * HomeTheaterFacade 就是equipment包下所有子类接口的一个统一外观 可以理解成一组宏命令
 * 其实这个模式在开发中经常会用到 最常见的一个使用场景就是主流程内将多步操作拆分为多个方法，主流程的方法就是所拆分方法的外观
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights theaterLights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popcornPopper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, theaterLights, screen, popcornPopper);
        homeTheaterFacade.watchMovie("test movie");
        System.out.println(" \n ---- now the movie is end ----\n");
        homeTheaterFacade.endMovie();
    }
}
