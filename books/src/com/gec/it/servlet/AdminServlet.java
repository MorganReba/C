package com.gec.it.servlet;

import com.gec.it.bean.AdminBean;
import com.gec.it.dao.AdminDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AdminServlet")

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MZJ
 * Date: 2022-07-05
 * Time: 15:08
 */
public class AdminServlet extends HttpServlet {

    private static final long serialVersionUID=1L;

    public AdminServlet() {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //设置编码类型
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        //设置tip，用来区分是修改密码还是个人资料，tip=1为修改密码
        int tip = Integer.parseInt(request.getParameter("tip"));

        //获取发起请求页面的文件名称，在对应的jsp表单填写，修改完后直接返回对应的页面
        String url = request.getParameter("url");
        HttpSession session = request.getSession();
        AdminBean adminBean = new AdminBean();

        //获取存到session的aid
        String aid= (String) session.getAttribute("aid");

        //通过aid获取到读者的信息
        AdminDao adminDao = new AdminDao();
        adminBean = adminDao.get_AidInfo2(aid);

        //修改密码
        if (tip == 1) {


            //获取到输入的旧密码，新密码
            String password = request.getParameter("password");
            String password2 = request.getParameter("password2");

            //获取读者数据表中的密码
            String old_password = adminBean.getPassword();

            //对旧密码进行比较，如果相同就修改（旧密码正确），不同就直接退出
            if (old_password.equals(password)) {
                adminDao.updateUser(adminBean.getAid(),adminBean.getUsername(),password2,adminBean.getName()
                                    ,adminBean.getEmail(),adminBean.getPhone(),adminBean.getLend_num(),adminBean.getMax_num());
                response.sendRedirect("/"+url+".jsp");
            } else {
                out.write("<script type='text/javascript'>alert('password error');location.href='"+url+".jsp'; </script>");
            }

        } else {

            //修改输入的信息到数据表中
            //获取输入的信息
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");

            //修改输入的信息到数据表中
            adminDao.updateUser(adminBean.getAid(),adminBean.getUsername(),adminBean.getPassword(),
                                name,email,phone,adminBean.getLend_num(),adminBean.getMax_num());
            response.sendRedirect("/"+url+".jsp");
        }
    }
}
