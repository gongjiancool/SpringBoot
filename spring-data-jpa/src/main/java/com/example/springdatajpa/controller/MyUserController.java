package com.example.springdatajpa.controller;

import com.example.springdatajpa.entity.MyUser;
import com.example.springdatajpa.service.MyUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by HP on 2018/9/20.
 */
@Controller
@RequestMapping(value = "/user")
public class MyUserController {
    private static final String USER_DETAIL_PATH_NAME = "userDetail";
    private static final String USER_LIST_PATH_NAME = "userList";

    @Resource
    private MyUserService myUserService;

    @GetMapping()
    public String getBookList(ModelMap map) {
        map.addAttribute("userList",myUserService.getAll());
        return USER_LIST_PATH_NAME;
    }

    @GetMapping(value = "/{id}")
    public String getUser(@PathVariable Integer id) {
        myUserService.get(id);
        return USER_DETAIL_PATH_NAME;
    }
}
