package com.leospring.service.impl;

import com.leospring.dao.UserDao;
import com.leospring.model.UserModel;
import com.leospring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by leospring on 2018/12/3.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<UserModel> findAll() {
        return userDao.findAll();
    }

    public List<UserModel> findByAge(int age) {
        return userDao.findAllByAge(age);
    }

    @Transactional
    public UserModel save(UserModel userModel) {
        return userDao.save(userModel);
    }
}
