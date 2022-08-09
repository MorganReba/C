package com.gec.it.servlet;

import com.gec.it.dao.AdminDao;
import com.gec.it.dao.BookDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteUserServlet")
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MZJ
 * Date: 2022-07-07
 * Time: 15:51
 */
public class deleteUserServlet extends HttpServlet {
    private  static  final  long serialVersionUID =1L;

    public deleteUserServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        int aid = Integer.parseInt(request.getParameter("aid"));

        AdminDao adminDao = new AdminDao();
        adminDao.deleteUser(aid);
        response.sendRedirect("admin_user.jsp");

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
