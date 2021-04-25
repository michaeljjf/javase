package com.michaeljjf.chapter6;

public class TestArray12 {
    /*
    1.可变参数：作用提供了一个方法，参数的个数是可变的 ,解决了部分方法的重载问题
    int...num
    double...num
    boolean...num
    2.可变参数在JDK1.5之后加入的新特性
    3.方法的内部对可变参数的处理跟数组是一样
    4.可变参数和其他数据一起作为形参的时候，可变参数一定要放在最后
    5.我们自己在写代码的时候，建议不要使用可变参数。
    */
    public static void main(String[] args) {
        method01(10);
        //method01(); // error
        method01(20, 30, 40);
        method01(30, 40, 50, 60, 70);
        method01(11,new int[]{11,22,33,44});
    }

    public static void method01(int num2, int... num) {
        System.out.println("--------------------------------");
        for (int i : num) {
            System.out.print(i + "\t");
        }
        if (num.length > 0) {
            System.out.println();
        }
        System.out.println(num2);
    }
}
