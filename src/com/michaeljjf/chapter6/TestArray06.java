package com.michaeljjf.chapter6;

public class TestArray06 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 56, 7, 3, 56};
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 7) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("元素对应的索引：" + index);
        } else {
            System.out.println("查无此数！");
        }
    }
}
