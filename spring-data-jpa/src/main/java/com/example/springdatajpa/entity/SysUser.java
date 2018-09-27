package com.example.springdatajpa.entity;

import io.swagger.models.auth.In;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by HP on 2018/9/27.
 */
@Entity
@Data
public class SysUser implements Serializable {
    @GeneratedValue
    @Id

    private Integer id;
    private String nickName;
    @Column
    private String account;

    @Column
    private String password;

    private Integer fans;

    public SysUser() {
    }

    public SysUser(String nickName, String account, String password, Integer fans) {
        this.nickName = nickName;
        this.account = account;
        this.password = password;
        this.fans = fans;
    }
}
