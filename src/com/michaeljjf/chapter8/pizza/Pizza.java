package com.michaeljjf.chapter8.pizza;

public class Pizza {
    private String name;
    private int size;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Pizza() {
    }

    public Pizza(String name, int size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String show() {
        return "比萨的名字：" + name + "\n比萨的大小：" + size + "寸\n比萨的价格：" + price + "元";
    }
}
