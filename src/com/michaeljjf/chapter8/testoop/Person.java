package com.michaeljjf.chapter8.testoop;

public abstract class Person {

}

class Student extends Person {

}

class TestAbstract {
    public static void main(String[] args) {
        Student student = new Student();
        Person person = new Student();
    }
}
