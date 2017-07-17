<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<h1>Please, enter your login and password:</h1>
<form method="POST">
    Email: <input type="text" name="email"/> <br/>
    Password: <input type="password" name="password"/> <br/>
    <input type="submit" value="Login"/>
</form>


</body>
</html>