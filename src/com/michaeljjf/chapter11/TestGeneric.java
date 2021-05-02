package com.michaeljjf.chapter11;

import com.michaeljjf.chapter8.Person;
import com.michaeljjf.chapter8.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestGeneric<E> {
    public static <E> void b(E e) {

    }

    public void displayList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
        //list.get(0);
    }
}

class Demo {
    public static void main(String[] args) {
//        TestGeneric<String> testGeneric = new TestGeneric<>();
//        testGeneric.b("abc");
//
//        testGeneric.displayList(Arrays.asList(new String[]{"a", "b", "c"}));
//
//        Object obj = new Object();
//        String s = new String();
//        obj = s;// 多态的一种形式
//
//        Object[] objArr = new Object[10];
//        String[] strArr = new String[10];
//        objArr = strArr;// 多态的一种形式
//
//        List<Object> list1 = new ArrayList<>();
//        List<String> list2 = new ArrayList<>();
////        list1 = list2; // 不允许，泛型是并列关系
//        List<?> list3 = null;
//        list3 = list1;


        //a,b,c三个集合是并列的关系：
        List<Object> a = new ArrayList<>();
        List<Person> b = new ArrayList<>();
        List<Student> c = new ArrayList<>();
        /*开始使用泛型受限：泛型的上限
        List<? extends Person>:
        就相当于：
        List<? extends Person>是List<Person>的父类，是List<Person的子类>的父类
         */
        // ? extends Person，表示Person及以下
        List<? extends Person> list1 = null;
        //list1 = a;
        list1 = b;
        list1 = c;
        /*开始使用泛型受限：泛型的下限
        List<? super Person>
        就相当于：
        List<? super Person>是List<Person>的父类，是List<Person的父类>的父类
         */
        // ? super Person，表示Person及以上
        List<? super Person> list2 = null;
        list2 = a;
        list2 = b;
        //list3 = c;

    }
}