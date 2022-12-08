package com.itheima.mapper;

import com.itheima.pojo.User;
import junit.framework.TestCase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class UserMapperTest{
  private   SqlSession session=null;
    @Before
    public void setUp() throws Exception {

        String resources="mybatis-config.xml";
        //创建流
        InputStream stream=null;
        try{
            //读取mybatis-config.xml文件到reader对象中
            stream= Resources.getResourceAsStream(resources);
        }catch(IOException e){
            e.printStackTrace();
        }
        //初始化Mybatis数据库，创建SqlSessionFactory类的实例
        SqlSessionFactory sqlMapper=new SqlSessionFactoryBuilder().build(stream,"development");
        //创建SqlSessiom实例
         session =sqlMapper.openSession();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findById() {
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.findById(1);
        System.out.println("findById--------->"+user);
    }

    @Test
    public void findTotal() {
        UserMapper mapper = session.getMapper(UserMapper.class);
        int total= mapper.findTotal();
        System.out.println("findTotal---------."+total);
    }
}