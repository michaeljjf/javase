package com.michaeljjf.chapter11;

import java.util.concurrent.DelayQueue;

public class TestDelayQueue {
    //创建一个队列：
    DelayQueue<User> dq = new DelayQueue<>();

    //登录游戏：
    public void login(User user) {
        dq.add(user);
        System.out.println("用户：[" + user.getId() + "],[" + user.getName() + "]已经登录，预计下机时间为：" + user.getEndTime());
    }

    //时间到，退出游戏，队列中移除：
    public void logout() {
        //打印队列中剩余的人：
        System.out.println(dq);
        try {
            User user = dq.take();
            System.out.println("用户：[" + user.getId() + "],[" + user.getName() + "]下机时间到，自动退出游戏");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //获取在线人数：
    public int onlineSize() {
        return dq.size();
    }

    //这是main方法，程序的入口
    public static void main(String[] args) {
        //创建测试类对象：
        TestDelayQueue test = new TestDelayQueue();
        //添加登录的用户：
        test.login(new User(1, "张三", System.currentTimeMillis() + 5000));
        test.login(new User(2, "李四", System.currentTimeMillis() + 2000));
        test.login(new User(3, "王五", System.currentTimeMillis() + 10000));
        //一直监控
        while (true) {
            //到期的话，就自动下线：
            test.logout();
            //队列中元素都被移除了的话，那么停止监控，停止程序即可
            if (test.onlineSize() == 0) {
                break;
            }
        }
    }
}
