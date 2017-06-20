<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Login Page</title>
<!-- Adding CSS for Styling of error messages -->
<style type="text/css">
.errorDiv {
	background-color: gray;
	border: 1px solid black;
	width: 400px;
	margin-bottom: 8px;
}
</style>
</head>
<body>
	<h3>Welcome User, please login below</h3>
	<s:if test="hasActionErrors()">
		<div class="errorDiv">
			<s:actionerror />
		</div>
	</s:if>
	<s:form action="loginModelDriven">
		<s:textfield name="userID" label="User Name"></s:textfield>
		<s:textfield name="password" label="Password" type="password"></s:textfield>
		<s:submit value="Login"></s:submit>
	</s:form>
</body>
</html>