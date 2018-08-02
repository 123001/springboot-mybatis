package com.example.demo.mapper;

import com.example.demo.vo.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select username from user where id=#{id}")
    public User getUser(Integer id);
}
