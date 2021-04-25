package com.michaeljjf.chapter6;

public class TestArray04 {
    public static void main(String[] args) {
        //实现一个功能：给定一个数组，求出数组中最大的数。
        //1.给定一个数组
        int[] arr = {12, 3, 7, 4, 8, 125, 9, 45, 666, 36};
        int maxNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        System.out.println("数组中最大的值是：" + maxNum);
    }
}
