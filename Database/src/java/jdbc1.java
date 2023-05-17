/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tanus
 */
public class jdbc1 extends HttpServlet {

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
//            out.println("Hello");
Connection con = null;
Statement stmt = null;
            try {
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost/", "root","Tanu@123#!#");
                        stmt = con.createStatement();
                        out.println("Creating database...");
                        out.println("<br>");
			String q = "CREATE DATABASE USER_DB";
			stmt.executeUpdate(q);
			out.println("Database created successfully...");
                        out.println("<br>");
			q = "USE USER_DB";
         		stmt.executeUpdate(q);
			q="CREATE TABLE USERS " +"(id INTEGER not NULL AUTO_INCREMENT, " +" username VARCHAR(255), " +" password VARCHAR(255), " +" PRIMARY KEY ( id ))";
			stmt.executeUpdate(q);
			out.println("Table created successfully...");
            }
                catch(SQLException se){
             se.printStackTrace();
          }catch(Exception e){
             e.printStackTrace();
          }finally{
             try{
                if(stmt!=null)
                   con.close();
             }catch(SQLException se){
             }
             try{
                if(con!=null)
                   con.close();
             }catch(SQLException se){
                se.printStackTrace();
             }
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
