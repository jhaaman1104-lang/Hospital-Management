<!DOCTYPE html><html><head><title>Add Patient</title><%@ include file="../common.jsp" %></head><body>
<div class="container py-5"><h2>Add Patient</h2><form action="../patient" method="post" class="card p-4">
<input class="form-control mb-3" name="name" placeholder="Patient Name" required>
<select class="form-select mb-3" name="gender" required><option value="">Gender</option><option>Male</option><option>Female</option><option>Other</option></select>
<input class="form-control mb-3" type="date" name="dob" required><input class="form-control mb-3" name="phone" placeholder="Phone">
<input class="form-control mb-3" name="address" placeholder="Address"><input class="form-control mb-3" name="disease" placeholder="Disease / Diagnosis">
<button class="btn btn-primary">Save Patient</button> <a href="ViewPatient.jsp" class="btn btn-secondary">Back</a>
</form></div></body></html>
