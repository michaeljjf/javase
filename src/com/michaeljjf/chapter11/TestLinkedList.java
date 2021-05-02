package com.michaeljjf.chapter11;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.addFirst("bbb");
        list.addLast("ccc");
        list.addLast("ccc");
        list.offer("dddd");// 加在最后
        list.offerFirst("pp");// 加在最前
        list.offerLast("rr");// 加在最后

//        System.out.println(list);
//        System.out.println(list.poll());// 删除头上的元素并且将元素输出
//        System.out.println(list.pollFirst());
//        System.out.println(list.pollLast());
//
//        System.out.println(list.removeFirst());
//        System.out.println(list.removeLast());
//        System.out.println(list);// LinkedList可以添加重复数据

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------------------");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------------------");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("---------------------");
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
    }
}
