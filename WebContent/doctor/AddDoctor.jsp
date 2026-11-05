<!DOCTYPE html><html><head><title>Add Doctor</title><%@ include file="../common.jsp" %></head><body><div class="container py-5"><h2>Add Doctor</h2>
<form action="../doctor" method="post" class="card p-4">
<input class="form-control mb-3" name="name" placeholder="Doctor Name" required><input class="form-control mb-3" name="specialization" placeholder="Specialization" required>
<input class="form-control mb-3" name="department" placeholder="Department"><input class="form-control mb-3" name="phone" placeholder="Phone"><input class="form-control mb-3" name="email" type="email" placeholder="Email">
<button class="btn btn-primary">Save Doctor</button> <a href="ViewDoctor.jsp" class="btn btn-secondary">Back</a></form></div></body></html>
