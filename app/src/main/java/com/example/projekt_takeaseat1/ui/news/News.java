package com.example.projekt_takeaseat1.ui.news;

public class News {

    private String name;
    private int mIconid;

    public News(String name, int mIconid) {
        this.name = name;
        this.mIconid = mIconid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getmIconid() {
        return mIconid;
    }

    public void setmIconid(int mIconid) {
        this.mIconid = mIconid;
    }
}
