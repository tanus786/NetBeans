/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.user;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.Part;
@MultipartConfig
public class Register extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
      
            //getting all the input from user
            
            String Name = request.getParameter("user_name");
            String Email = request.getParameter("user_email");
            String Password = request.getParameter("user_password");
            Part part = request.getPart("image");
            String Filename = part.getSubmittedFileName();
//            out.println(Filename);
            
//            out.println(Name);
//            out.println(Email);
//            out.println(Password);


//            Connection to JDBC.....
//                java.sql.Connection con = null;
                try {
                    
                    Thread.sleep(2000);
                    Class.forName("com.mysql.jdbc.Driver");
                    
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root","Tanu@123#!#");
                    //query....
                    
                    String q = "insert into user(Name,Password,Email,Image) values(?,?,?,?)";
                    PreparedStatement pstmt =  con.prepareStatement(q);
                    pstmt.setString(1, Name);
                    pstmt.setString(2, Password);
                    pstmt.setString(3, Email);
                    pstmt.setString(4, Filename);
                    
                    pstmt.executeUpdate();
                    //file upload...
                    InputStream is = part.getInputStream();
                    byte []data = new byte[is.available()];
                    is.read(data);
                    String path = request.getRealPath("/")+"Image"+File.separator+Filename;
//                    out.println(path);
                    FileOutputStream fos = new FileOutputStream(path);
                    fos.write(data);
                    fos.close();
                    
                    out.println("Done");
                  
                    
            } 
                catch (Exception e) {
                e.printStackTrace();
                out.println("Error....");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
