package com.iterator.V3;

import com.iterator.V1.MenuItem;

import java.util.Iterator;

/**
 * 餐厅菜单
 */
public class DinerMenuV3 implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenuV3() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("番茄炒鸡蛋","番茄炒鸡蛋的描述",false,16.5);
        addItem("黄瓜吵虾仁","黄瓜吵虾仁的描述",false,20);
        addItem("吵土豆丝","吵土豆丝的描述",true,12.3);
    }
    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_ITEMS){
            System.out.println("抱歉菜单已满");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIteratorV3(menuItems);
    }
}