<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Image Board</title>
    <link rel="stylesheet" type="text/css" href="/css/ImageBoard.css">
</head>
<body>
    <%@ include file="header.jsp" %>
    <%-- Loop through the list of images and display them --%>
    <div class="container">
        <c:forEach var="image" items="${images}">
            <div class="imageBox">
                <img src="images/${image.fileName}" alt="Image" class="imageFile">
                <h3>${image.fileName}</h3>
            </div>
        </c:forEach>
    </div>
</body>
</html>
