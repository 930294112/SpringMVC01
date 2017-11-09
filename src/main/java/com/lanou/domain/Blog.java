package com.lanou.domain;

/**
 * Created by dllo on 17/11/8.
 */
public class Blog {
    private int id; //博客id
    private String title; //博客标题
    private String des;//博客内容

    public Blog() {
    }

    public Blog(int id, String title, String des) {

        this.id = id;
        this.title = title;
        this.des = des;
    }

    public Blog(String title, String des) {
        this.title = title;
        this.des = des;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}
