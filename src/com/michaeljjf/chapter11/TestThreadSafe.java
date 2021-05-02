package com.michaeljjf.chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadSafe {
    public static void main(String[] args) {

        // 1、直接使用ArrayList，线程不安全
//        List list = new ArrayList();

        // 2、使用同步类容器，实现线程安全
        List oldList = new ArrayList();
        List list = Collections.synchronizedList(oldList);

        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 10000; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    list.add("aaa");
                }
            });
        }
        executorService.shutdown();

        while (true) {
            if (executorService.isTerminated()) {
                System.out.println("所有的子线程都执行完毕了！");
                System.out.println(list.size());
                if (list.size() == 10000) {
                    System.out.println("线程安全！");
                } else {
                    System.out.println("线程不安全！");
                }
                break;
            }
        }
    }
}
