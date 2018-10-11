package com.example.time.service;

import com.example.time.entity.SportUser;
import com.example.time.entity.Step;

import java.util.List;

public interface LoginService {
    List<SportUser> get (String account, String password);

    SportUser check(String account,String password);


    List<Step> getAll();
}
