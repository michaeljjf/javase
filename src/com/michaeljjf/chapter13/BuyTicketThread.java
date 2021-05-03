package com.michaeljjf.chapter13;

public class BuyTicketThread implements Runnable {
    int ticketNum = 10;

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (ticketNum > 0) {
                System.out.println("我在" + Thread.currentThread().getName() + "买到了北京到哈尔滨的第" + ticketNum-- + "张车票");
            }
        }
    }
}
