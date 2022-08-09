package com.gec.it.servlet;

import com.gec.it.dao.BookDao;
import com.gec.it.dao.TypeDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteTypeServlet")

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MZJ
 * Date: 2022-07-08
 * Time: 11:03
 */
public class deleteTypeServlet extends HttpServlet {
    private  static  final  long serialVersionUID =1L;

    public deleteTypeServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        int tid = Integer.parseInt(request.getParameter("tid"));

        TypeDao typeDao = new TypeDao();
        typeDao.deleteBookType(tid);

        response.sendRedirect("admin_booktype.jsp");

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
