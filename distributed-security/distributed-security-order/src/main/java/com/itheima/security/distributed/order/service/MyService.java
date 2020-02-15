package com.itheima.security.distributed.order.service;
import com.itheima.security.distributed.dao.UserMapper;
import com.itheima.security.distributed.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
@Service
public class MyService {
    @Autowired
    public UserMapper userMapper;
    public User get(String username) {
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("username", username);
        User user = userMapper.selectOneByExample(example);
        System.out.println(user.toString());
        return user;
    }
}
