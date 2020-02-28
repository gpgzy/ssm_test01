package com.example.ssm_test01.entity;

public class SingleSelectProblem {
    private int id;
    private String question;
    private String selectA;
    private String selectB;
    private String selectC;
    private String correctSelect;

    public SingleSelectProblem(int id, String question, String selectA, String selectB, String selectC, String correctSelect) {
        this.id = id;
        this.question = question;
        this.selectA = selectA;
        this.selectB = selectB;
        this.selectC = selectC;
        this.correctSelect = correctSelect;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorrectSelect() {
        return correctSelect;
    }

    public void setCorrectSelect(String correctSelect) {
        this.correctSelect = correctSelect;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getSelectA() {
        return selectA;
    }

    public void setSelectA(String selectA) {
        this.selectA = selectA;
    }

    public String getSelectB() {
        return selectB;
    }

    public void setSelectB(String selectB) {
        this.selectB = selectB;
    }

    public String getSelectC() {
        return selectC;
    }

    public void setSelectC(String selectC) {
        this.selectC = selectC;
    }
}
