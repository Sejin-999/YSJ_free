<%@ page import="com.ysj.ysj_free.domain.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>헤더</title>
    <link rel="stylesheet" type="text/css" href="/css/header.css">
</head>
<body>
<header class="header-class">
    <% User user = (User) session.getAttribute("user"); %>
    <% if (user != null) { %>
    <div class="box">
        <h3>로그인 사용자: <%= user.getUsername() %></h3>
        <h3><a href="/page/ImageUpload">이미지 업로드</a></h3>
    </div>
    <% } else { %>
    <div class="box">
        <h3><a href="/page/login">로그인</a></h3>
    </div>
    <% } %>
</header>
</body>
</html>
