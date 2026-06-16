package com.lab.controller;

import com.lab.model.SessionBean;
import com.lab.dao.SessionDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ScheduleServlet")
public class ScheduleServlet extends HttpServlet {

    private final SessionDAO sessionDAO = new SessionDAO();

    //GET : retrieve all sessions
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            List<SessionBean> list = sessionDAO.getAllSessions();
            request.setAttribute("sessionList", list);
            RequestDispatcher dispatcher = request.getRequestDispatcher("schedule.jsp");
            dispatcher.forward(request, response);

        } catch (SQLException e) {
            throw new ServletException("Database error " + e.getMessage(), e);
        }
    }
}
