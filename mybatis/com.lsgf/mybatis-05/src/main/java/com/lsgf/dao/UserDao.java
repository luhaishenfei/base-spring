package com.lsgf.dao;

import com.lsgf.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserDao {


    //使用注解查询全部用户    映射简单语句会是的代码显得更简洁，对于稍微复杂一点的语句，Java注解就力不从心了
    @Select("select * from dept")
    List<User> getUserList();

    //方法存在多个参数，所有参数前面加上@Param注解
    @Select("select * from dept where id =#{id} and dname =#{name}")
    List<User> getUserByIDAndName(@Param("id") int id,@Param("name") String name);

//    @Insert("insert into dept values(#{id},#{name},#{loc})")
//    int addUser(@Param("id") int id,@Param("name") String name,@Param("loc") String location);
// 引用版不需要加入 @Param注解
    @Insert("insert into dept(id,dname,loc) values(#{id},#{dname},#{loc})")
    int addUser(User user);

    /*  使用的基础类型  下面用 User引用类型实现功能
    @Update("update dept set id=#{id},dname=#{name},loc=#{loc} where id =#{targetid}")
    int UpdateUser(@Param("targetid")int targetid,@Param("id")int id,@Param("name") String name,@Param("loc") String location);

    @Delete("delete from dept where id =#{id} and dname = #{name} and loc =#{loc}")
    int DeleteUser(@Param("id")int id,@Param("name") String name,@Param("loc") String location);
     */
    @Update("update dept set dname=#{dname},loc=#{loc} where id =#{id}")
    int UpdateUser(User user);

    @Delete("delete from dept where id =#{id}")
    int DeleteUser(@Param("id")int id);

}
