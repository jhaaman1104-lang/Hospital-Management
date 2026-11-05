<%@ page import="java.util.*,dao.PatientDao,model.Patient" %><!DOCTYPE html><html><head><title>Patients</title><%@ include file="../common.jsp" %></head><body>
<div class="container py-5"><div class="d-flex justify-content-between"><h2>Patients</h2><a class="btn btn-primary" href="AddPatient.jsp">+ Add Patient</a></div>
<table class="table table-striped mt-4"><tr><th>ID</th><th>Name</th><th>Gender</th><th>DOB</th><th>Phone</th><th>Disease</th><th>Action</th></tr>
<% for(Patient p:new PatientDao().getAll()){ %><tr><td><%=p.getId()%></td><td><%=p.getName()%></td><td><%=p.getGender()%></td><td><%=p.getDob()%></td><td><%=p.getPhone()%></td><td><%=p.getDisease()%></td><td><a class="btn btn-sm btn-danger" href="../patient?action=delete&id=<%=p.getId()%>">Delete</a></td></tr><% } %>
</table><a href="../Dashboard.jsp">← Dashboard</a></div></body></html>
