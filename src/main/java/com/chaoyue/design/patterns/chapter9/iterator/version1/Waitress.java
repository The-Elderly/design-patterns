package com.chaoyue.design.patterns.chapter9.iterator.version1;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

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
