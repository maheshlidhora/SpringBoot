<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Form</title>
</head>
<body>
    <h1>My Form</h1>
    <form action="reg" method="post">
        <input type="text" placeholder="Name" name="Name" id=""><br>
        <input type="email" placeholder="Email" name="Email" id=""><br>
        <input type="tel" placeholder="Contact" name="Contact" id=""><br>
        <input type="password" placeholder="Password" name="Password" id=""><br>
        <input type="text" placeholder="Gender" name="Gender" id=""><br>
        <input type="text" placeholder="City" name="City" id=""><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>