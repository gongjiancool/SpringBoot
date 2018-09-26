package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.Information;
import com.example.springdatajpa.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by HP on 2018/9/20.
 */
public interface InformationRepository extends JpaRepository<Information,Integer> {
}
