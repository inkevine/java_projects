package com.app.submitoo.controller;


import com.app.submitoo.dao.AssignmentDAO;
import com.app.submitoo.model.User;
import com.app.submitoo.model.Assignment;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/createAssignment")
public class AssignmentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if (user == null || user.getRole() != com.app.submitoo.model.Role.INSTRUCTOR) {
            response.sendRedirect("login.jsp");
            return;
        }

        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String deadline = request.getParameter("deadline");

        Assignment assignment = new Assignment();
        assignment.setTitle(title);
        assignment.setDescription(description);
        assignment.setDeadline(LocalDate.parse(deadline));
        assignment.setInstructor(user);
        assignment.setCreatedBy(user);

        AssignmentDAO assignmentDAO = new AssignmentDAO();
        assignmentDAO.saveAssignment(assignment);

        response.sendRedirect("instructorDashboard.jsp");
    }
}
