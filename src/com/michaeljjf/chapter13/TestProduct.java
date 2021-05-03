package com.michaeljjf.chapter13;

public class TestProduct {
    public static void main(String[] args) {
        // 共享的商品
        Product product = new Product();
        // 创建生产者和消费者线程：
        ProducerThread producerThread = new ProducerThread(product);
        CustomerThread customerThread = new CustomerThread(product);

        producerThread.start();
        customerThread.start();
    }
}
