package com.example.quickstart.entity;

import lombok.Data;

/**
 * Created by HP on 2018/9/10.
 */
@Data
public class Topic {
    private String picture;
    private String name;
    private String url;

    public Topic() {
    }

    public Topic(String picture, String name, String url) {
        this.picture = picture;
        this.name = name;
        this.url = url;
    }
}
