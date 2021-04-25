package com.michaeljjf.chapter6;

import java.util.Arrays;

public class TestArray08 {
    public static void main(String[] args) {
        //功能：给定一个数组,删除下标为2元素

        //1.给定一个数组：
        int[] arr = {12, 34, 56, 7, 3, 10, 34, 45, 56, 7, 666};
        //           0  1   2 3 4 5
        //2.输出删除前的数组：
        System.out.println("删除元素前的数组：" + Arrays.toString(arr));

        //3.删除
        /*
        arr[2] = arr[3];
        arr[3] = arr[4];
        arr[4] = arr[5];
        */
        int index = 9;
        for (int i = index; i <= arr.length - 2; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;

        //4.输出删除后的数组：
        System.out.println("删除元素后的数组：" + Arrays.toString(arr));
    }
}
