package com.michaeljjf.chapter6;

import java.util.Scanner;

public class TestArray01 {
    public static void main(String[] args) {
        //功能：键盘录入十个学生的成绩，求和，求平均数：
        //定义一个求和的变量：
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {//i:控制循环次数
            System.out.print("请录入第" + i + "个学生的成绩：");
            int score = sc.nextInt();
            sum += score;
        }

        System.out.println("十个学生的成绩之和为：" + sum);
        System.out.println("十个学生的成绩平均数为：" + sum / 10);

        //本题的缺点：
        //求第6个学生的成绩：？？？？？---》不能
    }
}
