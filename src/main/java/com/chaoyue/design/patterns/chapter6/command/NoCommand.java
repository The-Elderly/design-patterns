package com.chaoyue.design.patterns.chapter6.command;

/**
 * 当不想返回一个有意义的对象时 可以使用空对象
 */
public class NoCommand implements Command {
    public void execute() {
        System.out.println("do nothing");
    }

    @Override
    public void undo() {
        System.out.println("do nothing");
    }
}
