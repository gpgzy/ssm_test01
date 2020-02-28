package com.example.ssm_test01.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class GetSession {
    public static SqlSession getSqlSession(){
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
        return session;
    }
}
