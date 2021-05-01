package com.michaeljjf.chapter10;

import java.util.Arrays;

public class TestString {
    public static void main(String[] args) {
//        String str = "abc";
//        System.out.println(str);
//        String str2 = new String(new char[] {'a', 'b', 'c'});
//        System.out.println(str2);
//        System.out.println(str2 == str);
//        System.out.println(str2.equals(str));
//        System.out.println(str2.isEmpty());
//        String str3 = "   ";
//        System.out.println(str3.isBlank());
//        System.out.println(str3.isEmpty());
//
//        String str4 = "测试字符串";
//        System.out.println(str4.length());
//        System.out.println(str4.charAt(0));

        //字符串的截取：
        String s10 = "abcdefhijk";
        System.out.println(s10.substring(3));
        System.out.println(s10.substring(3, 6));//[3,6)
        //字符串的合并/拼接操作：
        System.out.println(s10.concat("pppp"));
        //字符串中的字符的替换：
        String s11 = "abcdeahija";
        System.out.println(s11.replace('a', 'u'));
        //按照指定的字符串进行分裂为数组的形式：
        String s12 = "a-b-c-d-e-f";
        String[] strs = s12.split("-");
        System.out.println(Arrays.toString(strs));
        //转大小写的方法：
        String s13 = "abc";
        System.out.println(s13.toUpperCase());
        System.out.println(s13.toUpperCase().toLowerCase());
        //去除收尾空格：
        String s14 = "    a  b  c    ";
        System.out.println(s14.trim());
        //toString()
        String s15 = "abc";
        System.out.println(s15.toString());
        //转换为String类型：
        System.out.println(String.valueOf(false));
    }
}
