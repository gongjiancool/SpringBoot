package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.MyUser;
import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by HP on 2018/9/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyUserServiceImplTest {
    @Resource
    private MyUserService myUserService;

    @Test
    public void save() throws Exception {
        String[] names = {"ee","ss","ww","kk","ll"};
        Random random = new Random();
        for (int i = 0 ; i < 5 ; i++){
            MyUser myUser = new MyUser();
            myUser.setName(names[i]);
            myUser.setIntroduce(String.valueOf(random.nextInt(30)));
            System.out.println( myUserService.save(myUser));
        }
    }

    @Test
    public void getAll() throws Exception {

    }

    @Test
    public void get() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

}