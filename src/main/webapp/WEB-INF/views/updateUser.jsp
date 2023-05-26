<%@ page import="com.ysj.ysj_free.domain.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>등록</title>
</head>
<body>
<% User user = (User) session.getAttribute("user"); %>
<div>
    <div>
        <span>회원 정보 수정</span>
        <div>
            <form action="/user/update" method="post" enctype="multipart/form-data">
                <input type="text" name="id" placeholder="아이디를 입력하세요" />
                <br /><br />
                <input type="password" name="password" placeholder="비밀번호를 입력하세요" />
                <br /><br />
                <input type="text" name="userName" placeholder="유저이름 작성" />
                <br /><br />
                <input type="submit" value="회원정보 수정" />
            </form>
        </div>
    </div>
    <div>
        <span>회원 탈퇴</span>
        <form action="/user/<%= user.getId() %>" method="post">
            <input type="hidden" name="_method" value="delete" />
            <input type="submit" value="사용자 삭제" />
        </form>
    </div>
</div>




</body>
</html>