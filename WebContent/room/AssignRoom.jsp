<!DOCTYPE html><html><head><title>Assign Room</title><%@ include file="../common.jsp" %></head><body><div class="container py-5"><h2>Assign Room</h2>
<form action="../room" method="post" class="card p-4"><input class="form-control mb-3" name="roomId" type="number" placeholder="Room ID" required>
<input class="form-control mb-3" name="patientId" type="number" placeholder="Patient ID" required><button class="btn btn-primary">Assign</button></form></div></body></html>
