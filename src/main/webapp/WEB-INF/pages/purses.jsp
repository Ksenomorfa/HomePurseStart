<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>HomePurse - Purses</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/resources/style.css"/>">
</head>

<body>
<a href="<c:url value="/"/>">Index</a>

<h1>${greeting}</h1>
<c:forEach items="${purseList}" var="purse">
    <div class="purseName">
        <li id="purse_<c:out value="purse.id"/>"> Purse name:
            <c:out value="${purse.name}"/> Profile id:
            <span class="profile"><c:out value="${purse.profile.id}"/> </span>
        </li>
    </div>
</c:forEach>

<a href="<c:url value="/purses"/>">Purses</a> |
<a href="<c:url value="/flows"/>">Cash Flows</a> |
<a href="<c:url value="/reports" />">Reports</a>|
<a href="<c:url value="/settings" />">Settings</a>
</body>

</html>