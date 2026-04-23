package com.example;

import java.io.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        out.println("<html><body>");
        out.println("<h1>CI/CD Pipeline Successful 🚀</h1>");
        out.println("<p>Hello from Tomcat Servlet</p>");
        out.println("</body></html>");
    }
}
