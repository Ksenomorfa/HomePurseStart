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
<h1>${flows}</h1>
<a href="<c:url value="/"/>">Index</a> |
<a href="<c:url value="/accounts"/>">Accounts</a> |
<a href="<c:url value="/flows"/>">CashFlows</a> |
<a href="<c:url value="/reports" />">Reports</a>

</body>


</html>