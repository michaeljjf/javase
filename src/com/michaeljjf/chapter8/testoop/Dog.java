package com.michaeljjf.chapter8.testoop;

/**
 * 被final修饰的类，代表没有子类，不能被继承
 * 一旦类被final修饰，那类的方法就没有必要被final修饰了，因为不能被重写
 */
public /*final*/ class Dog {
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
}
