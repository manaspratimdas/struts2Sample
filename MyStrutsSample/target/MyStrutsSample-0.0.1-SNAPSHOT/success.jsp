<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Success : 
<s:property value="myDisplay"/> :

<s:form action="demo/getMyAction">
	<s:textfield key="condition"></s:textfield>
	<s:submit></s:submit>
</s:form>
<s:property value="condition"/>
</body>
</html>