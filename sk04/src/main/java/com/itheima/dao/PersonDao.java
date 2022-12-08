package com.itheima.dao;

import com.itheima.pojo.Person;

public interface PersonDao {
    Person findPersonById(Integer id);
    Person findPersonById2(Integer id);
}
