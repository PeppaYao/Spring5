package com.bytedance.dao;

import com.bytedance.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao{
//我们所有的操作都使用sqlSession来执行，现在都是使用sqlSessionTemplate来执行。
    private SqlSessionTemplate sqlSession;
    //注入
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> getUserList() {
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        return mapper.getUserList();
    }

}
