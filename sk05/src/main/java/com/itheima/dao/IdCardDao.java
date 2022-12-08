package com.itheima.dao;

import com.itheima.pojo.IdCard;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface IdCardDao {

    @Select("select * from tb_idcard where id =#{id}")
    IdCard getById(@Param("id") Long id);
}
