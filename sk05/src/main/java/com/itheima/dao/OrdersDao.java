package com.itheima.dao;

import com.itheima.pojo.Orders;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
 * @Author sc
 * @ClassName OrdersDao
 * @Description class function:
 * @Date 2022/11/15 17:05:20
 **/
public interface OrdersDao {

    @Select("select * from tb_orders where user_id = #{id}")
    @Results({
            @Result(id=true, column = "id",property = "id"),
            @Result( column = "user_id",property = "user_id"),
            @Result(column = "number",property = "number")
    })
    public ArrayList<Orders> getAllByUserId(Integer id);

    @Select("select * from tb_orders where user_id = #{id}")
    @Results({
            @Result(id=true, column = "id",property = "id"),
            @Result(column = "number",property = "number"),
            @Result(column = "id",property = "number"),

    })
    public ArrayList<Orders> selectOrderById(Integer id);



    public Orders findOrderWithProduct(Integer OrdersId);
    public Orders findOrderWithProduct2(Integer OrdersId);
}
