package com.example.ssm_test01.controller;

import org.springframework.boot.web.servlet.server.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.sendRedirect("/login.html");
        System.out.println(123);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding("utf-8");
    String uesrname = req.getParameter("username");
    String password = req.getParameter("password");
    System.out.println(uesrname+" "+password);
    if (uesrname.equals("gzy")&&password.equals("123"))
    {
        resp.sendRedirect("/index.html");
    }else
    {
    resp.sendRedirect("/erro.html");
    }
    }

}
