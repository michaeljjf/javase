package com.michaeljjf.chapter13;

public class ProducerThread extends Thread {
    // 共享商品
    private Product product;

    public ProducerThread(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
//            synchronized (product) {
//                if (i % 2 == 0) {
//                    product.setBrand("费列罗");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    product.setName("巧克力");
//                } else {
//                    product.setBrand("哈尔滨");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    product.setName("啤酒");
//                }
//
//                //将生产信息做一个打印：
//                System.out.println("生产者生产了：" + product.getBrand() + "---" + product.getName());
//            }


            if (i % 2 == 0) {
                product.setProduct("费列罗", "巧克力");
            } else {
                product.setProduct("哈尔滨", "啤酒");
            }
        }
    }
}
