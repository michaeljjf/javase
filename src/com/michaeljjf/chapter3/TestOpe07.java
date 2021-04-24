package com.michaeljjf.chapter3;

public class TestOpe07 {
    public static void main(String[] args) {
        //实现功能：给出三个数，求和：
        //1.给出三个数：
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        //2.求和
        //int sum = num1+num2+num3;
        //定义一个变量，用来接收和：
        int sum = 0;
        sum = sum + num1;//等效：  sum += num1;
        sum = sum + num2;// sum += num2;
        sum = sum + num3;//sum += num3;
        //3.将和输出：
        System.out.println("和：" + sum);

        byte a = 10;
        int b = 20;
        a += b;// +=会自动转换类型
        // a = a+b ;// 更正：a = (byte)(a+b); 普通的+需要强转
        System.out.println(a);
    }
}
