package com.michaeljjf.chapter8;

public class Student extends Person {

    public Student(String name) {
        super(name);
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            return this.name.equals(student.name);
        }
        return false;
    }

    @Override
    public String toString() {
        return "[name:" + this.name + ",age:" + this.age + "]";
    }

    public void study() {
        System.out.println("学习");
    }
}
