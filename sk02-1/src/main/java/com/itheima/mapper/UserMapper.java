package com.itheima.mapper;

import com.itheima.pojo.User;

public interface UserMapper {


    public User findById(int id);


    public int findTotal();

}
