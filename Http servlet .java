package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class httpservlet extends HttpServlet {

    
   
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res){
        
          
        
            PrintWriter out = res.getWriter();
                  
            
            out.println("<h1>httpservlet doGet Method</h1>");
           
        } 
    }
}
