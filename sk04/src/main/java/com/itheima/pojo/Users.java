package com.itheima.pojo;

import java.util.ArrayList;

/**
 * @Author sc
 * @ClassName User
 * @Description class function:
 * @Date 2022/11/15 16:55:05
 **/
public class Users {
    private Integer id;
    private String username;
    private String address;
    private ArrayList<Orders> ordersList;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", ordersList=" + ordersList +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(ArrayList<Orders> ordersList) {
        this.ordersList = ordersList;
    }
}
