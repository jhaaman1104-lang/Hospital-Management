package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import dao.PatientDao;
import model.Patient;

@WebServlet("/patient")
public class PatientServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        Patient p=new Patient(); p.setName(req.getParameter("name")); p.setGender(req.getParameter("gender"));
        p.setDob(req.getParameter("dob")); p.setPhone(req.getParameter("phone")); p.setAddress(req.getParameter("address")); p.setDisease(req.getParameter("disease"));
        new PatientDao().add(p); resp.sendRedirect("patient/ViewPatient.jsp");
    }
    protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        if("delete".equals(req.getParameter("action"))) new PatientDao().delete(Integer.parseInt(req.getParameter("id")));
        req.setAttribute("patients",new PatientDao().getAll());
        req.getRequestDispatcher("patient/ViewPatient.jsp").forward(req,resp);
    }
}
