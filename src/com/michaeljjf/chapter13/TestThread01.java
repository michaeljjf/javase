package com.michaeljjf.chapter13;

public class TestThread01 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

class TestThread02 extends Thread {
    @Override
    public void run() {
        for (int i = 20; i <= 30 ; i++) {
            System.out.println(Thread.currentThread().getName() + ":" +i);
        }
    }
}

class Test03 {
    public static void main(String[] args) throws InterruptedException {
        TestThread01 t1 = new TestThread01();
        t1.setName("子线程1");
        t1.setPriority(1);
        t1.start();

        TestThread02 t2 = new TestThread02();
        t2.setName("子线程2");
        t2.setPriority(10);
        t2.start();
        t2.join();
    }
}
