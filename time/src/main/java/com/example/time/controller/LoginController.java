package com.example.time.controller;

import com.example.time.dao.StepRepository;
import com.example.time.entity.SportUser;
import com.example.time.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping()
public class LoginController {
    @Resource
    private LoginService loginService;

    @Resource
    private StepRepository stepRepository;

    @RequestMapping(value = "/SportUser")
    public String show(HttpServletRequest request, ModelMap modelMap) {
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        SportUser sportUser = loginService.check(account,password);
        modelMap.addAttribute("sportUser",sportUser);
        modelMap.addAttribute("userStep",stepRepository.findUser(account));
        modelMap.addAttribute("steps",stepRepository.find());
        return "home";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}
