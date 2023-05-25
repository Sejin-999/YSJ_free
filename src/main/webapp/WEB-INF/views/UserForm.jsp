<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>등록</title>
</head>
<body>
<div align=center>
    <header>학생 정보 등록</header>
    <form name=form1 action="../member/register/" method="post">
        <table>
            <tr><th>LoginID</th><td><input type="text" name="id" autofocus placeholder="공백없이 입력하세요"></td></tr>
            <tr><th>LoginPWD</th><td><input type="text" name="password" placeholder="공백없이 입력하세요"></td></tr>
            <tr><th>UserName</th><td><input type="text" name="userName"  placeholder="공백없이 입력하세요"></td></tr>
        </table>
        <dl>
            <dd><input type="submit" name="submit" value="보내기"></dd>
            <dd><input type="reset" name="reset" value="다시 작성"></dd>
        </dl>
    </form>
</div>
</body>
</html>