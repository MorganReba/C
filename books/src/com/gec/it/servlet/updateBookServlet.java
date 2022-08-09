package com.gec.it.servlet;

import com.gec.it.dao.BookDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/updateBookServlet")
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MZJ
 * Date: 2022-07-07
 * Time: 9:22
 */
public class updateBookServlet extends HttpServlet {
    private static final long serialVersionUID=1L;

    public updateBookServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //设置编码类型
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String card = request.getParameter("card");
        String name = request.getParameter("name");
        String autho = request.getParameter("autho");
        String press = request.getParameter("press");
        String type = request.getParameter("type");
        int num = Integer.parseInt(request.getParameter("num"));
        int bid = Integer.parseInt(request.getParameter("updatebid"));

        BookDao bookDao = new BookDao();
        bookDao.updateBook(bid,card,name,type,autho,press,num);
        response.sendRedirect("/admin_book.jsp");
    }

}
