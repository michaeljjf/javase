package com.michaeljjf.chapter11;

import com.michaeljjf.chapter8.Student;

import java.util.Comparator;

public class MyCompare implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
