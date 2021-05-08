package com.michaeljjf.chapter8;

// 静态导入，导入java.lang下的Math类中的所有静态的内容

import static java.lang.Math.*;

public class Test {
    int id;
    static int sid;

    public static void main(String[] args) {

//        Girl girl = new Girl();
//        Animal animal = new Dog();
//        girl.play(animal);
//        animal = new Cat();
//        girl.play(animal);

        Animal an = PetStore.getAnimal("猫");
        an.shout();

//        Math.random();
//        System.out.println(random());

//        Test test = new Test();
//        test.id = 11;
//        test.sid = 22;
//
//        Test test1 = new Test();
//        test1.sid = 33;// 静态属性，内存在共享，此时test.sid = 33;
//
//        System.out.println(test.sid);

//        Person person = new Person();
//
//        //System.out.println(person.name);
//
//        person.name = "张三";
//        person.age = 19;
//        person.height = 170.2;
//        person.weight = 65.4;
//
//        //person.eat();
//        person.play();
//        System.out.println(person.introduce());
    }
}
