<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>HomePurse - Login</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/resources/style.css"/>">
</head>

<body>
<h1>Please, enter your email and password for registration:</h1>

<form method="POST">
    Email: <input type="text" name="email"/> <br/>
    Password: <input type="password" name="password"/> <br/>
    Repeat password: <input type="password" name="password"/> <br/>
    <input type="submit" value="Login"/>
</form>



</body>


</html>