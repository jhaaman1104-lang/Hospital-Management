<%@ page import="dao.AppointmentDao,model.Appointment" %><!DOCTYPE html><html><head><title>Appointments</title><%@ include file="../common.jsp" %></head><body><div class="container py-5">
<div class="d-flex justify-content-between"><h2>Appointments</h2><a class="btn btn-primary" href="BookAppointment.jsp">+ Book</a></div>
<table class="table table-striped mt-4"><tr><th>ID</th><th>Patient</th><th>Doctor</th><th>Date</th><th>Time</th><th>Reason</th><th>Status</th></tr>
<% for(Appointment a:new AppointmentDao().getAll()){ %><tr><td><%=a.getId()%></td><td><%=a.getPatientId()%></td><td><%=a.getDoctorId()%></td><td><%=a.getAppointmentDate()%></td><td><%=a.getAppointmentTime()%></td><td><%=a.getReason()%></td><td><%=a.getStatus()%></td></tr><% } %></table>
<a href="../Dashboard.jsp">← Dashboard</a></div></body></html>
