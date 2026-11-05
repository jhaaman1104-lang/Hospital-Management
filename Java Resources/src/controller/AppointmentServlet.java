package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import dao.AppointmentDao;
import model.Appointment;

@WebServlet("/appointment")
public class AppointmentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        Appointment a=new Appointment(); a.setPatientId(Integer.parseInt(req.getParameter("patientId")));
        a.setDoctorId(Integer.parseInt(req.getParameter("doctorId"))); a.setAppointmentDate(req.getParameter("appointmentDate"));
        a.setAppointmentTime(req.getParameter("appointmentTime")); a.setReason(req.getParameter("reason"));
        new AppointmentDao().add(a); resp.sendRedirect("appointment/ViewAppointments.jsp");
    }
    protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        req.setAttribute("appointments",new AppointmentDao().getAll());
        req.getRequestDispatcher("appointment/ViewAppointments.jsp").forward(req,resp);
    }
}
