package com.example.registrationForm;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import database_Connector.registration_data;

@WebServlet(name = "helloServlet", value = "/register")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("Email");
        String password = request.getParameter("password");
        registration_data upload_data = new registration_data(firstName ,lastName , email , password);
        PrintWriter out = response.getWriter();
        response.sendRedirect("login.jsp");
    }


    public void destroy() {
    }
}