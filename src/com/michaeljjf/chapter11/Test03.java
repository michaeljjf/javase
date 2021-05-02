package com.michaeljjf.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("abc");
        System.out.println(list.get(2));
        //List集合 遍历：
        //方式1：普通for循环：
        System.out.println("--------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //方式2：增强for循环：
        System.out.println("--------------------------------------");
        for (Object o : list) {
            System.out.println(o);
        }
        //方式3：迭代器：
        System.out.println("--------------------------------------");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        // 扩容1.5倍测试
//        int oldCapacity = 20;
//        int newCapacity = oldCapacity >> 1;
//        System.out.println(oldCapacity);
//        System.out.println(newCapacity);
    }
}
