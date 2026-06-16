package com.lab.dao;

import com.lab.model.SessionBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SessionDAO {

    public boolean bookSession(SessionBean session) throws SQLException {
        String sql = "INSERT INTO Training_Sessions "
                   + "(student_name, branch_location, lesson_type, status) "
                   + "VALUES (?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, session.getStudentName());
            ps.setString(2, session.getBranchLocation());
            ps.setString(3, session.getLessonType());
            ps.setString(4, session.getStatus());

            return ps.executeUpdate() > 0;
        }
    }

     //Retrieves all training sessions ordered by branch location.
    public List<SessionBean> getAllSessions() throws SQLException {
        List<SessionBean> list = new ArrayList<>();
        String sql = "SELECT * FROM Training_Sessions ORDER BY branch_location ASC";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                SessionBean session = new SessionBean(
                    rs.getInt("session_id"),
                    rs.getString("student_name"),
                    rs.getString("branch_location"),
                    rs.getString("lesson_type"),
                    rs.getString("status")
                );
                list.add(session);
            }
        }
        return list;
    }
}
