<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DriveSmart – Book Session</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <%@ include file="header.html" %>
            <h2>Book Session</h2>
            
            <form method="POST" action="BookSessionServlet">

                <label>Student Name</label>
                <input type="text" id="student_name" name="student_name" placeholder="e.g. Isyraf Aiman" required>

                <label>Branch Location</label>
                <select id="branch_location" name="branch_location" required>
                    <option>Select Branch</option>
                    <option value="Kuala Lumpur">Kuala Lumpur</option>
                    <option value="Penang">Penang</option>
                    <option value="Johor">Johor</option>
                    <option value="Terengganu">Terengganu</option>
                </select>

                <label>Lesson Type</label>
                <select id="lesson_type" name="lesson_type" required>
                    <option>Select Lesson</option>
                    <option value="Manual Car">Manual Car</option>
                    <option value="Automatic Car">Automatic Car</option>
                    <option value="Motorcycle">Motorcycle</option>
                </select>

                    <button type="submit">Confirm Booking</button>
                    <a href="index.jsp">Back</a>
            </form>

    <%@ include file="footer.jsp" %>
</body>
</html>
