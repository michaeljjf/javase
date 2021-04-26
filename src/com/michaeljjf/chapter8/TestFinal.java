package com.michaeljjf.chapter8;

public class TestFinal {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        //第1种情况：
        //final修饰一个变量，变量的值不可以改变，这个变量也变成了一个字符常量，约定俗称的规定：名字大写
        final int A = 10;//final修饰基本数据类型
        //A = 20; 报错：不可以修改值
        //第2种情况：
        final Person d = new Person();//final修饰引用数据类型，那么地址值就不可以改变
        //d = new Person(); //-->地址值不可以更改
        //d对象的属性依然可以改变：
        d.age = 10;
        d.weight = 13.7;
        //第3种情况：
        final Person d2 = new Person();
        a(d2);
        //第4种情况：
        b(d2);
    }
    public static void a(Person d){
        d = new Person();
    }
    public static void b(final Person d){
        //d被final修饰 ，指向不可以改变
        //d = new Person();
    }
}
