package com.itheima.dao;

import com.itheima.pojo.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductDao {

    @Select(" select * from tb_product where  id in\n" +
            "        ( select product_id from  tb_ordersitem where orders_id=#{id})")
    public List<Product> findProductByUserId(Integer id);
}
