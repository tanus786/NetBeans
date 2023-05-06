package com.practice; 
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import java.util.Date;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("This is get method...");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1> This is get method of my servlet </h1>");
        out.println(new Date().toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    
}
 