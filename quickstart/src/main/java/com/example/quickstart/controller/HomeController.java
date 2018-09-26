package com.example.quickstart.controller;

import com.example.quickstart.dao.InformationDAO;
import com.example.quickstart.dao.TopicDAO;
import com.example.quickstart.entity.Information;
import com.example.quickstart.entity.Topic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by HP on 2018/9/10.
 */
@Controller
public class HomeController {
    @Resource
    private InformationDAO informationDAO;
    @Resource
    private TopicDAO topicDAO;

    @GetMapping("home")
    public String getInformation(ModelMap map){
        List<Information> informationList = informationDAO.getInformation();
        map.addAttribute("informationList",informationList);

        List<Topic> topicList = topicDAO.getTopic();
        map.addAttribute("topicList",topicList);
        return "home";
    }
}
