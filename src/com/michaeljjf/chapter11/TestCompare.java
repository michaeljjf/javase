package com.michaeljjf.chapter11;

import com.michaeljjf.chapter8.Student;

public class TestCompare {
    public static void main(String[] args) {
        String a = "A";
        String b = "a";
        System.out.println(a.compareTo(b));
        // 外部比较器和内部比较器 谁好呀？
        // 答案：外部比较器，多态，扩展性好
        Student student1 = new Student("A");
        Student student2 = new Student("A");
        MyCompare myCompare = new MyCompare();
        System.out.println(myCompare.compare(student1, student2));
    }
}
