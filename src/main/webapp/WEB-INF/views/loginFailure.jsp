<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>로그인</title>
    <link rel="stylesheet" type="text/css" href="/css/login.css">
</head>
<body>
    <div class="container">
        <div class="box">
          <h1>로그인의 실패</h1>
    
          <form action="/user/login" method="post">
            <input type="text" name="id" placeholder="아이디를 입력하세요" />
            <br /><br />
            <input type="password" name="password" placeholder="비밀번호를 입력하세요" />
            <br /><br />
            <input type="submit" value="로그인" />
          </form>
        </div>
      </div>
</body>
</html>
