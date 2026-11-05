<!DOCTYPE html><html><head><title>Book Appointment</title><%@ include file="../common.jsp" %></head><body><div class="container py-5"><h2>Book Appointment</h2>
<form action="../appointment" method="post" class="card p-4">
<input class="form-control mb-3" type="number" name="patientId" placeholder="Patient ID" required><input class="form-control mb-3" type="number" name="doctorId" placeholder="Doctor ID" required>
<input class="form-control mb-3" type="date" name="appointmentDate" required><input class="form-control mb-3" type="time" name="appointmentTime" required>
<textarea class="form-control mb-3" name="reason" placeholder="Reason"></textarea><button class="btn btn-primary">Book Appointment</button></form></div></body></html>
