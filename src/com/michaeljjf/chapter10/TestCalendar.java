package com.michaeljjf.chapter10;

import java.util.Calendar;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        //常用的方法：
        // get方法，传入参数：Calendar中定义的常量
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.getActualMaximum(Calendar.DATE));//获取当月日期的最大天数
        System.out.println(calendar.getActualMinimum(Calendar.DATE));//获取当月日期的最小天数
        // set方法：可以改变Calendar中的内容
        calendar.set(Calendar.YEAR, 1990);
        calendar.set(Calendar.MONTH, 3);
        calendar.set(Calendar.DATE, 16);
        System.out.println(calendar);
        //String--->Calendar:
        //分解：
        //String--->java.sql.Date:
        java.sql.Date date = java.sql.Date.valueOf("2020-4-5");
        //java.sql.Date-->Calendar:
        calendar.setTime(date);
        System.out.println(calendar);

    }
}
