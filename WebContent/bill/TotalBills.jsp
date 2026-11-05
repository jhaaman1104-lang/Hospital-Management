<%@ page import="dao.BillDao,model.Bill" %><!DOCTYPE html><html><head><title>Bills</title><%@ include file="../common.jsp" %></head><body><div class="container py-5">
<div class="d-flex justify-content-between"><h2>Hospital Bills</h2><a class="btn btn-primary" href="GenerateBill.jsp">+ Generate Bill</a></div>
<table class="table table-striped mt-4"><tr><th>ID</th><th>Patient</th><th>Date</th><th>Consultation</th><th>Room</th><th>Medicine</th><th>Other</th><th>Total</th><th>Status</th></tr>
<% for(Bill b:new BillDao().getAll()){ %><tr><td><%=b.getId()%></td><td><%=b.getPatientId()%></td><td><%=b.getBillDate()%></td><td>₹<%=b.getConsultationFee()%></td><td>₹<%=b.getRoomCharge()%></td><td>₹<%=b.getMedicineCharge()%></td><td>₹<%=b.getOtherCharge()%></td><td><b>₹<%=b.getTotal()%></b></td><td><%=b.getPaymentStatus()%></td></tr><% } %></table>
<a href="../Dashboard.jsp">← Dashboard</a></div></body></html>
