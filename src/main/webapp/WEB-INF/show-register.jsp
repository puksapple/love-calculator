<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <!DOCTYPE web-app PUBLIC
	"-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
	"http://java.sun.com/dtd/web-app_2_3.dtd">

 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ page isELIgnored="false" %>
    

<html>
<head>

<title>Insert title here</title>
</head>
<body>
your name is ${ur.name}
<br>
Your gender is ${ur.gender}<br>
your pw is ${ur.password}
<br>
your country is${ur.countryName}
<br>
your hobbies is <c:forEach var="hobby" items="${ur.hobbies}">
${hobby}
</c:forEach>
<br>
your email is${ur.com.email }
<br>
your phone is${ur.com.phone }

<br>
your gender is ${ur.gender}
<br>
your date is${ur.date}
</body>
</html>