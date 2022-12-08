package com.itheima.pojo;

import java.util.List;

/**
 * @Author sc
 * @ClassName Order
 * @Description class function:
 * @Date 2022/11/15 16:56:17
 **/
public class Orders {
    private Integer id;
    private String number;
    private Integer user_id;
    private List<Product> productList; //

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", user_id=" + user_id +
                ", productList=" + productList +
                '}';
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
