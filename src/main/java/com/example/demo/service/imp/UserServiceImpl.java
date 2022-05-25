package com.example.demo.service.imp;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: panghai
 * @Date: 2022/05/10/22:46
 * @Description: 用户业务实现类
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getOneUser(long id) {
        return userMapper.selectUserById(id);
    }
}
