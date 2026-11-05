<%@ page import="dao.DoctorDao,model.Doctor" %><!DOCTYPE html><html><head><title>Doctors</title><%@ include file="../common.jsp" %></head><body><div class="container py-5">
<div class="d-flex justify-content-between"><h2>Doctors</h2><a class="btn btn-primary" href="AddDoctor.jsp">+ Add Doctor</a></div>
<table class="table table-striped mt-4"><tr><th>ID</th><th>Name</th><th>Specialization</th><th>Department</th><th>Phone</th><th>Email</th></tr>
<% for(Doctor d:new DoctorDao().getAll()){ %><tr><td><%=d.getId()%></td><td><%=d.getName()%></td><td><%=d.getSpecialization()%></td><td><%=d.getDepartment()%></td><td><%=d.getPhone()%></td><td><%=d.getEmail()%></td></tr><% } %></table>
<a href="../Dashboard.jsp">← Dashboard</a></div></body></html>
