<%@ page import="com.ysj.ysj_free.domain.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>헤더</title>
</head>
<body>
<header>

    <% User user = (User) session.getAttribute("user"); %>
    <% if (user != null) { %>
    <h3>로그인 사용자: <%= user.getUsername() %></h3>
    <h3><a href="/page/ImageUpload">이미지 업로드</a></h3>
    <% } else { %>
    <a href="/page/login">로그인</a>
    <% } %>

</header>
</body>
</html>
