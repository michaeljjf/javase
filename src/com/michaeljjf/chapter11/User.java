package com.michaeljjf.chapter11;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class User implements Delayed {
    private int id;//用户id
    private String name;//用户名字
    private long endTime;//结束时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public User(int id, String name, long endTime) {
        this.id = id;
        this.name = name;
        this.endTime = endTime;
    }

    //只包装用户名字就可以
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public long getDelay(TimeUnit unit) {
        //计算剩余时间 剩余时间小于0 <=0  证明已经到期
        return this.getEndTime() - System.currentTimeMillis();
    }

    @Override
    public int compareTo(Delayed o) {
        //队列中数据 到期时间的比较
        User other = (User)o;
        return ((Long)(this.getEndTime())).compareTo((Long)(other.getEndTime()));
    }
}
