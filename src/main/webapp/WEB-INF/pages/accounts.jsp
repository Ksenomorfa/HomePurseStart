<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

<h1>${greeting}</h1>
<c:forEach items="${accountList}" var="account">
    <div class="accountName">
        <li id="account_<c:out value="account.id"/>"> Account name:
            <c:out value="${account.name}"/> Profile id:
            <span class="profile"><c:out value="${account.profile.id}"/> </span>
        </li>
    </div>
</c:forEach>

<a href="<c:url value="/accounts"/>">Accounts</a> |
<a href="<c:url value="/flows"/>">Cash Flows</a> |
<a href="<c:url value="/reports" />">Reports</a>|
<a href="<c:url value="/settings" />">Settings</a>
</body>

</html>