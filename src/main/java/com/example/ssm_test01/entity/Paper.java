package com.example.ssm_test01.entity;

import java.util.LinkedList;

public class Paper {
    private LinkedList<SingleSelectProblem> singleSelectProblemLinkedList;

    public Paper(LinkedList<SingleSelectProblem> singleSelectProblemLinkedList) {
        this.singleSelectProblemLinkedList = singleSelectProblemLinkedList;
    }

    public Paper() {
    }

    public LinkedList<SingleSelectProblem> getSingleSelectProblemLinkedList() {
        return singleSelectProblemLinkedList;
    }

    public void setSingleSelectProblemLinkedList(LinkedList<SingleSelectProblem> singleSelectProblemLinkedList) {
        this.singleSelectProblemLinkedList = singleSelectProblemLinkedList;
    }
}
