package com.itheima;

import com.itheima.mapper.StudentMapper;
import com.itheima.pojo.Student;
import com.itheima.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @Author sc
 * @ClassName StuManegerTest
 * @Description class function:
 * @Date 2022/11/1 16:40:10
 **/

public class StuManagerTest {
    SqlSession session = null;
    StudentMapper mapper = null;

    @Before
    public void setUp() throws Exception {
        session = MyBatisUtils.getSession();
        mapper = session.getMapper(StudentMapper.class);
    }

    @After
    public void tearDown() throws Exception {
        session.commit();
        session.close();
    }

    @Test
    public void test1(){
        Student student = new Student();
        student.setName("石冲");
        List<Student> stu = mapper.findStu(student);
        for (Student s : stu) {
            System.out.println(s.toString());
        }
    }


    @Test
    public void test2(){
        Student student = new Student();
        student.setMajor("网络工程");
        List<Student> stu = mapper.findStu(student);
        for (Student s : stu) {
            System.out.println(s.toString());
        }
    }
    @Test
    public void test3(){
        Student student = new Student();
        List<Student> stu = mapper.findStu(student);
        for (Student s : stu) {
            System.out.println(s.toString());
        }
    }


    @Test
    public void test4(){
        Student student = new Student();
        List<Student> stu = mapper.findStuLeId(5);
        for (Student s : stu) {
            System.out.println(s.toString());
        }
    }
}
