package com.chaoyue.design.patterns.chapter8.version3;

import java.applet.Applet;
import java.awt.*;

/**
 * Applet 中使用模板方法模式的 demo
 * 其中 init start stop destroy paint 都是 Applet 提供的钩子方法
 * 由于applet 现在已经不怎么用了 看看就好
 */

public class MyApplet extends Applet {
    private String message;

    public void init() {
        message = "Hello World,I'm alive";
        repaint();
    }

    public void start() {
        message = "Now I'm starting up ...";
        repaint();
    }

    public void stop() {
        message = "Oh, now I'm being stopped ...";
        repaint();
    }

    public void destroy() {
        // applet 正在被销毁
    }

    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }
}
