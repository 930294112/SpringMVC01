package com.lanou.service.impl;

import com.lanou.domain.User;
import com.lanou.mapper.UserMapper;
import com.lanou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by dllo on 17/11/8.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    /*持有的dao层对象*/
    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    public User findByName(String name) {
      return   userMapper.findByName(name);
    }
}
