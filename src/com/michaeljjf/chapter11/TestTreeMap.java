package com.michaeljjf.chapter11;

import com.michaeljjf.chapter8.Student;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Map<Student, Integer> map = new TreeMap<>(new CompareStudent());
        map.put(new Student("A", 15), 1000);
        map.put(new Student("B", 14), 1001);
        map.put(new Student("C", 13), 1002);
        map.put(new Student("D", 16), 1003);
        map.put(new Student("E", 18), 1004);
        map.put(new Student("E", 18), 1004);
        System.out.println(map);
    }
}

class CompareStudent implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
