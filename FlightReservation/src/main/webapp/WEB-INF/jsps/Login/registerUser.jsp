<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RegisterUser</title>
</head>
<body>
<form action="registerUser" method ="post">
<h2>User Registration</h2>
<pre>
First Name:      <input type="text" name="firstName"/>
Last Name:       <input type="text" name="lastName"/>
User Name:       <input type="text" name="email"/>
Password:        <input type="password" name="password"/>
Confirm Password:<input type="password" name="password"/>
                 <input type ="submit" value="register"/>
</pre>
</form>
</body>
</html>