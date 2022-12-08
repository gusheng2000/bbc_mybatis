package com.itheima.mapper;

import com.itheima.pojo.Student;
import org.omg.PortableInterceptor.Interceptor;

import java.util.List;

public interface StudentMapper {
    List<Student> findStu(Student student);
    List<Student> findStuLeId(Integer id);


}
