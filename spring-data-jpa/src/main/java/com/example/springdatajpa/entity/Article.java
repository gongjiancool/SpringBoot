package com.example.springdatajpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by HP on 2018/9/27.
 */
@Entity
@Data
public class Article {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String content;
    private String number;

}
