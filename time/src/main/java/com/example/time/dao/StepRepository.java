package com.example.time.dao;

import com.example.time.entity.SportUser;
import com.example.time.entity.Step;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StepRepository extends JpaRepository<Step,Integer> {

    @Query("FROM Step a WHERE DATEDIFF(a.date,NOW())=0 ORDER BY a.number DESC")
    List<Step> find();


    @Query("from Step u WHERE DATEDIFF(u.date,NOW())=0 and u.account = :account")
    Step findUser(@Param("account") String account);

}
