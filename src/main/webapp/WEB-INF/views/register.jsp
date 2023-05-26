<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>회원가입</title>
    <link rel="stylesheet" type="text/css" href="/css/login.css">
</head>
<body>
    <div class="container">
        <div class="box">
          <h1>회원가입</h1>
    
          <form action="/user/register" method="post" enctype="multipart/form-data">
              <input type="text" name="id" placeholder="아이디를 입력하세요" />
              <br /><br />
              <input type="password" name="password" placeholder="비밀번호를 입력하세요" />
              <br /><br />
              <input type="text" name="userName" placeholder="유저이름 작성" />
              <br /><br />
            <input type="submit" value="회원가입" />
          </form>
        </div>
      </div>
</body>
</html>
