package com.chaoyue.design.patterns.chapter8.version3;

import javax.swing.*;
import java.awt.*;

/**
 * JFrame 使用 模板方法的demo
 * JFrame 的更新算法被称为paint 在默认状态下 paint 是不做事的 它只是一个钩子
 * 子类通过覆盖 paint 方法 在窗口中绘制消息
 */

public class MyFrame extends JFrame {
    MyFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        String meg = "Hello World!";
        graphics.drawString(meg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Template Method Pattern");
        myFrame.setVisible(true);
    }
}
