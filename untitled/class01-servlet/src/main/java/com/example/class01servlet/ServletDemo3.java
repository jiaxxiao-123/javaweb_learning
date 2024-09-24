package com.example.class01servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
@WebServlet(value ="/demo3",name="demo3")
public class ServletDemo3 implements Servlet {
    /**
     *
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
     System.out.println("Servlet初始化");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     *
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servlet 执行");
        servletResponse.getWriter().write("servletdemo1");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    /**
     *
     */
    @Override
    public void destroy() {
        System.out.println("消除方法");
    }
}
