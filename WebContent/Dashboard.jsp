<%@ page import="model.User" %>
<% if(session.getAttribute("user")==null){ response.sendRedirect("Login.jsp"); return; } %>
<!DOCTYPE html><html><head><title>Dashboard</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/Style.css"></head>
<body>
<nav class="navbar navbar-dark bg-primary"><div class="container-fluid"><span class="navbar-brand">MediCare HMS Dashboard</span><a class="btn btn-light" href="logout">Logout</a></div></nav>
<div class="container py-5"><h2>Welcome, <%=((User)session.getAttribute("user")).getUsername()%> 👋</h2>
<div class="row g-4 mt-2">
<% String[][] cards={{"Patients","patient/ViewPatient.jsp","View Patients"},{"Doctors","doctor/ViewDoctor.jsp","View Doctors"},{"Appointments","appointment/ViewAppointments.jsp","View Appointments"},{"Rooms","room/Rooms.jsp","Manage Rooms"},{"Billing","bill/TotalBills.jsp","View Bills"}}; for(String[] c:cards){ %>
<div class="col-md-4"><div class="card dashboard-card p-4"><h4><%=c[0]%></h4><p>Hospital <%=c[0].toLowerCase()%> management.</p><a class="btn btn-outline-primary" href="<%=c[1]%>"><%=c[2]%></a></div></div>
<% } %></div></div></body></html>
