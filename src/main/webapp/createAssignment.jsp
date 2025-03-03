<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="com.app.submitoo.model.User" %>
<%
    User user = (User) session.getAttribute("user");
    if (user == null || user.getRole() != com.app.submitoo.model.Role.INSTRUCTOR) {
        response.sendRedirect("login.jsp");
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Create Assignment</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body style="background: greenyellow">

<div class="container mt-5" style="background: green">
    <h2>Create Assignment</h2>
    <form action="createAssignment" method="post">
        <div class="mb-3">
            <label>Title:</label>
            <input type="text" class="form-control" name="title" required>
        </div>
        <div class="mb-3">
            <label>Description:</label>
            <textarea class="form-control" name="description" required></textarea>
        </div>
        <div class="mb-3">
            <label>Deadline:</label>
            <input type="date" class="form-control" name="deadline" required>
        </div>
        <button type="submit" class="btn btn-success">Create</button>
    </form>
</div>
</body>
</html>
