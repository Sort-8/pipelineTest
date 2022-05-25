package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: panghai
 * @Date: 2022/05/10/22:45
 * @Description: 用户Mapper接口
 */
@Mapper
public interface UserMapper {

    public User selectUserById(long id);
}
