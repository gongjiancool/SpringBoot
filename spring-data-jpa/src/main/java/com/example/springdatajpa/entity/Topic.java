package com.example.springdatajpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 2018/9/27.
 */
@Entity
@Data
public class Topic {
    @GeneratedValue
    @Id
    private Integer id;
    private String name;
    private String avatar;
    private String introduce;
    private String fans;


    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
    @JoinColumn(name = "topic_id")
    private List<Article> articles = new ArrayList<>();


    public Topic() {
    }

    public Topic(String name, String avatar, String introduce, String fans, List<Article> articles) {
        this.name = name;
        this.avatar = avatar;
        this.introduce = introduce;
        this.fans = fans;
        this.articles = articles;
    }
}
