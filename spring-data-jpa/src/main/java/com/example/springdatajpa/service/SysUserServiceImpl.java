package com.example.springdatajpa.service;

import com.example.springdatajpa.dao.SysUserRepository;
import com.example.springdatajpa.entity.SysUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by HP on 2018/9/27.
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserRepository sysUserRepository;

    @Override
    public List<SysUser> getAll() {
        return sysUserRepository.findAll();
    }

    @Override
    public SysUser getId(int id) {
        return sysUserRepository.findById(id).get();
    }

    @Override
    public SysUser getName(String nickName) {
        return sysUserRepository.findUser(nickName);
    }

    @Override
    public List<SysUser> getNumber(String n) {
        return null;
    }

    @Override
    public List<SysUser> get(String nickName) {
        return sysUserRepository.findUsers(nickName);
    }
}
