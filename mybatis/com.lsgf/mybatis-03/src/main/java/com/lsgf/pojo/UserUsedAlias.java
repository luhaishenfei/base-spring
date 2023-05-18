package com.lsgf.pojo;

import org.apache.ibatis.type.Alias;

//实体类
@Alias("aliasUser")
public class UserUsedAlias {
    private int id;
    private String dname;
    private String loc;

    public UserUsedAlias() {
    }
    public UserUsedAlias(int id, String dname, String loc) {
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
}
