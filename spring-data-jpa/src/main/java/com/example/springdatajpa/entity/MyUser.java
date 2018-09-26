package com.example.springdatajpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by HP on 2018/9/20.
 * 用@entity注解标注本类是一个可持久化类
 * 用@id注解指定主键
 * 用GeneratorValue注解标注主键的策略，mysql为自增
 * 用@data注解简化get、set
 */
@Entity
@Data
public class MyUser {
    @GeneratedValue
    @Id
    private Integer id;
    private String name;
    private String writer;
    private String introduce;
}
