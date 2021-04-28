package com.michaeljjf.chapter8.pizza;

/**
 * 水果比萨
 */
public class FruitsPizza extends Pizza {
    private String burdening;

    public String getBurdening() {
        return burdening;
    }

    public void setBurdening(String burdening) {
        this.burdening = burdening;
    }

    public FruitsPizza(String name, int size, int price, String burdening) {
        super(name, size, price);
        this.burdening = burdening;
    }

    @Override
    public String show() {
        return super.show() + "\n配料水果：" + burdening;
    }
}
