package com.michaeljjf.chapter8;

public class Teacher extends Person {
    @Override
    public void eat() {
        System.out.println("我在学校食堂吃饭");
    }

    public void teach() {
        System.out.println("教书");
    }
}
