package com.example.time.other;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestScheduledExecutorService {

    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        String  timeString = current.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        // 参数：1、任务体 2、首次执行的延时时间
        //      3、任务执行间隔 4、间隔时间单位
        service.scheduleAtFixedRate(()->System.out.println("task ScheduledExecutorService "+ timeString), 3, 1, TimeUnit.SECONDS);
    }
}
