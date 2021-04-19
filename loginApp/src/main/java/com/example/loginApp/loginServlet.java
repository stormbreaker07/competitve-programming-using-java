package com.example.loginApp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "loginServlet", value = "/login")
public class loginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        loginService serviceProvider = new loginService();
        Boolean result =  serviceProvider.authenticate(userName , password);
        if(result) {
            String user = serviceProvider.getUserName(password);
            request.getSession().setAttribute("user" , user);
            response.sendRedirect("success.jsp");
            return;
        }
        else
        {
            response.sendRedirect("loginPage.jsp");
            return;
        }
    }
}
