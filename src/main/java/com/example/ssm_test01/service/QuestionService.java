package com.example.ssm_test01.service;

import com.example.ssm_test01.entity.SingleSelectProblem;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class QuestionService {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet();
        LinkedList<SingleSelectProblem> linkedList = new LinkedList<>();
        Random r= new Random();
        while (hashSet.size()<10){
            int a= r.nextInt(100);
            //System.out.println(a);
            hashSet.add(a);
        }
        for (Integer integer:hashSet) {
            System.out.println(integer);
            /*
             * 在数据库中根据相应的数字找到相应id的试题
             * */
        }

    }
}
