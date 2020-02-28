package com.example.ssm_test01.entity;

import com.example.ssm_test01.service.PersonService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
//        HashMap<Integer,String> map = new HashMap<>();
//        map.put(1,"第一题");
//        map.put(2,"第二题");
//        map.put(3,"第三题");
//        map.put(2,"第二题");
//        for (String value:map.values()){
//            System.out.println(value);
//            System.out.println(map.size());
//        }
        PersonService personService = new PersonService();
        System.out.println(personService.selectPersonById(121).toString());
        //personService.addPerson(new Person("hello",12,236));
        //personService.updatePerson(new Person("hello",12,23) );
        personService.deletePersonById(22222);
        List<Person> list = personService.selectAllPerson();
        for(Person list1:list){
            System.out.println(list1.toString());
        }
    }
}
