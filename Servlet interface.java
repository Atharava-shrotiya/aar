package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class myservlet implements Servlet{


    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Init method");
    }


    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service method"); 
        PrintWriter p=res.getWriter();
        p.println("<h1> Servlet Interface Service Method</h1>");
        
    }
    @Override
    public void destroy() {
          System.out.println("destroy method");
    }

    
    @Override
    public ServletConfig getServletConfig(){
        return null;
    }
    @Override
    public String getServletInfo(){
        return null;
    }
}
