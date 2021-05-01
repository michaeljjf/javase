package com.michaeljjf.chapter10;

import java.util.Calendar;
import java.util.Scanner;

public class DisplayCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想要查看的日期：（提示：请按照例如2021-5-1的格式书写）");
        String strDate = scanner.next();
//        String strDate = "2021-5-1";
        try {
            java.sql.Date date = java.sql.Date.valueOf(strDate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            // 中国人习惯的格式,实现 一	二	三	四	五	六	日 的效果
            System.out.println("一\t二\t三\t四\t五\t六\t日\t");

            int maxDay = calendar.getActualMaximum(Calendar.DATE);
            int nowDay = calendar.get(Calendar.DATE);
            calendar.set(Calendar.DATE, 1);
            int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
            int chineseWeekDay = getChineseWeek(weekDay);
//            System.out.println(maxDay);
//            System.out.println(nowDay);
//            System.out.println(weekDay);
//            System.out.println(chineseWeekDay);
            // 将1号之前的空格打印出来
            int blankDay = chineseWeekDay - 1;
            for (int i = 1; i <= blankDay; i++) {
                System.out.print("\t");
            }

            // 从1号开始输出
            int count = blankDay;
            for (int i = 1; i <= maxDay; i++) {
                if (i == nowDay) {
                    System.out.print(i + "*" + "\t");
                } else {
                    System.out.print(i + "\t");
                }
                count++;
                if (count % 7 == 0) {
                    System.out.println();
                }
            }
        } catch (Exception exception) {
            System.out.println("日期格式输入有误：" + strDate);
            exception.printStackTrace();
        }
    }

    /**
     * 返回中国人习惯的格式
     * 实现 一	二	三	四	五	六	日 的效果
     * 默认日	一	二	三	四	五	六
     *
     * @param weekDay
     * @return
     */
    public static int getChineseWeek(int weekDay) {
        int newWeekDay = weekDay - 1;
        if (newWeekDay == 0) {
            // 星期日在日历上返回是1，重置为7
            weekDay = 7;
        }
        return newWeekDay;
    }
}
