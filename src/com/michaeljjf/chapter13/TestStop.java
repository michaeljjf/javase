package com.michaeljjf.chapter13;

public class TestStop {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 6) {
                Thread.currentThread().stop();
            }
            System.out.println(i);
        }
    }
}
