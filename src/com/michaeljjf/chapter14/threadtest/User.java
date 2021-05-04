package com.michaeljjf.chapter14.threadtest;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1153822256518293453L;

    private String name;
    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }
}
