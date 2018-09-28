package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.SysUser;

import java.util.List;
import java.util.ListResourceBundle;

/**
 * Created by HP on 2018/9/27.
 */
public interface SysUserService {
    List<SysUser> getAll();
    SysUser getId(int id);
   SysUser getName(String nickName);
    List<SysUser> getNumber(String n);
    List<SysUser> get(String nickName);

 }
