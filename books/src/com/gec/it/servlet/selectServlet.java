package com.gec.it.servlet;

import com.gec.it.bean.BookBean;
import com.gec.it.dao.BookDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/selectServlet")
public class selectServlet extends HttpServlet {
    private  static  final  long serialVersionUID=1L;

    public selectServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        int tip = Integer.parseInt(request.getParameter("tip"));
        String name = request.getParameter("name");
        BookDao bookDao = new BookDao();
        ArrayList<BookBean> data = bookDao.getLikeList(name);

        request.setAttribute("data", data);
        String url = "";

        if (tip == 1) {
            url = response.encodeURL("admin_book.jsp");

        } else {
            url = response.encodeURL("select.jsp");
        }
        request.getRequestDispatcher(url).forward(request, response);
    }
}
