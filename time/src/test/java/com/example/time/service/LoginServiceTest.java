package com.example.time.service;

import com.example.time.dao.StepRepository;
import com.example.time.entity.SportUser;
import com.example.time.entity.Step;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServiceTest {
    @Resource
    private LoginService loginService;

    @Resource
    private StepRepository stepRepository;

    @Test
    public void get() {
        List<SportUser> sportUsers = loginService.get("1357","1357");
        System.out.println(sportUsers);
    }

    @Test
    public void check() {
        SportUser sportUser = loginService.check("13579","13579");
        System.out.println(sportUser);
    }

    @Test
    public void getAll() {
        List<Step> steps = stepRepository.findAll();
       steps.forEach(step -> System.out.println(step));


    }
}