package com.lanou.mapper;

import com.lanou.domain.User;

/**
 * Created by dllo on 17/11/8.
 */
public interface UserMapper {
    /**
     * 根据用户名获取用户对象
     * @param name 要查询的用户名
     * @return
     */
    User findByName(String name);

    int addUser(User user);


}
