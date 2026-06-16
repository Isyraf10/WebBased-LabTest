package com.lab.controller;

import com.lab.model.SessionBean;
import com.lab.dao.SessionDAO;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BookSessionServlet")
public class BookSessionServlet extends HttpServlet {

    private final SessionDAO sessionDAO = new SessionDAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("book_session.jsp").forward(request, response);
    }

    //POST : retrieve parameters
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String studentName= request.getParameter("student_name");
        String branchLocation= request.getParameter("branch_location");
        String lessonType= request.getParameter("lesson_type");

        SessionBean session = new SessionBean();
        session.setStudentName(studentName);
        session.setBranchLocation(branchLocation);
        session.setLessonType(lessonType);
        session.setStatus("Booked");
        try {
            sessionDAO.bookSession(session);
            response.sendRedirect(request.getContextPath() + "/ScheduleServlet");
        } catch (SQLException e) {
            throw new ServletException("Database error: " + e.getMessage(), e);
        }
    }
}
