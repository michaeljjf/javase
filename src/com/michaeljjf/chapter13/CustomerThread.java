package com.michaeljjf.chapter13;

public class CustomerThread extends Thread {
    private Product product;

    public CustomerThread(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
//            synchronized (product) {
//                System.out.println("消费者消费了：" + product.getBrand() + "---" + product.getName());
//            }
            product.getProduct();
        }
    }
}
