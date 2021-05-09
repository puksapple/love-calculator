<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Please enter your card number and amount</h1>
<div align="center">
<form:form action="showCredit" modelAttribute="cr">
<label for="c">credit card number:</label>
<form:input path="creditNumber" id="c"/>
<label for="a">amount:</label>
<form:input path="amount" id="a"/>
<input type="submit" value ="proceed">
</form:form>
</div>
</body>
</html>