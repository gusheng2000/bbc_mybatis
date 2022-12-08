package com.itheima;

import com.itheima.mapper.CustomerMapper;
import com.itheima.pojo.Customer;
import com.itheima.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MybatisTest {

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

    @Test
    public void testIf(){
        CustomerMapper mapper = session.getMapper(CustomerMapper.class);
        Customer customer = new Customer();
        customer.setUserName("jack");
        customer.setJobs("worker");
        List<Customer> customers = mapper.findByNameAndJobs(customer);
            for (Customer c :customers){
                System.out.println(c.toString());
            }
    }

    @Test
    public void testChooseWhen(){
        CustomerMapper mapper = session.getMapper(CustomerMapper.class);
        Customer customer = new Customer();
        customer.setUserName("jack");
        customer.setJobs("worker");
        customer.setPhone("10086521");
        List<Customer> customers = mapper.findByNameAndJobsWithTrim(customer);
        for (Customer c :customers){
            System.out.println(c.toString());
        }
    }

    @Test
    public void testUpdateBySet(){
        Customer c = new Customer();
        c.setId(1);
        c.setUserName("sc");
        c.setPhone("15856215010");
        c.setJobs("student");

        CustomerMapper mapper = session.getMapper(CustomerMapper.class);
        boolean isUpdateOk = mapper.updateBySet(c);
        System.out.println(isUpdateOk);
    }


    @Test
    public void testFindByArrays(){
        Integer[] roleIds={2,3};

        CustomerMapper mapper = session.getMapper(CustomerMapper.class);
        List<Customer> array = mapper.findByArray(roleIds);
        array.forEach(v->{
            System.out.println(v.toString());
        });
    }

    @Test
    public void testFindByList(){
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(3);
        ids.add(2);
        ids.add(1);

        CustomerMapper mapper = session.getMapper(CustomerMapper.class);
        List<Customer> array = mapper.findByList(ids);
        array.forEach(v->{
            System.out.println(v.getId());
        });
    }


    @Test
    public void testFindByMap(){
        HashMap<String, Object> map = new HashMap<>();
        ArrayList<Integer> id = new ArrayList<>();
        id.add(1);
        id.add(2);
        id.add(3);

        map.put("ikkd",id);
        map.put("job","teach");

//        System.out.println(map.get("id").toString());
        CustomerMapper mapper = session.getMapper(CustomerMapper.class);
        List<Customer> array = mapper.findByMap(map);
        array.forEach(v->{
            System.out.println(v);
        });
    }
}
