package com.mmall.service.impl;

import com.mmall.common.ServerResponse;
import com.mmall.dao.UserMapper;
import com.mmall.pojo.User;
import com.mmall.service.ILoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ILoginUserServiceImpl implements ILoginUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ServerResponse<User> login(String username, String password) {
        int resultCount=userMapper.chechUserName(username);
        if(resultCount==0){
            return  ServerResponse.createByErrorMessgae("loginName miss");
        }

        //todo password md5

        User user=userMapper.selectLogin( username, password);
        if(user==null){
            return  ServerResponse.createByErrorMessgae("password miss");
        }
        return ServerResponse.createBySuccess("login sucess",user);
    }
}
