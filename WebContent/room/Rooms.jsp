<%@ page import="dao.RoomDao,model.Room" %><!DOCTYPE html><html><head><title>Rooms</title><%@ include file="../common.jsp" %></head><body><div class="container py-5"><h2>Rooms</h2>
<table class="table table-bordered mt-4"><tr><th>ID</th><th>Room</th><th>Type</th><th>Status</th><th>Patient ID</th></tr>
<% for(Room r:new RoomDao().getAll()){ %><tr><td><%=r.getId()%></td><td><%=r.getRoomNumber()%></td><td><%=r.getRoomType()%></td><td><span class="badge <%=r.getStatus().equals("Available")?"bg-success":"bg-danger"%>"><%=r.getStatus()%></span></td><td><%=r.getPatientId()==0?"-":r.getPatientId()%></td></tr><% } %></table>
<a href="AssignRoom.jsp" class="btn btn-primary">Assign Room</a> <a href="../Dashboard.jsp" class="btn btn-secondary">Dashboard</a></div></body></html>
