package com.chaoyue.design.patterns.chapter3.IODemo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 测试LowerCaseInputStream 能否像其他 FilterInputStream 的装饰类一样工作
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        // 查看当前路径 并拼接resource路径 找到 chaoyue_test.txt
        String path = new File("").getAbsolutePath() + "\\src\\main\\resources\\testFile\\";
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(new FileInputStream(path + "chaoyue_test.txt")));
            while ((c = in.read()) > 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
