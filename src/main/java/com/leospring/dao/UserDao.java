package com.leospring.dao;

import com.leospring.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by leospring on 2018/12/3.
 */
public interface UserDao extends JpaRepository<UserModel, String> {

    List<UserModel> findAllByAge(int age);
}
