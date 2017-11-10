package com.lanou.service;

import com.lanou.domain.Blog;

import java.util.List;

/**
 * Created by dllo on 17/11/8.
 */
public interface BlogService {
    List<Blog> findAll();

    Blog findById(Integer id);

    int  addBlog(Blog blog);

    int deleteById(int id);

    List<Blog> search(String content);

    List<Blog> findByUserId(Integer userId);

    int updateblogById(Blog blog);
}
