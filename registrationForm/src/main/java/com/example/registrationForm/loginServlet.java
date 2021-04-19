package com.example.registrationForm;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

import database_Connector.loginVerification;


@WebServlet(name = "loginServlet", value = "/loginServlet")
public class loginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        loginVerification verify = new loginVerification();
        String x = verify.loginVerify(email , password);
        System.out.println(x);

        PrintWriter out = response.getWriter();
        out.println("<h1> hello " + x + "</h1>" );
    }
}
