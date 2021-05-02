package com.michaeljjf.chapter11;

import java.util.HashSet;

public class TestString {
    public static void main(String[] args) {
        //创建一个HashSet集合：
        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("apple");
        hs.add("banana");
        hs.add("html");
        hs.add("apple");
        hs.add("css");
        System.out.println(hs.size());
        System.out.println(hs);
    }
}
