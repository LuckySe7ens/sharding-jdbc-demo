package com.leospring.service;

import com.leospring.model.UserModel;

import java.util.List;

/**
 * Created by leospring on 2018/12/3.
 */
public interface UserService {

    List<UserModel> findAll();

    List<UserModel> findByAge(int age);

    UserModel save(UserModel userModel);
}
