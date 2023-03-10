package com.example.SP23B2_SOF3011_IT17319;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet({
    "/hello",
    "/hello2"
})
public class HelloServlet extends HttpServlet {
    public void init() { }

    public void doGet(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws IOException, ServletException {
        String name = "TienNH21";
        request.setAttribute("hoTen", name);
        request.getRequestDispatcher("/views/hello.jsp")
                .forward(request, response);
    }

    public void destroy() {
    }
}