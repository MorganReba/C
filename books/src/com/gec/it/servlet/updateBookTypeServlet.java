package com.gec.it.servlet;

import com.gec.it.dao.BookDao;
import com.gec.it.dao.TypeDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateBookTypeServlet")

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MZJ
 * Date: 2022-07-08
 * Time: 10:01
 */
public class updateBookTypeServlet extends HttpServlet {
    private static final long serialVersionUID=1L;

    public updateBookTypeServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //设置编码类型
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("name");
        int tid = Integer.parseInt(request.getParameter("tid"));

        TypeDao typeDao = new TypeDao();
        typeDao.updateTypeBook(tid,name);
        response.sendRedirect("/admin_booktype.jsp");
    }

}
