package com.michaeljjf.chapter9;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请录入第一个数：");
            int num1 = scanner.nextInt();
            System.out.println("请录入第二个数：");
            int num2 = scanner.nextInt();
            System.out.println("商：" + num1 / num2);
        } catch (Exception ex) {
            System.out.println("对不起，程序出现异常！");
//            System.out.println(ex.getMessage());
//            ex.printStackTrace();
        } finally {
            System.out.println("这个是一定会被执行的！");
        }
    }
}
