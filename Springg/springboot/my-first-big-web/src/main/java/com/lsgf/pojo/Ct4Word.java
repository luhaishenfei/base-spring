package com.lsgf.pojo;



public class Ct4Word {

    private int ID;
    private String tableField;

    public Ct4Word() {
    }

    public Ct4Word(int ID, String tableField) {
        this.ID = ID;
        this.tableField = tableField;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTableField() {
        return tableField;
    }

    public void setTableField(String tableField) {
        this.tableField = tableField;
    }
}
