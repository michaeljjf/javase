package com.michaeljjf.chapter13;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 商品类
 */
public class Product {
    // 品牌
    private String brand;
    // 名字
    private String name;
    // 引入一个灯：true:红色  false 绿色，默认情况下没有商品 让生产者先生产  然后消费者再消费
    boolean flag = false;
    // 声明一个Lock锁
    Lock lock = new ReentrantLock();
    // 搞一个生产者的等待队列
    Condition produceCondition = lock.newCondition();
    // 搞一个消费者的等待队列
    Condition consumeCondition = lock.newCondition();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public /*synchronized*/ void setProduct(String brand, String name) {
        lock.lock();
        try {
            if (flag) {
                try {
//                    wait();
                    produceCondition.await();// 阻塞
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.setBrand(brand);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setName(name);
            // 将生产信息做一个打印
            System.out.println("生产者生产：" + this.getBrand() + "---" + this.getName());
            // 生产完以后，灯变色：变成红色
            flag = true;
            // 告诉消费者赶紧来消费
//            notify();
            consumeCondition.signal();
        } finally {
            lock.unlock();
        }
    }

    public /*synchronized*/ void getProduct() {
        lock.lock();
        try {
            if (!flag) {
                // flag == false没有商品，等待生产者生产
                try {
//                    wait();
                    consumeCondition.await();// 阻塞
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 有商品，消费
            System.out.println("消费者消费：" + this.getBrand() + "---" + this.getName());
            // 消费完：灯变色
            flag = false;
            // 通知生产者生产
//            notify();
            produceCondition.signal();
        } finally {
            lock.unlock();
        }
    }
}
