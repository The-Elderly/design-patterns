package com.chaoyue.design.patterns.chapter9.iterator.version2;

/**
 * 迭代器模式
 * 使用JDK 提供的 Iterator 类来实现
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
