package com.michaeljjf.chapter8.testoop;

public interface SwimmingAbility {
    // 默认所有属性、方法，都是public的
    /*public static final*/ int NUM = 100;// 常量
    /*public abstract*/ void swimming();// 抽象方法
    // 以上定义方式，是JDK1.8之前的方式

    // JDK1.8之后（需要使用default修饰） default非抽象方法
    default void display() {
        System.out.println("我是接口里的display方法。。。");
    }
    // 静态方法
    static void a() {
        System.out.println("接口中的静态方法a。。。");
    }
}
