package com.example.time.service;

import com.example.time.dao.StepRepository;
import com.example.time.entity.Step;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Slf4j
@Component
public class SportJob  {
    @Resource
    private StepRepository stepRepository;
    @Scheduled(cron = "40 14 2 * * ?")
    public void execute() throws Exception{
        Date date = new Date();
        Step[] steps = {
                new Step("13579",date,"8475"),
                new Step("24680",date,"1247"),
                new Step("12345",date,"2541"),
                new Step("9999",date,"9647"),
                new Step("98765",date,"6241"),
        };
        for (int i = 0 ; i < 5 ;i++){
            stepRepository.save(steps[i]);
        }
    }
}
