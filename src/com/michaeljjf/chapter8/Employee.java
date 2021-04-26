package com.michaeljjf.chapter8;

public class Employee extends Person {

    @Override
    public void eat() {
        System.out.println("我在公司吃饭");
    }

    public void work() {
        System.out.println("工作");
    }
}
