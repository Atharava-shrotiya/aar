package Url;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class url1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String name=request.getParameter("username");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet url1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Your name is"+request.getParameter("username")+"</h1>");
            out.println("<a href='url2?name="+name+"'>second servlet</a>");
            out.println("</body>");
            out.println("</html>");
    }

}
}
