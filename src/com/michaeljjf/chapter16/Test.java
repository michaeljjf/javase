package com.michaeljjf.chapter16;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.toString());
        System.out.println(Math.random());

        Student student = new Student();
        student.display();

        Demo demo = new Demo();
        System.out.println(demo.toString());
    }
}
