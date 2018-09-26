package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.Information;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * Created by HP on 2018/9/20.
 */
public interface InformationService {
    List<Information> getAll();
    Information get(int id);
}
