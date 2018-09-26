package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.MyUser;

import java.util.List;

/**
 * Created by HP on 2018/9/20.
 */
public interface MyUserService {

    MyUser save(MyUser myUser);

    /**
     * 获取所有对象
     * @return
     */
    List<MyUser> getAll();
    MyUser get(int id);
    void delete(int id);
}
