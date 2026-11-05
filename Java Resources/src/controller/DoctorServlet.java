package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import dao.DoctorDao;
import model.Doctor;

@WebServlet("/doctor")
public class DoctorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        Doctor d=new Doctor(); d.setName(req.getParameter("name")); d.setSpecialization(req.getParameter("specialization"));
        d.setDepartment(req.getParameter("department")); d.setPhone(req.getParameter("phone")); d.setEmail(req.getParameter("email"));
        new DoctorDao().add(d); resp.sendRedirect("doctor/ViewDoctor.jsp");
    }
    protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        req.setAttribute("doctors",new DoctorDao().getAll()); req.getRequestDispatcher("doctor/ViewDoctor.jsp").forward(req,resp);
    }
}
