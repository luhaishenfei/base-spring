package com.lsgf.pojo;

public class Hello {
    private String str;

    public Hello(String str) {
        this.str = str;
    }

    public Hello() {
    }


    public String getStr() {
        return str;
    }


    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{"+"str='"+str+'\''+'}';
    }
}
