package com.leospring.controller;

import com.leospring.model.UserModel;
import com.leospring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by leospring on 2018/12/3.
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("getAll")
    public List<UserModel> getUser(){
        return userService.findAll();
    }

    @ResponseBody
    @RequestMapping("getByAge")
    public List<UserModel> findByAge(int age){
        return userService.findByAge(age);
    }

    @RequestMapping("save")
    public UserModel save(String name,int age){
        return userService.save(new UserModel(name,age));
    }
}
