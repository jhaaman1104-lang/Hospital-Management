package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import dao.UserDao;
import model.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        String username=req.getParameter("username"), password=req.getParameter("password");
        User user=new UserDao().login(username,password);
        if(user!=null){
            req.getSession().setAttribute("user",user);
            resp.sendRedirect("Dashboard.jsp");
        }else{
            resp.sendRedirect("Login.jsp?error=Invalid+username+or+password");
        }
    }
}
