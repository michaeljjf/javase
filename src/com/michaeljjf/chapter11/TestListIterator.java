package com.michaeljjf.chapter11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            if ("cc".equals(it.next())) {
                it.add("kk");
            }
        }

        System.out.println(it.hasNext());
        System.out.println(it.hasPrevious());

        //逆向遍历：
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

        System.out.println(it.hasNext());
        System.out.println(it.hasPrevious());
        System.out.println(list);
    }
}
