package com.michaeljjf.chapter10;

import java.util.Date;

public class TestUtilDate {
    public static void main(String[] args) {
        Date d = new Date();
//        System.out.println(d);
//        System.out.println(d.toString());
//        System.out.println(d.toGMTString());
//        System.out.println(d.toLocaleString());

//        System.out.println(d.getYear());
//        System.out.println(d.getMonth());
//        System.out.println(System.currentTimeMillis());
//

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

    }
}
