package com.example.time.dao;

import com.example.time.entity.Step;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

public class StepRepositoryTest {
    @Resource
    private StepRepository stepRepository;

    @Test
    public void find() {
        List<Step> steps = stepRepository.find();
        steps.forEach(step -> System.out.println(step));
    }

    @Test
    public void findUser() {
    }
}