<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DriveSmart – Home</title>
    <link rel="stylesheet" href="style.css"/>
</head>
<body>
    <%@ include file="header.html" %>
        <h2>Welcome to DriveSmart Management System</h2>
            <div>
                <h3>Book a Session</h3>
                <a href="book_session.jsp">Book Now</a>
            </div>
            <br>
            <div>
                <h3>View Schedule</h3>
                <a href="ScheduleServlet">View Schedule</a>
            </div>
            
    <%@ include file="footer.jsp" %>
</body>
</html>
