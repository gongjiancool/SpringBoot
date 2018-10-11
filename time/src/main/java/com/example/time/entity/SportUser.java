package com.example.time.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class SportUser {
    @GeneratedValue
    @Id
    private Integer id;
    private String account;
    private String password;
    private String avatar;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
    @JoinColumn(name = "sportUser_id")
    private List<Step> steps = new ArrayList<>();

    public SportUser() {
    }

    public SportUser(String account, String password, String avatar) {
        this.account = account;
        this.password = password;
        this.avatar = avatar;
    }


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
