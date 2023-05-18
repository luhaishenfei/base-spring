package com.lsgf.mapper;

import com.lsgf.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    //我们的所有的操作都原来使用sqlSession来执行，现在都使用sqlSessionTemplate
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> selectUser() {
//        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
//        return mapper.selectUser();

        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);

        mapper.addUser(new User(4,"王磊","2wsx@WSX"));
        mapper.deleteUser(4);

        return mapper.selectUser();
    }

    @Override
    public int addUser(User user) {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.deleteUser(id);
    }

}
