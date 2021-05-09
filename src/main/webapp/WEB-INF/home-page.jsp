<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <!DOCTYPE web-app PUBLIC
	"-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
	"http://java.sun.com/dtd/web-app_2_3.dtd">
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title>Love Calc</title>
<style type="text/css">
.error{
color:red;
position: fixed;
text-align:left;
margin-left: 30px;
}

</style>
</head>
<body >
<h1 align="center">LoveCalculator</h1>
<hr>

<form:form action="showResult" modelAttribute="UserInfo">
<div align="center">

<p>
<label for="yn">your name:</label>
<form:input id="yn" path="userName"/>
<form:errors path="userName" cssClass="error"></form:errors>

</p>

<p>
<label for="cn">crush name:</label>
<form:input id="cn" path="crushName"/>
<form:errors path="crushName" cssClass="error"></form:errors>

</p>

<p>
<form:checkbox path="termsAndCondition"/>
<label>i agree terms and condition its for fun</label>
<form:errors path="termsAndCondition" cssClass="error"></form:errors>
</p>
<input type="submit" value="calculate">
</div>
</form:form>

</body>
</html>