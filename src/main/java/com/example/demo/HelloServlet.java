package com.example.demo;

import jdk.nashorn.api.scripting.NashornScriptEngineFactory;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/c0222i1")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter printWriter = response.getWriter();
        String usn = request.getParameter("username");
        String pass = request.getParameter("pass");
        if (usn.equals("admin") && pass.equals("123")) {
            printWriter.print("<html>"+"Hello Boss"+"</html>");
        } else {
            printWriter.print("<html>"+"Press Again"+"</html>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        String usn = req.getParameter("username");
        String pass = req.getParameter("pass");
        if (usn.equals("admin") && pass.equals("123")) {
            printWriter.print("<html>"+"Hello Boss"+"</html>");
        } else {
            printWriter.print("<html>"+"Press Again"+"</html>");
        }
    }

    public void destroy() {
    }
}