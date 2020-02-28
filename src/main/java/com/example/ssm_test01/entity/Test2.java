package com.example.ssm_test01.entity;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test2 {
    public static void main(String[] args) {
        //LinkedList<Person> linkedList = new LinkedList<>();
//        ArrayList<Person> linkedList = new ArrayList<>();
//         long  sum=0;
//        for (int i=0;i<10000;i++)
//        {
//            Person person = new Person("gzy",i,i);
//            linkedList.add(person);
//            sum+=person.getAge();
//        }
//        System.out.println(sum);
//        for (Person person:linkedList
//             ) {
//            if (person.getAge()==9998)
//            {
//                System.out.println(person.toString());
//            }
//        }
        Paper paper = new Paper();
        LinkedList<SingleSelectProblem> linkedList = new LinkedList();
        linkedList.add(new SingleSelectProblem(12,"世界上最好的语言？","java","php","c++","a"));
        linkedList.add(new SingleSelectProblem(12,"世界上最好的语言？","java","php","c++","a"));
        paper.setSingleSelectProblemLinkedList(linkedList);

    }
}
