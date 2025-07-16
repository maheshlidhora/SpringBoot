 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profile</title>
</head>
<body>
    <h1>Welcome JSpiders, User</h1>
    <!-- FIRST WAY TO FEATCH DATA -->
    <!-- <h4>Name: ${myKeyName}</h4>
    <h4>Email: ${myKeyEmail}</h4>
    <h4>Contact: ${myKeyContact}</h4>
    <h4>Password: ${myKeyPassword}</h4>
    <h4>Gender: ${myKeyGender}</h4>
    <h4>City: ${myKeyCity}</h4> -->

    <!-- SECOND WAY TO FEATCH DATA VIA myKeyUserObject -->
    <!-- <h4>Name: ${model_user.getName()}</h4>
    <h4>Email: ${model_user.getEmail()}</h4>
    <h4>Contact: ${model_user.getContact()}</h4>
    <h4>Password: ${model_user.getPassword()}</h4>
    <h4>Gender: ${model_user.getGender()}</h4>
    <h4>City: ${model_user.getCity()}</h4> -->

    <!-- THIRD WAY TO FEATCH DATA VIA @ModelAttribute Object -->
    <h4>Name: ${user.getName()}</h4>
    <h4>Email: ${user.getEmail()}</h4>
    <h4>Contact: ${user.getContact()}</h4>
    <h4>Password: ${user.getPassword()}</h4>
    <h4>Gender: ${user.getGender()}</h4>
    <h4>City: ${user.getCity()}</h4>
</body>
</html>