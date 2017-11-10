package com.lanou.service.impl;

import com.lanou.domain.Blog;
import com.lanou.mapper.BlogMapper;
import com.lanou.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dllo on 17/11/8.
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService {

    @Autowired
    @Qualifier("blogMapper")
    private BlogMapper blogMapper;


    public List<Blog> findAll() {
        return blogMapper.findAll();
    }

    public Blog findById(Integer id) {
        return blogMapper.findById(id);
    }

    public int addBlog(Blog blog) {
       return blogMapper.addBlog(blog);
    }

    public int  deleteById(int id) {
        return blogMapper.deleteById(id);
    }

    public List<Blog> search(String content) {
        return blogMapper.search(content);
    }

    public List<Blog> findByUserId(Integer userId) {
        return blogMapper.findByUserId(userId);
    }

    public int updateblogById(Blog blog) {
        return blogMapper.updateblogById(blog);
    }
}
