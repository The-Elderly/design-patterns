package com.chaoyue.design.patterns.chapter9.composite;

/**
 * 组合模式 Composite Pattern
 * 允许你将对象组合成树形结构来表现 整体/部分 层次结构
 * 组合能让客户以一致的方式处理个别对象以及对象组合
 * demo 说明
 * MenuComponent 中的 add remove getChild 就是子节点相关的方法 这种结构适合从根节点开始向子节点遍历
 * 遍历操作依然可以使用 Iterator 迭代器模式来操作 方式就是迭代器的递归调用
 * 因为没有储存父节点信息 所以不能从子节点向上遍历
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        // 初始化各个菜单组件
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
        // 最顶层的菜单组件
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // 开始加入具体订单项
        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));
        dinerMenu.add(new MenuItem("HotDog", "HotDog!!!!!", false, 1.2));
        // 在一个菜单中加入另一个菜单
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla ice cream", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        //waitress.printMenu();

        waitress.printVegetarianMenu();

    }
}
