package com.lanou.domain;

/**
 * Created by dllo on 17/11/8.
 */
public class Blog {
    private int id; //博客id
    private String title; //博客标题
    private String des;//博客描述
    private String content;//博客内容
    private String userId;

    public Blog() {
    }

    public Blog(String title, String des, String content) {
        this.title = title;
        this.des = des;
        this.content = content;
    }

    public Blog(String title, String des, String content, String userId) {

        this.title = title;
        this.des = des;
        this.content = content;
        this.userId = userId;
    }

    public Blog(int id, String title, String des, String content, String userId) {

        this.id = id;
        this.title = title;
        this.des = des;
        this.content = content;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", des='" + des + '\'' +
                ", content='" + content + '\'' +
                ", userId='" + userId + '\'' +
                '}';
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
