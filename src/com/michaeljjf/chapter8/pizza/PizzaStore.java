package com.michaeljjf.chapter8.pizza;

import java.util.Scanner;

public class PizzaStore {
    public static Pizza getPizza(int choose) {
        Scanner scanner = new Scanner(System.in);
        Pizza pizza = null;
        switch (choose) {
            case 1: {
                System.out.println("请输入培根的克数：");
                int weight = scanner.nextInt();
                System.out.println("请输入比萨的大小：");
                int size = scanner.nextInt();
                System.out.println("请输入比萨的价格：");
                int price = scanner.nextInt();
                pizza = new BaconPizza("培根比萨", size, price, weight);
            }
            break;
            case 2: {
                System.out.println("请录入你想要加入的水果：");
                String burdening = scanner.next();
                System.out.println("请输入比萨的大小：");
                int size = scanner.nextInt();
                System.out.println("请输入比萨的价格：");
                int price = scanner.nextInt();
                pizza = new FruitsPizza("水果比萨", size, price, burdening);
            }
            break;
        }
        return pizza;
    }
}
