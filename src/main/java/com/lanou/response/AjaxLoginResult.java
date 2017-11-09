package com.lanou.response;

import com.lanou.domain.User;

/**
 * Created by dllo on 17/11/8.
 */
public class AjaxLoginResult {
    private int errorCode;//响应码
    private String message;//当返回错误时,给出的提示
    private User data;//用户对象

    public AjaxLoginResult() {
    }

    public AjaxLoginResult(String message, User date) {
        this.message = message;
        this.data = date;
    }

    public AjaxLoginResult(int errorCode, String message) {

        this.errorCode = errorCode;
        this.message = message;
    }


    public AjaxLoginResult(int errorCode, String message, User date) {

        this.errorCode = errorCode;
        this.message = message;
        this.data = date;
    }

    @Override
    public String toString() {
        return "AjaxLoginResult{" +
                "errorCode=" + errorCode +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }
}
