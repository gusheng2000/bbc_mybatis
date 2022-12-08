package com.itheima.mapper;

import com.itheima.pojo.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public interface CustomerMapper {

    List<Customer> findByNameAndJobs(Customer customer);

    List<Customer> findByNameAndJobsWithTrim(Customer customer);

    List<Customer> findByNameOrJobs(Customer customer);

    boolean updateBySet(Customer customer);

    List<Customer> findByArray(Integer[] ids);

    List<Customer> findByList(ArrayList<Integer> ids);

    List<Customer> findByMap(Map<String,Object> arrays);


}
