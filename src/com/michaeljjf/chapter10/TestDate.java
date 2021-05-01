package com.michaeljjf.chapter10;

public class TestDate {
    public static void main(String[] args) {
        // String -> java.sql.Date
        java.sql.Date date = java.sql.Date.valueOf("2021-05-01");
        // java.sql.Date -> java.util.Date
        java.util.Date date2 = date;
        System.out.println(date2.toString());
    }
}
