package com.lsgf.pojo;
//实体类
public class User {
    private int id;
    private String dname;
    private String location;

    public User() {
    }

    public User(int id, String dname, String location) {
        this.id = id;
        this.dname = dname;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return id+" "+dname+" "+location;
    }
}
