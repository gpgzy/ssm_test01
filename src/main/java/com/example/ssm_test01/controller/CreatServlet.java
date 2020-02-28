package com.example.ssm_test01.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/create")
public class CreatServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String name = req.getParameter("name");
    String password1 = req.getParameter("password1");
    String password2 = req.getParameter("password2");
    String telNo = req.getParameter("telNo");
    String branch = req.getParameter("branch");
    String committee = req.getParameter("committee");
    System.out.println(branch);
    if(password1.equals(password2)&&name.length()<5&&telNo.length()==11){
        /*
        * 信息没有问题，成功
        * 把数据写入数据库
        * 跳转页面
        * 把分数设置为0*/
        resp.sendRedirect("login.html");

    }else {
        /*
        * 信息有误，重新注册*/
        resp.sendRedirect("erro.html");
    }
    }
}
