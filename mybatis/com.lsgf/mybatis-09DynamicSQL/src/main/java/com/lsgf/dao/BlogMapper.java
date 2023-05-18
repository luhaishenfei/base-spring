package com.lsgf.dao;

import com.lsgf.pojo.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //插入数据
    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogChoose(Map map);

    List<Blog> queryBlogChooseWhen(Map map);

    int updateBlogSet( Map map);

    List<Blog> queryBlogTrim(Map map);

    List<Blog> queryBlogSql(Map map);

    //查询第1，2，3号记录的博客
    List<Blog> queryBlogForeach(Map map);


}
