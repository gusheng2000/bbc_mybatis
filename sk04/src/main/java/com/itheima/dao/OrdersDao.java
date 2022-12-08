package com.itheima.dao;

import com.itheima.pojo.Orders;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author sc
 * @ClassName OrdersDao
 * @Description class function:
 * @Date 2022/11/15 17:05:20
 **/
public interface OrdersDao {
    public ArrayList<Orders> getAllByUserId(Integer id);
    public Orders findOrderWithProduct(Integer OrdersId);
    public Orders findOrderWithProduct2(Integer OrdersId);
}
