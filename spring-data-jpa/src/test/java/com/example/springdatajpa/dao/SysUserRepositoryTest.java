package com.example.springdatajpa.dao;

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
public class SysUserRepositoryTest {
    @Resource
    private SysUserRepository sysUserRepository;

    @Test
    public void initData(){
        SysUser[] users = {
                new SysUser("学习","qwer@qq.com","11111",1023),
                new SysUser("简书","asdf@qq.com","22222",432),
                new SysUser("学习平台","qwsdfg@qq.com","33333",687),
                new SysUser("谷歌浏览器","reswq@qq.com","44444",999),
                new SysUser("微信","12345@qq.com","55555",578),
                new SysUser("数据库","123456@qq.com","66666",123),
                new SysUser("爱奇艺","5464332@qq.com","7777",342)
        };
        for (int i = 0 ; i < 6 ;i++){
            sysUserRepository.save(users[i]);
        }
    }

    @Test
    public void findByAccount() throws Exception{
        SysUser sysUser = sysUserRepository.findByNickName("学习");
        System.out.println(sysUser);
    }

    @Test
    public void findByFansAfter() throws Exception{
        List<SysUser> users = sysUserRepository.findByFansAfter(600);
        users.forEach(sysUser -> System.out.println(sysUser));
    }

    @Test
    public  void findByNickNameStaringWithAndFans()throws Exception{
        SysUser sysUser = sysUserRepository.findByNickNameStartingWithAndFansAfter("学习",700);
        System.out.println(sysUser);
    }

    @Test
    public void findByNickName() throws Exception{
        SysUser sysUser = sysUserRepository.findUser("学习平台");
        System.out.println(sysUser);
    }

    @Test
    public void findByLikeNickName() throws Exception{
        List<SysUser> users = sysUserRepository.findUsers("学习");
        users.forEach(sysUser -> System.out.println(sysUser));
    }
}