package com.itheima.mapper;

import com.itheima.pojo.Student;
import com.itheima.utils.MyBatisUtils;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StudentMapperTest{
    private SqlSession session=null;
    @Before
    public void setUp() throws Exception {
         session = MyBatisUtils.getSession();

    }

    @After
    public void tearDown() throws Exception {
        session.close();
    }

    @Test
    public void findAllStudent() {
        SqlSession session = MyBatisUtils.getSession();
        List<Student> allStudent = session.getMapper(StudentMapper.class).findAllStudent();
        for (Student student : allStudent) {
            System.out.println(student);
        }

    }
}