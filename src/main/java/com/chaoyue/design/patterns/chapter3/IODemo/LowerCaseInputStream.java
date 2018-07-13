package com.chaoyue.design.patterns.chapter3.IODemo;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 自己定义一个新的InputStream类型 用来装饰原来的 FilterInputStream 添加小写转换功能
 */
public class LowerCaseInputStream extends FilterInputStream {

    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    // 重写基类的 read方法 添加小写转换处理
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    // 重写基类的 read方法 添加小写转换处理
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + len; i++) {
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return result;
    }

}
