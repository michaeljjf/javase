package com.michaeljjf.chapter8.testoop;

public class Test {
    public static void main(String[] args) {
        // 1、final修饰基本数据类型，值不可以修改
        final int TOTAL = 10;
        // TOTAL = 20;

        // 2、final修饰引用类型，地址不可以修改，对象的属性可以修改
        final Dog dog = new Dog();
        dog.setName("张三");
        dog.setAge(12);
        dog.shout();
        dog.swimming();
        SwimmingAbility.a();
        // dog = new Dog();

        // 3、final修饰引用类型，但方法中传递的是地址，所以方法中可以改变地址
        final Dog dog2 = new Dog();
        a(dog2);
        // 4、final修饰引用类型，但方法中的形参是用final修饰，方法中不可以改变地址
        final Dog dog3 = new Dog();
        b(dog3);

        // Math类，被final修饰，不能继承，构建方法被private，不能被实例化
        // Math.random();
    }

    public static void a(Dog dog) {
        // dog未被final修饰，可以改变引用地址
        dog = new Dog();
    }

    public static void b(final Dog dog) {
        // dog被final修饰，不可以改变引用地址
        // dog = new Dog();
    }
}
