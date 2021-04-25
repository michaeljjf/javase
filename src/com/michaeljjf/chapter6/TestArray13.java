package com.michaeljjf.chapter6;

import java.util.Arrays;

public class TestArray13 {
    public static void main(String[] args) {
        //给定一个数组：
        int[] arr = {1, 3, 7, 2, 4, 8};
        //toString:对数组进行遍历查看的，返回的是一个字符串，这个字符串比较好看
        System.out.println(Arrays.toString(arr));

        //binarySearch:二分法查找：找出指定数组中的指定元素对应的索引：
        //这个方法的使用前提：一定要查看的是一个有序的数组：
        //sort：排序 -->升序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 4));

        int[] arr2 = {1, 3, 7, 2, 4, 8};
        //copyOf:完成数组的复制：
        int[] newArr = Arrays.copyOf(arr2, 4);
        System.out.println(Arrays.toString(newArr));

        //copyOfRange:区间复制：
        int[] newArr2 = Arrays.copyOfRange(arr2, 1, 4);//[1,4)-->1,2,3位置
        System.out.println(Arrays.toString(newArr2));

        //equals:比较两个数组的值是否一样：
        int[] arr3 = {1, 3, 7, 2, 4, 8};
        int[] arr4 = {1, 3, 7, 2, 4, 8};
        System.out.println(Arrays.equals(arr3, arr4));//true
        System.out.println(arr3 == arr4);//false ==比较左右两侧的值是否相等，比较的是左右的地址值，返回结果一定是false

        //fill：数组的填充：
        int[] arr5 = {1, 3, 7, 2, 4, 8};
        Arrays.fill(arr5, 10);
        System.out.println(Arrays.toString(arr5));
    }
}
