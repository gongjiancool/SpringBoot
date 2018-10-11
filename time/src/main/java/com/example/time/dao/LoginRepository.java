package com.example.time.dao;

import com.example.time.entity.SportUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LoginRepository extends JpaRepository<SportUser,Integer> {
//    @Query("from SportUser u where u.account = :account")
//    SportUser findUser(@Param("account") String account);


}
