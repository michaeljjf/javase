package com.michaeljjf.chapter2;

public class TestVar07 {
    public static void main(String[] args) {
        //定义字符类型的变量：
        char ch1 = 'a';
        System.out.println(ch1);
        char ch2 = 'A';
        System.out.println(ch2);
        char ch3 = '4';
        System.out.println(ch3);
        char ch4 = '中';
        System.out.println(ch4);
        char ch5 = '?';
        System.out.println(ch5);
        //java中无论：字母，数字，符号，中文都是字符类型的常量，都占用2个字节。
        char ch6 = ' ';
        System.out.println(ch6);
        //字符类型：单引号引起来的单个字符
        System.out.println("--------------------------------");
        /*
        转义字符：
        \将后面的普通字符转换为特殊含义
        */
        char ch7 = '\n';
        System.out.println("aaa" + ch7 + "bbb");

        System.out.println("aaa\nbbb");// \n  换行

        System.out.println("aaaaaaa\tbbb");  //  \t  制表符

        System.out.println("aaa\bbbb");//aabbb  \b  向前退一格
        System.out.println("aaa\rbbb");//bbb   \r 将光标到本行开头 ：回车

        System.out.println("\"java\""); // \" 将双引号原样输出  \' 将单引号原样输出 \\ 将\原样输出
    }
}
