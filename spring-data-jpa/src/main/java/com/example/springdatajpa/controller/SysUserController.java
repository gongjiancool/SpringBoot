package com.example.springdatajpa.controller;

import com.example.springdatajpa.entity.SysUser;
import com.example.springdatajpa.service.SysUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by HP on 2018/9/27.
 */
@RestController
@RequestMapping(value = "/sysUser")
public class SysUserController {
    @Resource
   private SysUserService sysUserService;

    @GetMapping("/all")
    public List<SysUser> getUsers(){
        return sysUserService.getAll();
    }

    @GetMapping("/{id}")
    public SysUser getIDUser(@PathVariable Integer id) {
        return sysUserService.getId(id);
    }

    @GetMapping("/nickName/{name}")
    public SysUser getSysUser(@PathVariable String name){
        return sysUserService.getName(name);
    }

    @GetMapping(value = "/like/{like}")
    public List<SysUser> sysUsers(@PathVariable String like){
        return sysUserService.get(like);
    }
}
