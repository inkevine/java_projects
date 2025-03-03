<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Welcome to Online Submission System</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body style="background: greenyellow">
<ul class="nav justify-content-end">
  <li class="nav-item">
    <a class="nav-link active" aria-current="page" href="#">Active</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="login.jsp">Login</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="register.jsp">Register</a>
  </li>
  <li class="nav-item">
    <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Contacts</a>
  </li>
</ul>
<div class="container d-flex flex-column justify-content-center align-items-center vh-100">
  <h1 class="mb-4">WeLcOmE My FrIeNd</h1>
  <p class="lead text-center">Easily submit and manage assignments online.</p>
  <div class="mt-4">
    <a href="register.jsp" class="btn btn-success btn-lg me-2">Register</a>
    <a href="login.jsp" class="btn btn-light btn-lg">Login</a>
  </div>

</div>
</body>
</html>
>