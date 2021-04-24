package com.michaeljjf.chapter2;

import java.util.Scanner;

/**
 * 加深对Scanner的使用
 */
public class TestVar12 {
    public static void main(String[] args){
        //键盘录入学生的信息：年龄，身高，姓名，性别：
        //键盘录入年龄：(接收int类型数据)
        Scanner sc = new Scanner(System.in);
        System.out.print("请录入年龄：");
        int age = sc.nextInt();
        //键盘录入身高：（接收double类型数据）
        System.out.print("请录入身高：");
        double height = sc.nextDouble();
        //键盘录入姓名：(接收String类型数据--》字符串)
        System.out.print("请录入姓名：");
        String name = sc.next();
        //键盘录入性别：(接受char类型)
        System.out.print("请录入性别：");
        String sexStr = sc.next();
        char sex = sexStr.charAt(0);
        //上面两句可以合为一句表示：char sex = sc.next().charAt(0);
        System.out.println("该学生的信息为:姓名是："+name+",年龄是："+age+",身高为："+height+",性别是："+sex);
    }
}
