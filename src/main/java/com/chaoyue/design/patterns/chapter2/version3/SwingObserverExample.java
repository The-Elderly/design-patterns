package com.chaoyue.design.patterns.chapter2.version3;

import javax.swing.*;
import java.awt.*;

/**
 * Swing中关于观察者的使用demo
 * <p>
 * button的点击事件为主题 AngelListener 和 DevilListener 分别为观察者
 * 当点击事件发生，AngelListener 和 DevilListener 都能收到消息 并作出自己的响应
 */
public class SwingObserverExample {

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    private void go() {
        JFrame jFrame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        jFrame.getContentPane().add(BorderLayout.CENTER, button);
        Container contentPane = jFrame.getContentPane();
        contentPane.add(button);
        jFrame.pack();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
