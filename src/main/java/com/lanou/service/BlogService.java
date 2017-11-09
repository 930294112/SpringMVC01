package com.lanou.service;

import com.lanou.domain.Blog;

import java.util.List;

/**
 * Created by dllo on 17/11/8.
 */
public interface BlogService {
    List<Blog> findAll();

    Blog findById(Integer id);
}
