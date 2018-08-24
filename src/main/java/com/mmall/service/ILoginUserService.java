package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

public interface ILoginUserService {

    ServerResponse<User> login(String username, String password);
}
