package com.michaeljjf.chapter11;

import com.michaeljjf.chapter8.Student;

import java.util.HashSet;

public class TestStudent {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("A"));
        hashSet.add(new Student("B"));
        hashSet.add(new Student("C"));
        hashSet.add(new Student("D"));
        hashSet.add(new Student("E"));
        hashSet.add(new Student("E"));
        System.out.println(hashSet.size());
        System.out.println(hashSet);
    }
}
