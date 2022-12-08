package Test;
import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class UserTest {
    @Test
    public void userFindByIdTest(){
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
        SqlSession session =sqlMapper.openSession();
        //传入参数查询，返回结果
        User user=session.selectOne("findById",1);
        //输出结果
        System.out.println(user);

        int count=session.selectOne("findTotal");
        //输出结果
        System.out.println(count);
        //关闭session
        //关闭session
        session.close();
    }
}
