package com.michaeljjf.chapter2;

import java.util.Scanner;

public class TestVar11 {
    public static void main(String[] args){
        //实现功能：求圆的周长和面积
        //【1】提取变量：提取变量，就是为了一劳永逸，以后只要改变变量的值，下面只要用到这个变量的地方，取值也都发生变化了
        //【2】一个变量被final修饰，这个变量就变成了一个常量，这个常量的值就不可变了
        //     这个常量就是我们所说的 字符常量  ---》pi
        //     约定俗成的规定：字符常量的名字全部大写
        //【3】使用扫描器：Scanner的使用--》注意通过形象的理解去使用
        final double PI = 3.14;
        //拿来一个扫描器：
        Scanner sc = new Scanner(System.in);
        //给一个友好性的提示：
        System.out.print("请录入一个半径：");
        //让扫描器扫描键盘录入的int类型的数据：
        int r = sc.nextInt();

        //求周长：
        double c = 2*PI*r;
        System.out.println("周长为："+c);

        //求面积：
        //PI = 9.29;报错：TestVar11.java:12: 错误: 无法为最终变量pi分配值
        double s = PI*r*r;
        System.out.println("面积为："+s);
    }
}
