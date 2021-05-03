package com.michaeljjf.chapter13;

public class TestBuyTicketForLock {
    public static void main(String[] args) {
        //定义一个线程对象：
        BuyTicketThreadForLock t = new BuyTicketThreadForLock();
        //窗口1买票：
        Thread t1 = new Thread(t, "窗口1");
        t1.start();
        //窗口2买票：
        Thread t2 = new Thread(t, "窗口2");
        t2.start();
        //窗口3买票：
        Thread t3 = new Thread(t, "窗口3");
        t3.start();
        //窗口4买票：
        Thread t4 = new Thread(t, "窗口4");
        t4.start();
        //窗口5买票：
        Thread t5 = new Thread(t, "窗口5");
        t5.start();
    }
}
