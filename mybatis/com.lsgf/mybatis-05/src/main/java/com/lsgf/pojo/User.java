package com.lsgf.pojo;
//实体类
public class User {
    private int id;
    private String dname;
    private String loc;

    public User() {
    }

    public User(int id, String dname, String loc) {
        this.id = id;
        this.dname = dname;
        this.loc = loc;
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

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return id+" "+dname+" "+loc;
    }
}
