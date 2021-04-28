package com.michaeljjf.chapter8.pizza;

/**
 * 培根比萨
 */
public class BaconPizza extends Pizza {
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public BaconPizza(String name, int size, int price, int weight) {
        super(name, size, price);
        this.weight = weight;
    }

    @Override
    public String show() {
        return super.show() + "\n培根克数：" + weight + "克";
    }
}
