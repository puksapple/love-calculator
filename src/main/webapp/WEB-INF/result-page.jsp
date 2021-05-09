<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@ page isELIgnored="false" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>prediction</title>
</head>
<body>
<h1>love calculation prediction:</h1><br>
 ${UserInfo.userName} and  ${UserInfo.crushName} are:
 <br>
 ${UserInfo.appResult}

<br>
<a href="showEmail">send result to email</a>
</body>
</html>