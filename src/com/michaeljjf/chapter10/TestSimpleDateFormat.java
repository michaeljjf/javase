package com.michaeljjf.chapter10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date d = dateFormat.parse("2021-04-06 12:23:55");
            System.out.println(d);
        } catch (ParseException exception) {
            exception.printStackTrace();
        }

        String format = dateFormat.format(new Date());
        System.out.println(format);


        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.toGMTString());
        System.out.println(date.toLocaleString());

    }
}
