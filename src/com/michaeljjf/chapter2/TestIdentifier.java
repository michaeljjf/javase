package com.michaeljjf.chapter2;

/**
 * 测试标识符
 * 包，类，变量，方法.....等等,只要是起名字的地方,那个名字就是标识符
 * 类名：首字母大写，其余遵循驼峰命名
 * 方法名，变量名：首字母小写，其余遵循驼峰命名
 * 包名：全部小写，不遵循驼峰命名
 */
public class TestIdentifier {
    public static void main(String[] args) {
        // 不可以以数字开头，不可以使用java中的关键字
        int age = 20;

        // 常量定义final
        final int testAge = 10;
        final String finalString = "test final";

        System.out.println(age);
        System.out.println(testAge);
        System.out.println(finalString);
    }
}
