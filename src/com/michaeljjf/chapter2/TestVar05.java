package com.michaeljjf.chapter2;

/**
 * 测试基本数据类型，基本数据类型包括
 * 数值型：整数类型（byte short int long）；浮点类型（float double）
 * 字符型：char
 * 布尔型：boolean
 * 除了基本数据类型以外的所有类型都属于引用数据类型，本章重点：基本数据类型
 */
public class TestVar05 {
    public static void main(String[] args) {
        //定义整数类型的变量：
        //给变量赋值的时候，值可以为不同进制的：
        int num1 = 12;//默认情况下赋值就是十进制的情况
        System.out.println(num1);
        int num2 = 012;//前面加上0，这个值就是八进制的
        System.out.println(num2);
        int num3 = 0x12;//前面加上0x或者0X，这个值就是十六进制的
        System.out.println(num3);
        int num4 = 0b10;//前面加上0b或者0B,这个值就是二进制的
        System.out.println(num4);

        //定义byte类型的变量：
        byte b = 126;//定义了一个byte类型的变量，名字叫b，赋值为12
        System.out.println(b);
        //注意：超范围的赋值会报错。
        short s = 30000;
        System.out.println(s);
        int i = 1234;
        System.out.println(i);
        //整数类型默认就是int类型的，所以12345678910是一个int类型的数，对于int类型来说，它超出范围了
        //要想把一个数给long类型变量，那么后面加上L(推荐)或者l就可以了
        long num5 = 12345678910L;
        System.out.println(num5);
        //注意：只有这个数超出int类型的范围了后面才需要加上L，否则无需加L也可以赋值给long类型：
        long num6 = 12;
        System.out.println(num6);


    }
}
