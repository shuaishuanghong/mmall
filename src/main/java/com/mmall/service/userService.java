package com.mmall.service;

import com.mmall.dao.UserMapper;
import com.mmall.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class userService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    public String  check(){
       User user =userMapper.selectByPrimaryKey(1);
       return  user.getUsername();
    }
}
