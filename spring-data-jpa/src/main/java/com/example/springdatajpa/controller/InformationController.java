package com.example.springdatajpa.controller;

import com.example.springdatajpa.service.InformationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by HP on 2018/9/20.
 */
@Controller
@RequestMapping(value = "/info")
public class InformationController {
    private static final String USER_LIST_PATH_NAME = "home";
    private static final String USER_DETAIL_PATH_NAME = "text";

    @Resource
    private InformationService informationService;

    @GetMapping(value = "/all")
    public String getInformationList(ModelMap map) {
        map.addAttribute("informationList",informationService.getAll());
        return USER_LIST_PATH_NAME;
    }

    @GetMapping(value = "/{id}")
    public String getBook(@PathVariable Integer id, ModelMap map) {
        map.addAttribute("info", informationService.get(id));
        return USER_DETAIL_PATH_NAME;
    }
}
