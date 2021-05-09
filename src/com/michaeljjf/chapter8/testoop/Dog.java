package com.michaeljjf.chapter8.testoop;

/**
 * 被final修饰的类，代表没有子类，不能被继承
 * 一旦类被final修饰，那类的方法就没有必要被final修饰了，因为不能被重写
 */
public /*final*/ class Dog implements SwimmingAbility{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 被final修饰的方法，子类不能重写
    public final void shout() {
        System.out.println("我是一只小狗，汪汪汪。。。");
    }

    @Override
    public void swimming() {
        System.out.println("我会狗刨。。。。");
        // 1、如果没有重写，可以这样调接口的default修饰方法，要不调用的就是实现类自己的方法
        display();
        // 2、如果有重写，想在实现类调用接口的default修饰方法，可以使用接口.super.xxx()方式调用
        SwimmingAbility.super.display();
    }

    /**
     * 子类可以重写，但是重写后，不能再加default修饰
     */
    @Override
    public void display() {
        System.out.println("我是实现类自己的display方法。。。。");
    }
}
