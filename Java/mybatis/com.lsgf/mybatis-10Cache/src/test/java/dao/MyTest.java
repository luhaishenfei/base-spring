package dao;
import com.lsgf.dao.BlogMapper;
import com.lsgf.pojo.Blog;
import com.lsgf.utils.IDutils;
import com.lsgf.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class MyTest {

    @Test
    public void cacheTest(){
        /*缓存失效的情况
        1.查询不同的东西
        2.增删改操作，可能会改变原来的数据，所以必定会刷新缓存
        3.查询不同的Mapper.xml
        4.手动清理缓存 sqlSession.clearCache();
        //一级缓存相当于一个Map

*/
/*
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
//        Blog blog = mapper.getBlogByID(1);
//        System.out.println(blog);
//        System.out.println("===========");
//
//        sqlSession.close();
//
//        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
//        BlogMapper mapper2 = sqlSession2.getMapper(BlogMapper.class);
//
//        Blog blog2 = mapper2.getBlogByID(1);
//        System.out.println(blog2);
//
//        System.out.println(blog==blog2);
//================================================

 */
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
//        Blog blog = mapper.getBlogByID(1);
//        System.out.println(blog);
//        sqlSession.clearCache();
//        System.out.println("===========");
//
//        Blog blog2 = mapper.getBlogByID(1);
//        System.out.println(blog2);
//
//        System.out.println(blog==blog2);ehcache
//
//        sqlSession.close();
        //================================

        //开启二级缓存
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        BlogMapper mapper2 = sqlSession2.getMapper(BlogMapper.class);

        Blog blog = mapper.getBlogByID(1);
        System.out.println(blog);
//        sqlSession.close()后 sqlSession将其一级缓存 提交至对应Mapper的二级缓存内，这就是为啥close放到下面 两个blog对象不相等
        sqlSession.close();

        System.out.println("===========");

        Blog blog2 = mapper2.getBlogByID(1);
        System.out.println(blog2);

        System.out.println(blog==blog2);

        //此时关闭则 blog ==blog2 为false
//        sqlSession.close();

        sqlSession2.close();
    }



    @Test
    public void addBlogTest() {


        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Java");
        mapper.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Spring");
        mapper.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("微服务");
        mapper.addBlog(blog);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void queryBlogIFTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map map=new HashMap<String,Object>();
        map.put("title","Mybatis");
//        map.put("author","夏清宇");
//        map.put("views",9999);

//        List<Blog> blogList=mapper.queryBlogIF(map);
//        List<Blog> blogList=mapper.queryBlogChoose(map);
//        List<Blog> blogList=mapper.queryBlogChooseWhen(map);
//        List<Blog> blogList=mapper.queryBlogTrim(map);
        List<Blog> blogList=mapper.queryBlogSql(map);

        for(Blog blog :
                blogList) {
            System.out.println(blog.toString());
        }

        sqlSession.close();
    }

    @Test
    public void updateBlogSetTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map map=new HashMap<String,Object>();
        map.put("title","Mybatis");
        map.put("author","梅光耀");
        map.put("views",7777);
        map.put("targetTitle","Mybatis");

        int res =mapper.updateBlogSet(map);
       if (res>0){
           System.out.println("更新成功");
           sqlSession.commit();
       }

        sqlSession.close();
    }
    @Test
    public void queryBlogForeachTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map map=new HashMap<String,Object>();
        List ids =new  ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        map.put("ids",ids);

        List<Blog> blogList=mapper.queryBlogForeach(map);

        for(Blog blog :
                blogList) {
            System.out.println(blog.toString());
        }

        sqlSession.close();
    }

}

