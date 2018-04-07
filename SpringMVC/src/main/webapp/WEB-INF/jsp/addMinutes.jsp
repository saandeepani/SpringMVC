<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- adding Form tags -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Minutes Page Executed!!</h1>

	Language:
	<a href="?languageInJsp=en">English</a> |
	<a href="?languageInJsp=tel">Telugu</a>
	<br>
	<br>
	<form:form commandName="excersiceForCommand">
		<table>
			<tr>
				<td><spring:message code="goal.text" /></td>
				<!-- <td>Minutes Excersice Today</td> -->
				<td><form:input path="minutes" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Enter Excersice">
				</td>
			</tr>
		</table>
	</form:form>

	<h1>Our Goal for the day is: ${goal.minutes}</h1>
</body>
</html>