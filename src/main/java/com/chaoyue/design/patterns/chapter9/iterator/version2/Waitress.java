package com.chaoyue.design.patterns.chapter9.iterator.version2;

import java.util.Iterator;

@SuppressWarnings("Duplicates")
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n ----- \n BREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\n LUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator it) {
        while (it.hasNext()) {
            MenuItem menuItem = (MenuItem) it.next();
            System.out.println(menuItem);
        }
    }
}
