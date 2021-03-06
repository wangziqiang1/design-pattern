package com.iterator.V1;

/**
 * 菜单项
 */
public class MenuItem {
    /**
     * 菜单名称
     */
    private String name;
    /**
     * 描述
     */
    private String description;
    /**
     * 是否为素食项
     */
    private  boolean vegetarian;
    /**
     * 价格
     */
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}