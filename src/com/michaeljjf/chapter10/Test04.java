package com.michaeljjf.chapter10;

public class Test04 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        //compareTo：只返回三个值：要么是0,-1,1
        Integer i1 = new Integer(6);
        Integer i2 = new Integer(12);
        System.out.println(i1.compareTo(i2));// return (x < y) ? -1 : ((x == y) ? 0 : 1);
        //equals:Integer对Object中的equals方法进行了重写，比较的是底层封装的那个value的值。
        //Integer对象是通过new关键字创建的对象：
        Integer i3 = new Integer(12);
        Integer i4 = new Integer(12);
        System.out.println(i3 == i4);//false 因为==比较的是两个对象的地址
        boolean flag = i3.equals(i4);
        System.out.println(flag);
        //Integer对象通过自动装箱来完成：
        Integer i5 = 130;
        Integer i6 = 130;
        System.out.println(i5.equals(i6));//true
        System.out.println(i5 == i6);
        /*
        如果自动装箱值在-128~127之间，那么比较的就是具体的数值
        否在，比较的就是对象的地址
         */
        //intValue() :作用将Integer--->int
        Integer i7 = 130;
        int i = i7.intValue();
        System.out.println(i);
        //parseInt(String s) :String--->int:
        int i8 = Integer.parseInt("12");
        System.out.println(i8);
        //toString:Integer--->String
        Integer i10 = 130;
        System.out.println(i10.toString());
    }
}
