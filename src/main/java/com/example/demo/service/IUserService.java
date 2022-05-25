package com.example.demo.service;

import com.example.demo.entity.User;

/**
 * @Author: panghai
 * @Date: 2022/05/10/22:46
 * @Description: 用户业务类
 */

public interface IUserService {

    public User getOneUser(long id);
}
