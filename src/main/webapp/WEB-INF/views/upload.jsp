<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>이미지 업로드</title>
    <link rel="stylesheet" type="text/css" href="/css/upload.css">
</head>
<body>
<div class="container">
    <div class="box">
        <h1>이미지 업로드</h1>

        <form action="/upload/{id}" method="post" enctype="multipart/form-data">
            <input class="imageForm"type="file" name="file" accept="image/*" />
            <br /><br />
            <input type="text" name="id" placeholder="아이디를 입력하세요" />
            <br /><br />
            <input type="submit" value="업로드" />
        </form>
    </div>
</div>
</body>
</html>
