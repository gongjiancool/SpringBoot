package com.example.time.service;

import com.example.time.dao.LoginRepository;
import com.example.time.dao.StepRepository;
import com.example.time.entity.SportUser;
import com.example.time.entity.Step;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginRepository loginRepository;

    @Resource
    private StepRepository stepRepository;


    @Override
    public List<SportUser> get(String account, String password) {
        return loginRepository.findAll();
    }

    @Override
    public SportUser check(String account, String password) {
        List<SportUser> users = loginRepository.findAll();
        SportUser user = new SportUser();
        for (int i=0;i<users.size();i++){
            String name = users.get(i).getAccount();
            String pass = users.get(i).getPassword();
            if (name.equals(account)){
                if (pass.equals(password)){
                    user = users.get(i);
                }
            }
        }
        return user;
    }

    @Override
    public List<Step> getAll() {
        return stepRepository.findAll();
    }

}
