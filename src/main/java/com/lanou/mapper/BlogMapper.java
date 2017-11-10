package com.lanou.mapper;

import com.lanou.domain.Blog;

import java.util.List;

/**
 * Created by dllo on 17/11/8.
 */
public interface BlogMapper {
    /**
     * 查询所有博客
     * @return
     */
    List<Blog> findAll();

    List<Blog>findByUserId(Integer userId);

    /**
     * 根据博客id找到博客
     * @param id
     * @return
     */
    Blog findById(Integer id);

    int addBlog(Blog blog);

    int deleteById(int id);

    List<Blog> search(String content);

    int updateblogById(Blog blog);
}
