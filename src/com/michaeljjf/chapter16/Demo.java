package com.michaeljjf.chapter16;

public class Demo {
    int id;
    static int sid;

    public void a() {
        System.out.println(id);
        System.out.println(sid);
        System.out.println("----a");
    }

    public static void b() {
//        System.out.println(id);// 静态方法里不能访问实例变量
        System.out.println(sid);
        System.out.println("----b");
    }
}
