package com.michaeljjf.chapter10;

import java.util.Calendar;
import java.util.Scanner;

public class Test08 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        //录入日期的String：
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你想要查看的日期：（提示：请按照例如2012-5-6的格式书写）");
        String strDate = sc.next();
        /*System.out.println(strDate);*/
        //String--->Calendar:
        //String-->Date:
        java.sql.Date date = java.sql.Date.valueOf(strDate);
        //Date--->Calendar:
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        //后续操作：
        //星期提示：
        System.out.println("日\t一\t二\t三\t四\t五\t六\t");
        //获取本月的最大天数：
        int maxDay = cal.getActualMaximum(Calendar.DATE);
        //获取当前日期中的日：
        int nowDay = cal.get(Calendar.DATE);
        //将日期调为本月的1号：
        cal.set(Calendar.DATE, 1);
        //获取这个一号是本周的第几天：
        int num = cal.get(Calendar.DAY_OF_WEEK);
        /*System.out.println(num);*/
        //前面空出来的天数为：
        int day = num - 1;
        //引入一个计数器：
        int count = 0;//计数器最开始值为0
        //在日期前将空格打印出来：
        for (int i = 1; i <= day; i++) {
            System.out.print("\t");
        }
        //空出来的日子也要放入计数器：
        count = count + day;
        //遍历：从1号开始到maxDay号进行遍历：
        for (int i = 1; i <= maxDay; i++) {
            if (i == nowDay) {//如果遍历的i和当前日子一样的话，后面多拼一个*
                System.out.print(i + "*" + "\t");
            } else {
                System.out.print(i + "\t");
            }
            count++;//每在控制台输出一个数字，计数器做加1操作
            if (count % 7 == 0) {//当计数器的个数是7的倍数的时候，就换行操作
                System.out.println();
            }
        }
    }
}
