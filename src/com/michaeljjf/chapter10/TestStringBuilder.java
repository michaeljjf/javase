package com.michaeljjf.chapter10;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("test").append("123");
        System.out.println(stringBuilder.toString());

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append("abc") == sb.append("def"));//true
    }
}
