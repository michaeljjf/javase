package com.michaeljjf.chapter2;

public class TestVar08 {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1);//A
        System.out.println(ch1 + 90);//155
        System.out.println(155 - ch1);//90
        //char类型我们看到的样子就是它本身的字面常量,但是底层在进行计算的时候，实际上是按照一个码进行计算的。
        //这个码就是ASCII
        //之前说char类型是按照Unicode码表进行存储的 (Unicode兼容了ASCII码，Unicode的前128位置ASCII)

        char ch2 = '中';
        System.out.println(ch2);// 中
        System.out.println(ch2 + 90);// 20103
        System.out.println(20103 - ch2);// 90

        //转换：
        int num1 = (int) ch2;
        System.out.println(num1);//20013

        char ch = (char) 20013;
        System.out.println(ch);

        int num2 = '中';
        char ch5 = 20013;
        System.out.println(ch5);

        //面试题：
        char ch6 = '2' + 2;
        System.out.println(ch6);//'4'--->4
    }
}
