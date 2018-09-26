package com.example.springdatajpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by HP on 2018/9/20.
 */
@Entity
@Data
public class Information {
    @GeneratedValue
    @Id
    private Integer id;
    private String avatar;
    private String name;
    private String introduce;
    private String kind;
    private String url;
}
