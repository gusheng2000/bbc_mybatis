package com.itheima.dao;

import com.itheima.pojo.Users;
import org.apache.ibatis.annotations.*;

public interface UserDao {

//多对多
    @Select("select * from tb_user where id= #{id}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "address",property = "address"),
            @Result(column = "username",property = "username"),
            @Result(column = "id",property = "ordersList",
            many=@Many(select = "com.itheima.dao.OrdersDao.getAllByUserId"))
    })
    Users  getByUserId(Integer id);
}
