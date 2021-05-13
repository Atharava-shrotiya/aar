package com.Servlets;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class NewServlet extends GenericServlet{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Servlet using Genric Servlet");
        PrintWriter p=res.getWriter();
        p.println("<h1> GenericServlet Service Method</h1>");
    }


}
