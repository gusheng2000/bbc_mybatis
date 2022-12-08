package com.itheima.mapper;

import com.itheima.pojo.Employee;

public interface EmployeeMapper {

    Employee findById(int id);

    int addEmployee(Employee employee);

    int updateEmployee(Employee employee);

   int  deleteEmployee(int id);
}
