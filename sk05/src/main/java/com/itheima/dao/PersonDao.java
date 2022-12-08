package com.itheima.dao;

import com.itheima.pojo.Person;
import org.apache.ibatis.annotations.*;

public interface PersonDao {
    //一对一

    @Select("select * from tb_person where id =#{id}")
    @Results({@Result
            (column = "card_id",property = "card", one=@One(select = "com.itheima.dao.IdCardDao.getById"))
                })
    Person getById(@Param("id") Integer id);
}
