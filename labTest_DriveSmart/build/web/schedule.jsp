<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.lab.model.SessionBean, java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DriveSmart – Schedule</title>
    <<link rel="stylesheet" href="style.css"/>
</head>
<body>

    <%@ include file="header.html" %>

    <main>
        <div>
            <h2>Schedule</h2>
            <div>
                <a href="book_session.jsp">New Booking</a>
                <a href="index.jsp">Home</a>
            </div>
        </div>

        <table>
            <thead>
                <tr>
                    <th>Session ID</th>
                    <th>Student Name</th>
                    <th>Branch Location</th>
                    <th>Lesson Type</th>
                    <th>Status</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<SessionBean> sessionList =
                        (List<SessionBean>) request.getAttribute("sessionList");

                    if (sessionList == null || sessionList.isEmpty()) {
                %>
                        <tr><td colspan="6" class="empty">No training sessions found.</td></tr>
                <%
                    } else {
                        int row = 1;
                        for (SessionBean s : sessionList) {
                            String badgeClass = "Completed".equals(s.getStatus())
                                                ? "badge-completed" : "badge-booked";
                %>
                        <tr>
                            <td><%= row++ %></td>
                            <td><%= s.getStudentName() %></td>
                            <td><%= s.getBranchLocation() %></td>
                            <td><%= s.getLessonType() %></td>
                            <td><span class="badge <%= badgeClass %>"><%= s.getStatus() %></span></td>
                        </tr>
                <%
                        }
                    }
                %>
            </tbody>
        </table>
    </main>

    <%@ include file="footer.jsp" %>

</body>
</html>
