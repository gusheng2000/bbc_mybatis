package com.itheima;

import com.itheima.dao.IdCardDao;
import com.itheima.dao.OrdersDao;
import com.itheima.dao.PersonDao;
import com.itheima.dao.UserDao;
import com.itheima.pojo.IdCard;
import com.itheima.pojo.Orders;
import com.itheima.pojo.Person;
import com.itheima.pojo.Users;
import com.itheima.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author sc
 * @ClassName DaoTest
 * @Description class function:
 * @Date 2022/11/7 11:00:55
 **/

public class DaoTest {

    SqlSession session = null;
    SqlSession session2 = null;
//    EmployeeMapper mapper = null;

    @Before
    public void setUp() throws Exception {
        session = MyBatisUtils.getSession();
        session2 = MyBatisUtils.getSession();
//        mapper = session.getMapper(EmployeeMapper.class);
    }

    @After
    public void tearDown() throws Exception {
        session.commit();
//        session.close();
    }


    // 一对一 嵌套查询方式
    @Test
    public void  test1(){
        PersonDao mapper = session.getMapper(PersonDao.class);
        Person person = mapper.findPersonById(1);
        System.out.println(person.toString());
    }

    // 一对一 嵌套结果查询方式
    @Test
    public void  test2(){
        PersonDao mapper = session.getMapper(PersonDao.class);
        Person person = mapper.findPersonById2(1);
        System.out.println(person.toString());
    }
    //一对多   嵌套查询方式
    @Test
    public void  test3(){
        UserDao mapper= session.getMapper(UserDao.class);
        Users user = mapper.getUserByUserId2(1);
        user.getOrdersList().forEach(o -> System.out.println(o.toString()));
    }


    //一对多   嵌套结果查询方式
    @Test
    public void  test4(){
        UserDao mapper= session.getMapper(UserDao.class);
        Users user = mapper.getUserByUserId1(1);
        user.getOrdersList().forEach(o -> System.out.println(o.toString()));
    }


    //多对多   嵌套查询方式
    @Test
    public void  test5(){
        OrdersDao mapper= session.getMapper(OrdersDao.class);
       Orders order = mapper.findOrderWithProduct(1);
        System.out.println(order.toString());
    }

    //多对多   嵌套结果查询方式
    @Test
    public void  test6(){
        OrdersDao mapper= session.getMapper(OrdersDao.class);
        Orders order = mapper.findOrderWithProduct2(1);
        System.out.println(order.toString());
    }

    //一级缓存
    @Test
    public void  test7(){
        IdCardDao mapper= session.getMapper(IdCardDao.class);
        IdCard idCard = mapper.findCodeById(1);
        System.out.println(idCard.toString());

        IdCardDao mapper1= session.getMapper(IdCardDao.class);
        IdCard idCard1 = mapper.findCodeById(1);
        System.out.println(idCard1.toString());
        System.out.println(mapper.findCodeById(1));
    }

    //二级缓存
    @Test
    public void  test8(){
        IdCardDao mapper= session.getMapper(IdCardDao.class);
        IdCardDao mapper1= session2.getMapper(IdCardDao.class);

        IdCard idCard = mapper.findCodeById(1);
        IdCard idCard1 = mapper1.findCodeById(1);

        System.out.println(idCard.toString());
        System.out.println(idCard1.toString());
//        System.out.println(mapper.findCodeById(1));
    }


}
