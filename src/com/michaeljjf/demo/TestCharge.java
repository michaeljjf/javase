package com.michaeljjf.demo;

import java.util.Scanner;

public class TestCharge {
    public static void main(String[] args) {
        String details = "";// 收支明细内容（字符串拼接）
        int balance = 0;// 实时余额

        while (true) {
            System.out.println("----欢迎使用小鲨鱼记账软件----");
            System.out.println("1、收支明细");
            System.out.println("2、登记收入");
            System.out.println("3、登记支出");
            System.out.println("4、退出系统");
            System.out.println("请选择您要使用的功能：");

            Scanner scanner = new Scanner(System.in);
            while (!scanner.hasNextInt()) {
                System.out.println("输入的内容不对，请重新输入！");
                scanner.next();
            }
            int choice = scanner.nextInt();
            String remark = "";
            switch (choice) {
                case 1:
                    System.out.println("记账系统->收支明细");
                    System.out.println(details);
                    break;
                case 2:
                    System.out.println("记账系统->登记收入");
                    System.out.println("收入金额：");
                    while (!scanner.hasNextInt()) {
                        System.out.println("只能输入数字，请重新输入！");
                        scanner.next();
                    }
                    int inMoney = scanner.nextInt();
                    System.out.println("收入说明：");
                    remark = scanner.next();
                    balance += inMoney;
                    details += "收入金额：" + inMoney + "，收入说明：" + remark + "，余额：" + balance + "\n";
                    break;
                case 3:
                    System.out.println("记账系统->登记支出");
                    System.out.println("收入金额：");
                    while (!scanner.hasNextInt()) {
                        System.out.println("只能输入数字，请重新输入！");
                        scanner.next();
                    }
                    int outMoney = scanner.nextInt();
                    System.out.println("收入说明：");
                    remark = scanner.next();
                    balance -= outMoney;
                    details += "支出金额：" + outMoney + "，支出说明：" + remark + "，余额：" + balance + "\n";
                    break;
                case 4:
                    System.out.println("确认要退出程序吗！Y/N？");
                    String yes = scanner.next();
                    if ("y".equals(yes.toLowerCase())) {
                        System.out.println("程序结束！");
                        return;
                    }
                    break;
                default:
                    System.out.println("输入的内容不对，请重新输入！");
                    break;
            }
        }
    }
}
