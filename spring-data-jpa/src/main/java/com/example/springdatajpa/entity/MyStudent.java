package com.example.springdatajpa.entity;

import lombok.Data;

import javax.lang.model.element.NestingKind;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by HP on 2018/9/20.
 */
@Entity
@Data
public class MyStudent {
    @GeneratedValue
    @Id
    private Integer id;
    private String Name;
    private String Number;
}
