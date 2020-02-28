package com.example.ssm_test01.mapper;

import com.example.ssm_test01.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PersonMapper {
     Person  findById(int id);
     void addPerson(Person person);
     void updatePersonById(Person person);
     void updatePersonById(int id);
     List queryAllPerson();
}
