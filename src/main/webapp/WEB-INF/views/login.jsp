<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>로그인</title>
</head>
<body>
<h1>로그인</h1>

<form action="/user/login" method="post">

    <input type="text" name="id" placeholder="아이디를 입력하세요" />
    <br /><br />
    <input type="password" name="password" placeholder="비밀번호를 입력하세요" />
    <br /><br />
    <input type="submit" value="로그인" />
</form>
</body>
</html>
