<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html><html><head><title>Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/Style.css"></head>
<body class="login-bg"><div class="login-card">
<h2 class="text-center mb-4">MediCare HMS</h2>
<% if(request.getParameter("error")!=null){ %><div class="alert alert-danger"><%=request.getParameter("error")%></div><% } %>
<form action="login" method="post">
<label>Username</label><input class="form-control mb-3" name="username" required>
<label>Password</label><input class="form-control mb-3" type="password" name="password" required>
<button class="btn btn-primary w-100">Login</button>
</form><p class="text-muted small mt-3 text-center">Demo: admin / admin123</p>
</div></body></html>
