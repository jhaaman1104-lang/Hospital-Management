package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import dao.BillDao;
import model.Bill;

@WebServlet("/bill")
public class BillServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        Bill b=new Bill(); b.setPatientId(Integer.parseInt(req.getParameter("patientId")));
        b.setConsultationFee(Double.parseDouble(req.getParameter("consultationFee")));
        b.setRoomCharge(Double.parseDouble(req.getParameter("roomCharge")));
        b.setMedicineCharge(Double.parseDouble(req.getParameter("medicineCharge")));
        b.setOtherCharge(Double.parseDouble(req.getParameter("otherCharge")));
        b.setPaymentStatus(req.getParameter("paymentStatus"));
        new BillDao().add(b); resp.sendRedirect("bill");
    }
    protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        req.setAttribute("bills",new BillDao().getAll()); req.getRequestDispatcher("bill/TotalBills.jsp").forward(req,resp);
    }
}
