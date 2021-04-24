package com.michaeljjf.chapter3;

import java.util.Scanner;

public class TestOpe12 {
    public static void main(String[] args) {
        //实现功能：男孩女孩选择晚饭吃什么，如果意见一致，听男生的，如果意见不一致，听女生的

        //1.要让男孩女孩选择晚饭吃什么：
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择今晚吃什么：1.火锅 2.烧烤 3.麻辣烫 4.西餐");
        System.out.println("请男孩选择：");
        int boyChoice = sc.nextInt();
        System.out.println("请女孩选择：");
        int girlChoice = sc.nextInt();
        //2.判断：
        System.out.println(boyChoice == girlChoice ? "听男孩的" : "听女孩的");
    }
}
