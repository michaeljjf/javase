package com.michaeljjf.chapter8.pizza;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请选择想要制作的比萨，1、培根比萨 2、水果比萨：");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int choose = scanner.nextInt();
            if (choose != 1 && choose != 2) {
                System.out.println("输入有误，程序退出：" + choose);
                return;
            }
            Pizza pizza = PizzaStore.getPizza(choose);
            System.out.println(pizza.show());
        } else {
            System.out.println("输入有误，程序退出：" + scanner.next());
        }
    }
}
