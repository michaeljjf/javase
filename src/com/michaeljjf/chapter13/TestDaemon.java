package com.michaeljjf.chapter13;

/**
 * 将子线程设置为主线程的伴随线程，主线程停止的时候，子线程也不要继续执行了
 * 案例：皇上 --》驾崩 ---》妃子陪葬
 */
public class TestDaemon {
    public static void main(String[] args) {
        TestThread01 tt = new TestThread01();
        tt.setDaemon(true);// 设置伴随线程  注意：先设置，再启动
        tt.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("main---" + i);
        }
    }
}
