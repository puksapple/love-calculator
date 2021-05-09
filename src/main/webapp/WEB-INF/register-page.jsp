<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
.error{
color:red;
margin:left;
position:fixed;
}
</style>
<title>Insert title here</title>


</head>
<body>
<h1 align="center">Please Register</h1>
<form:form action="registerprocess" modelAttribute="ur">
<div align="center">

<p>
<label for="n">name:</label>
<form:input path="name" id="n"/>
<form:errors path="name" cssClass="error"></form:errors>
</p>
<p>
<label for="un">user name:</label>
<form:input path="userName" id="un"/><form:errors path="userName" cssClass="error"></form:errors>
</p>
<p>
<label for="p">password:</label>
<form:password path="password" id="p"/>
</p>
<p>
<label>country name:</label>
<form:select path="countryName">
<form:option value="India"></form:option>
<form:option value="Nepal"></form:option>
</form:select>
</p>
<p>

<label>hobbies:</label>
cricket<form:checkbox path="hobbies" value="cricket"/>
reading<form:checkbox path="hobbies" value="reading"/>
singing<form:checkbox path="hobbies" value="singing"/>
dancing<form:checkbox path="hobbies" value="dancing"/>
</p>
<p>
male:<form:radiobutton path="gender" value="male"/><br>
female:<form:radiobutton path="gender" vaue="female"/><br>
</p>
<p>
<label for="a">age</label>
<form:input id="a" path="age"/><form:errors path="age" cssClass="error"></form:errors>
</p>
<div>
<p>
<h2>communication channel:</h2>
<label for="e">email:</label>
<form:input id="e" path="com.email"/>

<label for="p">phone:</label>
<form:input id="p" path="com.phone"/>

<label for="d">date:</label>

<form:input id="d" path="date"/>
</p>
<div>
<input type="submit" value="register"/>

</div>




</form:form>
</body>
</html>