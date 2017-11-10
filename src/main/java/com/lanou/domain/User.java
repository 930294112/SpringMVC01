package com.lanou.domain;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;

/**
 * Created by dllo on 17/11/8.
 */
public class User {
    private int id;

    @NotBlank(message ="用户名不能为空")
    private String username;
    @NotBlank(message ="密码不能为空")
    private String password;
    private String regpassword;

    private String tel;
    private String address;

    public User(String username, String password, String regpassword, String tel, String address) {
        this.username = username;
        this.password = password;
        this.regpassword = regpassword;
        this.tel = tel;
        this.address = address;
    }

    public User(String username, String password, String tel, String address) {
        this.username = username;
        this.password = password;
        this.tel = tel;
        this.address = address;
    }

    public String getTel() {

        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegpassword() {
        return regpassword;
    }

    public void setRegpassword(String regpassword) {
        this.regpassword = regpassword;
    }

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(int id, String usernaem, String password) {

        this.id = id;
        this.username = usernaem;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", regpassword='" + regpassword + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
