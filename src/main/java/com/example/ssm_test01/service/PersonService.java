package com.example.ssm_test01.service;

import com.example.ssm_test01.entity.Person;
import com.example.ssm_test01.utils.GetSession;
import org.apache.ibatis.session.SqlSession;
import java.util.List;

public class PersonService {
    public Person selectPersonById(int id){
        SqlSession session = GetSession.getSqlSession();
        String statement = "com.example.ssm_test01.mapper.PersonMapper.findById";
        Person person = session.selectOne(statement,id);
        return person;
    }
    public void addPerson(Person person){
        SqlSession session = GetSession.getSqlSession();
        String statement = "com.example.ssm_test01.mapper.PersonMapper.addPerson";
        int count = session.insert(statement,person);
        session.commit();
        session.close();
        System.out.println("插入person数"+count);
    }
    public void updatePerson(Person person){
        SqlSession session = GetSession.getSqlSession();
        String statement = "com.example.ssm_test01.mapper.PersonMapper.updatePersonById";
        int count = session.update(statement,person);
        session.commit();
        session.close();
        System.out.println("修改学生数"+count);
    }
    public void deletePersonById(int id){
        SqlSession session = GetSession.getSqlSession();
        String statement = "com.example.ssm_test01.mapper.PersonMapper.deletePersonById";
        int count =session.delete(statement,id);
        session.commit();
        session.close();
        if (count == 0)
        {
            System.out.println("不存在这个学生");
        }
        else
        {
            System.out.println("删除学生数"+count);
        }
    }
    public List selectAllPerson(){
        SqlSession session = GetSession.getSqlSession();
        String statement = "com.example.ssm_test01.entity.PersonMapper.queryAllPerson";
        List<Person> list = session.selectList(statement);
        return list;
    }
}
