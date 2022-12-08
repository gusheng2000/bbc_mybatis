package com.itheima.mapper;

import com.itheima.pojo.Employee;
import com.itheima.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeMapperTest {
    SqlSession session = null;
//    EmployeeMapper mapper = null;

    @Before
    public void setUp() throws Exception {
        session = MyBatisUtils.getSession();
//        mapper = session.getMapper(EmployeeMapper.class);
    }

    @After
    public void tearDown() throws Exception {
        session.commit();
        session.close();
    }

    //查询
    @Test
    public void findById() {
//        Employee employee = mapper.findById(8);
        Employee employee = session.selectOne("findById",1);
        System.out.println(employee);

    }

    //添加
    @Test
    public void addEmployee() {
        Employee employee = new Employee();
        employee.setName("石冲");
        employee.setAge(22);
        employee.setPOSITION("经理");
        int count = session.insert("addEmployee", employee);
//        int i = mapper.addEmployee(employee);
        System.out.println("添加成功"+count+"条记录");
    }


    //更新
    @Test
    public void updateEmployee() {
        Employee employee = new Employee();
        employee.setId(6);
        employee.setName("石冲");
        employee.setAge(22);
        employee.setPOSITION("员工");
        int flag = session.update("updateEmployee", employee);
        System.out.println("更新成功"+flag+"条记录");

    }

    //删除
    @Test
    public void deleteEmployee() {
        int i = session.delete("deleteEmployee",6);
        boolean a = i > 0;
        System.out.println("删除是否成功=====>>" + a);
    }
}