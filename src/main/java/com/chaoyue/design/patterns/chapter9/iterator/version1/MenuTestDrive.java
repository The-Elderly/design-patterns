package com.chaoyue.design.patterns.chapter9.iterator.version1;

/**
 * 迭代器模式 Interpreter Pattern
 * 提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示
 * demo 说明
 * Iterator 主要方法就是 hasNext（是否还有下一个元素）next（获取当前元素并下移指针）
 * 通过这两个方法就可以获取到聚合对象中的所有元素
 * 聚合对象各自提供一个自己迭代器的实现 如 DinerMenuIterator 和 DinerMenuIterator 上层直接用 Iterator遍历就饿好了
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
