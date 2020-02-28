package com.example.ssm_test01.entity;

import com.example.ssm_test01.mapper.PersonMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.Reader;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            //加载配置文件
            reader = Resources.getResourceAsReader("generatorConfig.xml");

        }
        catch (Exception e){
            System.out.println("123");
        }
        //SqlSessionFactory - connection建立连接
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();
        String statement = "com.example.ssm_test01.entity.PersonMapper.queryAllPerson";
        PersonMapper personMapper = session.getMapper(PersonMapper.class);
        Person person = personMapper.findById(123);
        System.out.println(person.toString());
        List<Person> list = personMapper.queryAllPerson();
        for(Person list1:list){
            System.out.println(list1.toString());
        }
        session.close();
    }
}
