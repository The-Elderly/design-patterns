package com.chaoyue.design.patterns.chapter8.version2;

import java.util.Arrays;

/**
 * 模板方法在JDK中的使用
 * 例子中用到的Arrays.sort 和 Arrays.toString 都属于模板方法的设计模式
 * 对象只要实现了 ComparableTimSort.sort 就可以进行排序
 */
public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Duck1", 1),
                new Duck("Duck3", 3),
                new Duck("Duck5", 5),
                new Duck("Duck2", 2),
                new Duck("Duck4", 4)

        };
        System.out.println("before sort");
        System.out.println(Arrays.toString(ducks));
        System.out.println("after sort");
        Arrays.sort(ducks);
        System.out.println(Arrays.toString(ducks));
    }
}
