package com.example.jspServletPractiseProject;

import com.sun.net.httpserver.HttpContext;

import java.io.*;
import javax.servlet.ServletContext;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet" ,
    initParams = {@WebInitParam(name ="defaultName" , value = "jon arthur")}
)

public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String user = request.getParameter("username");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        ServletContext context = request.getServletContext();
        if(user != null && user!= "") {
            session.setAttribute("name" , user);
            context.setAttribute("name" , user);
        }
        out.println("this is the output from session " + (String) session.getAttribute("name") + "   ");
        out.println("this is the parameter output " + user + "   ");
        out.println("this is the context object output " + (String) context.getAttribute("name") + "   ");
        out.println("this is the value that comes wiht initConfig " + getServletConfig().getInitParameter("defaultName"));
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String user = request.getParameter("username");
        PrintWriter out = response.getWriter();
        System.out.println(user);
        out.println(user);
        String password = request.getParameter("password");
        out.println(password);
        String proffesion = request.getParameter("prof");
        out.println(proffesion);


    }

    public void destroy() {
    }
}