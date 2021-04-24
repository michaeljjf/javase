package com.michaeljjf.chapter3;

public class TestOpe04 {
    public static void main(String[] args) {
        int a = 5;
        a++;//理解为：相当于  a=a+1 操作
        System.out.println(a);//6

        a = 5;
        ++a;//理解为：相当于  a=a+1 操作
        System.out.println(a); //6

        //总结：++单独使用的时候，无论放在前还是后，都是加1操作

        //将++参与到运算中：
        //规则：看++在前还是在后，如果++在后：先运算，后加1   如果++在前，先加1，后运算
        a = 5;
        int m = a++ + 7;//先运算  m=a+7  再加1：  a = a+1
        System.out.println(m);//12
        System.out.println(a);//6

        a = 5;
        int n = ++a + 7;//先加1  a=a+1  再运算：  n = a+7
        System.out.println(n);//13
        System.out.println(a);//6
    }
}
