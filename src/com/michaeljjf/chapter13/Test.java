package com.michaeljjf.chapter13;

public class Test {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(Thread.currentThread().getName() + ":" + i);
//        }
//
//        TestThread testThread = new TestThread();
//        testThread.start();

//        TestRunnable testRunnable = new TestRunnable();
//        Thread thread = new Thread(testRunnable, "子线程");
//        thread.start();
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(Thread.currentThread().getName() + ":" + i);
//        }

        //定义一个线程对象：
        BuyTicketThread t = new BuyTicketThread();
        //窗口1买票：
        Thread t1 = new Thread(t,"窗口1");
        t1.start();
        //窗口2买票：
        Thread t2 = new Thread(t,"窗口2");
        t2.start();
        //窗口3买票：
        Thread t3 = new Thread(t,"窗口3");
        t3.start();
    }
}
