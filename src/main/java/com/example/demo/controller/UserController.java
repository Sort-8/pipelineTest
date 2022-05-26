package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: panghai
 * @Date: 2022/05/10/22:50
 * @Description: 用户api接口
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/getOneUser")
    public User getOnUser(@RequestParam("id") long id){
        return userService.getOneUser(id);
    }

    @GetMapping("/listUser")
    public List<User> listOnUser(User user){
        return userService.selectUserList(user);
    }
}
