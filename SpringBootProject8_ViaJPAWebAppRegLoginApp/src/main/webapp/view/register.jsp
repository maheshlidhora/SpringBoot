<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="./css/style.css">
</head>
<body>
	<c:if test="${not empty successMsg}"> 
		<h1 style="color: green;">${successMsg}</h1>
	</c:if>
	
	<c:if test="${not empty errorMsg}"> 
		<h1 style="color: red;">${errorMsg}</h1>
	</c:if>
    <h1>Register</h1>
    <form action="regForm" method="post">
        <input type="text" name="name" placeholder="Name"> <br>
        <input type="email" name="email" placeholder="Email"> <br>
        <input type="password" name="password" placeholder="Password"> <br>
        <input type="text" name="phone" placeholder="Phone"> <br>
        <input type="submit" value="submit">
    </form>
    <b><a href="loginPage">If already Register then Click here....</a></b>
</body>
</html>