<!DOCTYPE html><html><head><title>Generate Bill</title><%@ include file="../common.jsp" %></head><body><div class="container py-5"><h2>Generate Bill</h2>
<form action="../bill" method="post" class="card p-4">
<input class="form-control mb-3" name="patientId" type="number" placeholder="Patient ID" required>
<input class="form-control mb-3" name="consultationFee" type="number" step="0.01" placeholder="Consultation Fee" required>
<input class="form-control mb-3" name="roomCharge" type="number" step="0.01" placeholder="Room Charge" required>
<input class="form-control mb-3" name="medicineCharge" type="number" step="0.01" placeholder="Medicine Charge" required>
<input class="form-control mb-3" name="otherCharge" type="number" step="0.01" placeholder="Other Charge" value="0">
<select class="form-select mb-3" name="paymentStatus"><option>Pending</option><option>Paid</option></select>
<button class="btn btn-primary">Generate Bill</button></form></div></body></html>
