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
}
