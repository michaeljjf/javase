package com.michaeljjf.chapter2;

public class TestVar06 {
    public static void main(String[] args) {
        //浮点类型的常量有两种形式：
        //十进制形式：
        double num1 = 3.14;
        System.out.println(num1);
        //科学计数法形式：
        double num2 = 314E-2;
        System.out.println(num2);

        //浮点类型的变量：
        //注意：浮点型默认是double类型的，要想将一个double类型的数赋给float类型，必须后面加上F或者f
        float f1 = 3.14234567898623F;
        System.out.println(f1);
        //注意：double类型后面可以加D或者d，但是一般我们都省略不写
        double d1 = 3.14234567898623D;
        System.out.println(d1);

        //注意：我们最好不要进行浮点类型的比较：
        float f2 = 0.3F;
        double d2 = 0.3;
        System.out.println(f2 == d2);
        /*
        区别：
        = 赋值运算：  将等号右侧的值赋给等号左侧
        == 判断==左右两侧的值是否相等  ：结果要么相等 要么不相等
        ==运算符的结果就是要么是true，要么是false
        */

    }
}
