package com.example.quickstart.dao;

import com.example.quickstart.entity.Topic;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * Created by HP on 2018/9/10.
 */
@Configuration
@Data
public class TopicDAO {
    public List<Topic> getTopic(){
        Topic[] topics = {
                new Topic("img/right-1.jpg","跑步好搭档","www.baidu.com"),
                new Topic("img/right-2.jpg","护眼的小技巧","www.baidu.com"),
                new Topic("img/right-3.png","居家生活指南","www.baidu.com"),
                new Topic("img/right-5.png","PPT使用技巧","www.baidu.com")
        };
        List<Topic> topicList = Arrays.asList(topics);
        return  topicList;
    }
}
