package com.michaeljjf.chapter11;

import java.util.ArrayList;
import java.util.Collections;

public class TestUtil {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("111");
        list1.add("222");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("");
        list2.add("");
        Collections.copy(list2, list1);

        System.out.println(list2);

        //fill 填充
        Collections.fill(list2,"yyy");
        System.out.println(list2);
    }
}
