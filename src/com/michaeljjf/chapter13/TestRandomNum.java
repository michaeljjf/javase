package com.michaeljjf.chapter13;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 测试有返回值的情况
 */
public class TestRandomNum implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10);
    }
}

class Test01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestRandomNum testRandomNum = new TestRandomNum();
        FutureTask futureTask = new FutureTask(testRandomNum);
        Thread thread = new Thread(futureTask);
        thread.start();
        // 获取线程得到的返回值：
        Object obj = futureTask.get();
        System.out.println(obj);
    }
}
