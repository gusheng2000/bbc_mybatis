package com.itheima.dao;

import com.itheima.pojo.Product;

import java.util.List;

public interface ProductDao {
    public List<Product> findProductById(Integer id);
}
