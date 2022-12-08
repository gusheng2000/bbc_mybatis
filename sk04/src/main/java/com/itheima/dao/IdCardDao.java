package com.itheima.dao;

import com.itheima.pojo.IdCard;
import com.itheima.pojo.Person;
import org.apache.ibatis.annotations.Insert;

public interface IdCardDao {
    IdCard findCodeById(Integer id);


    @Insert("insert into tb_idcard")
    int insertCard(IdCard idCard);
}
