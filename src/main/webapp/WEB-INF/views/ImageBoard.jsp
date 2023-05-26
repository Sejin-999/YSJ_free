<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Image Board</title>
</head>
<body>
<%@ include file="header.jsp" %>
<h1>Image Board</h1>
<%-- Loop through the list of images and display them --%>
<c:forEach var="image" items="${images}">
    <div>
        <h3>${image.fileName}</h3>
        <img src="images/${image.fileName}" alt="Image">
    </div>
</c:forEach>

</body>
</html>
