package com.itheima.dao;

import com.itheima.pojo.Worker;
import org.apache.ibatis.annotations.*;

public interface WorkerDao {

    @Select("select * from tb_worker where id=#{id}")
    Worker selectWorkerById(Integer id);

    @Insert("INSERT into  tb_worker (name,age,sex,worker_id) VALUES(#{name},#{age},#{sex},#{workerId})")
    int insertWorker(Worker worker);

    @Update("update tb_worker set name=#{name},age=#{age},sex=#{sex},worker_id=#{workerId} where id=#{id}")
    int updateWorker(Worker worker);

    @Delete("delete from tb_worker where id =#{id} ")
    int deleteWorker(int id);

    @Select("select * from tb_worker where id=#{id} and name= #{name}")
    Worker selectWorkerByIdAndName(@Param("id") Integer id,@Param("name") String name);



}
