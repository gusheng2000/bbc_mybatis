package com.itheima.test;

import com.itheima.dao.*;
import com.itheima.pojo.*;
import com.itheima.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author sc
 * @ClassName Test
 * @Description class function:
 * @Date 2022/11/22 16:44:59
 **/
public class Test {
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
    @org.junit.Test
    public void test1() {
        WorkerDao mapper = session.getMapper(WorkerDao.class);
        Worker worker = mapper.selectWorkerById(1);
        System.out.println(worker.toString());
    }


    //添加
    @org.junit.Test
    public void test2() {
        WorkerDao mapper = session.getMapper(WorkerDao.class);
        Worker w = new Worker();
        w.setAge(223);
        w.setName("石冲");
        w.setSex("男");
        w.setWorkerId(202201);
        int i = mapper.insertWorker(w);
        System.out.println("插入"+(i>0));
    }


    //更新
    @org.junit.Test
    public void test3() {
        WorkerDao mapper = session.getMapper(WorkerDao.class);
        Worker w = new Worker();
        w.setId(5);
        w.setAge(13);
        w.setName("李小龙");
        w.setSex("男");
        w.setWorkerId(202201);
        int i = mapper.updateWorker(w);
        System.out.println("更新"+(i>0));
    }


    //@Delete
    @org.junit.Test
    public void test4() {
        WorkerDao mapper = session.getMapper(WorkerDao.class);
        int i = mapper.deleteWorker(5);
        System.out.println("删除"+(i>0));
    }

    //@Param

    @org.junit.Test
    public void test5() {
        WorkerDao mapper = session.getMapper(WorkerDao.class);
        Worker work = mapper.selectWorkerByIdAndName(1, "张三");
        System.out.println(work.toString());
    }


    //一对一
    @org.junit.Test
    public void test6() {
        PersonDao mapper = session.getMapper(PersonDao.class);
        Person person = mapper.getById(1);
        System.out.println(person.toString());
    }

//    //一对多
//    @org.junit.Test
//    public void test10() {
//        OrdersDao mapper = session.getMapper(OrdersDao.class);
//        ArrayList<Orders> list = mapper.getAllByUserId(1);
//        System.out.println(list.toString());
//    }


    //一对多
    @org.junit.Test
    public void test7() {
        UserDao mapper = session.getMapper(UserDao.class);
        Users user = mapper.getByUserId(1);
        System.out.println(user.toString());
    }



    //多对多
    @org.junit.Test
    public void test9() {
        ProductDao mapper = session.getMapper(ProductDao.class);
        List<Product> products = mapper.findProductByUserId(1);
        System.out.println(products.toString());
    }



}
