package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import dao.RoomDao;

@WebServlet("/room")
public class RoomServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        req.setAttribute("rooms",new RoomDao().getAll()); req.getRequestDispatcher("room/Rooms.jsp").forward(req,resp);
    }
    protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        new RoomDao().assign(Integer.parseInt(req.getParameter("roomId")),Integer.parseInt(req.getParameter("patientId")));
        resp.sendRedirect("room");
    }
}
