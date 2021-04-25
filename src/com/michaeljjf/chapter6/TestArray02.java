package com.michaeljjf.chapter6;

public class TestArray02 {
    public static void main(String[] args) {
        //数组的作用：用来存储相同类型的数据
        //以int类型数据为案例：数组用来存储int类型数据
        //1.声明(定义数组)
        int[] arr; //定义一个int类型的数组，名字叫arr
        //int arr2[];
        //如果数组只声明，没有后续操作，那么这个数组相当于没定义
        //int[] arr3 = null;//空 辨别：数组赋值为null和什么都没有赋值  不一样的效果

        //2.创建
        arr = new int[4];//给数组开辟了一个长度为4的空间
        //编译期声明和创建会被合为一句话: int[] arr = new int[4];

        //3.赋值
        arr[0] = 12;
        arr[3] = 47;
        arr[2] = 98;
        arr[1] = 56;
        arr[2] = 66;
        /*
        arr[4] = 93;
        出现异常：Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
        Array 数组
        Index 索引
        OutOf 超出
        Bounds 界限
        Exception 异常
        ---》数组索引越界异常
        */

        //4.使用
        System.out.println(arr[2]);
        System.out.println(arr[0] + 100);
        //通过数组一个属性来获取  length 长度
        System.out.println("数组的长度是：" + arr.length);

        char[] test = new char[5];
        for (char b : test) {
            System.out.println(b);
        }
    }
}
