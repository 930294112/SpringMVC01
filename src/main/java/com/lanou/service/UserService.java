package com.lanou.service;

import com.lanou.domain.User;

/**
 * Created by dllo on 17/11/8.
 */
public interface UserService {
    /**
     * 根据名字返回对象
     * @param name 要查询的名字
     * @return
     */
    User findByName(String name);

    int addUser(User user);
}
