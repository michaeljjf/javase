package com.michaeljjf.chapter8;

public class Person {
    String name;
    int age;
    double height;
    double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Person() {
        super();
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, double height, double weight) {
        this(name);
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void eat() {
        int num = 10;
        System.out.println("我喜欢吃饭");
    }

    public void sleep(String address) {
        System.out.println("我在" + address + "睡觉");
    }

    public String introduce() {
        return "我的名字是：" + name + "，我的年龄是：" + age + "，我的身高是：" + height + "，我的体重是：" + weight;
    }

    public void play() {
        eat();
        System.out.println("上网");
        System.out.println("洗澡");
    }

    public static void main(String[] args) {
        Person person = new Person("张三", 38, 170, 60);
        System.out.println(person.introduce());
        person.eat();
        person.sleep("酒店");
    }
}
