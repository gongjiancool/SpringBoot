package com.example.springdatajpa.service;

import com.example.springdatajpa.dao.MyUserRepository;
import com.example.springdatajpa.entity.MyUser;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by HP on 2018/9/20.
 * 用@Service注解标注本类对象为service层的bean
 * 用@resource注解注入dao层bean，myUserRepository
 * 用@myUserRepository，用oop方式实现crud
 * 使用@Transactional 实现增删改。
 */
@Service
public class MyUserServiceImpl implements MyUserService {
    @Resource
    private MyUserRepository myUserRepository;

    @Override
    @Transactional
    public MyUser save(MyUser myUser) {
        return myUserRepository.save(myUser);
    }

    @Override
    public List<MyUser> getAll() {
        return myUserRepository.findAll();
    }

    @Override
    public MyUser get(int id) {
        return myUserRepository.findById(id).get();
    }

    @Override
    @Transactional
    public void delete(int id) {
        myUserRepository.deleteById(id);
    }
}
