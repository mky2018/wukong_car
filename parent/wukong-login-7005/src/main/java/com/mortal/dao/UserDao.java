package com.mortal.dao;


import com.mortal.pojo.Username;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {

    Username findName(@Param("name") String name);
}
