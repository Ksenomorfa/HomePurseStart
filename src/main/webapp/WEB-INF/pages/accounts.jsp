<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>HomePurse - Accounts</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/resources/style.css"/>">
</head>

<body>
<a href="<c:url value="/"/>">Index</a>
<h1>${accounts}</h1>

<a href="<c:url value="/accounts"/>">Accounts</a> |
<a href="<c:url value="/flows"/>">Cash Flows</a> |
<a href="<c:url value="/reports" />">Reports</a>|
<a href="<c:url value="/settings" />">Settings</a>

</body>

</html>