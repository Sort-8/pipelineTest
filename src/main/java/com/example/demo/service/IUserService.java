package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
 * @Author: panghai
 * @Date: 2022/05/10/22:46
 * @Description: 用户业务类
 */

public interface IUserService {

    public User getOneUser(long id);

    /**
     * 获取所有用户
     * @param user 用户
     * @return 用户列表
     */
    public List<User> selectUserList(User user);
}
