package com.example.springdatajpa.service;

import com.example.springdatajpa.dao.SysUserRepository;
import com.example.springdatajpa.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by HP on 2018/9/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServiceImplTest {
    @Resource
    private SysUserRepository sysUserRepository;
    @Test
    public void findAll() throws Exception {
        List<SysUser> sysUsers = sysUserRepository.findAll();
        System.out.println(sysUsers);
    }

    @Test
    public void getId() throws Exception {
        SysUser sysUser = sysUserRepository.findById(6).get();
        System.out.println(sysUser);
    }

    @Test
    public void getName() throws Exception {
        SysUser sysUser = sysUserRepository.findUser("简书");
        System.out.println(sysUser);
    }

    @Test
    public void getNumber() throws Exception {

    }

    @Test
    public void get() throws Exception {

    }

}