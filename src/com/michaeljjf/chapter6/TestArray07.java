package com.michaeljjf.chapter6;

public class TestArray07 {
    public static void main(String[] args) {
        //功能：给定一个数组,在数组下标为2的位置上添加一个元素91

        //1.给定一个数组：
        int[] arr = {12, 34, 56, 7, 3, 10, 55, 66, 77, 88, 999, 89};
        //           0  1   2 3 4 5
        System.out.println("数组长度：" + arr.length);
        //2.输出增加元素前的数组：
        System.out.print("增加元素前的数组：");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {//i==arr.length-1 最后一个元素不用加,
                System.out.print(arr[i]);
            }
        }

        //3.增加元素
        /*
        arr[5] = arr[4];
        arr[4] = arr[3];
        arr[3] = arr[2];
        */
        int index = 1;//在这个指定位置添加 元素
        for (int i = arr.length - 1; i >= (index + 1); i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = 666;
        System.out.println("\n数组长度：" + arr.length);
        //4.输出增加元素后的数组：
        System.out.print("增加元素后的数组：");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {//i==arr.length-1 最后一个元素不用加,
                System.out.print(arr[i]);
            }
        }

    }
}
