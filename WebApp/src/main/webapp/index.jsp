<%--
  Created by IntelliJ IDEA.
  User: Tharindu Chanaka
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My First JSP Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #0e0e0e;
            color: white;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: #333;
            color: #fff;
            padding: 10px 0;
            text-align: center;
        }
        h1 {
            color: #ffffff;
        }
        .container {
            width: 80%;
            margin: 0 auto;
            padding: 20px;
        }
        .form-section {
            background-color: #000000;
            color: white;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);
        }
        label {
            font-weight: bold;
        }
        input[type="text"], input[type="email"], input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        footer {
            text-align: center;
            padding: 10px;
            background-color: #333;
            color: white;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>
<body>

<header>
    <h1>Welcome to My First JSP Web Application</h1>
</header>

<div class="container">
    <h2>About This Application</h2>
    <p>This is a simple JSP application designed to demonstrate dynamic content generation. The page is styled with basic HTML and CSS.</p>

    <div class="form-section">
        <h3>Sign Up for Updates</h3>
        <form action="Home" method="GET">
            <label for="name">Full Name:</label>
            <input type="text" id="name" name="name" required>

            <label for="email">Email Address:</label>
            <input type="email" id="email" name="email" required>

            <input type="submit" value="Access to Home Page">
        </form>
    </div>

    <h3>Dynamic Server Date</h3>
    <p>Today's date is: <%= new java.util.Date() %></p>

    <p>If you have any questions, feel free to contact us.</p>
</div>

<footer>
    <p>&copy; 2025 My First JSP Web App. All rights reserved.</p>
</footer>

</body>
</html>