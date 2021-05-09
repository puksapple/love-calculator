<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red; position fixed;
	margin-left: 10px;
}
</style>
</head>
<body>

	<div align="center">
		<h1>HI,${UserInfo.userName}</h1>
		<h2>send result to your Email</h2>

		<form:form action="emailProcess" modelAttribute="ue">
			<label for="e">your email address</label>
			<form:input path="email" id="e" />



			<input type="submit" value="send">
			<form:errors path="email" cssClass="error"></form:errors>
		</form:form>
	</div>
</body>
</html>