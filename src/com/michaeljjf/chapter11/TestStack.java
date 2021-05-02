package com.michaeljjf.chapter11;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.add("A");
        stack.add("B");
        stack.add("C");
        stack.add("D");
        System.out.println(stack);
        System.out.println("栈是否为空：" + stack.empty());

        System.out.println("查看栈顶的数据，但是不移除：" + stack.peek());
        System.out.println(stack);

        System.out.println("查看栈顶的数据，并且移除：" + stack.pop());
        System.out.println(stack);

        stack.push("D");
        System.out.println(stack);
    }
}
