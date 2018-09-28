package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by HP on 2018/9/27.
 */
public interface SysUserRepository extends JpaRepository<SysUser,Integer> {
    //根据用户名查找
    SysUser findByNickName (String nickName);

    //根据粉丝数查找
    List<SysUser> findByFansAfter(Integer fans);

    //根据用户名和数目查找
    SysUser findByNickNameStartingWithAndFansAfter(String nickname,Integer fans);

    @Query("from SysUser u where u.nickName = :nickName")
    SysUser findUser(@Param("nickName") String nickName);

    @Query("from SysUser u where u.nickName like :name order by u.fans desc")
    List<SysUser> findUsers(@Param("name") String name);

}
