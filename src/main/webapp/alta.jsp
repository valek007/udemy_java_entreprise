<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="contacto" class="principal.p5_mvc.beans.Contacto" scope="request"/>
	<jsp:setProperty property="*" name="contacto"/>
</body>
</html>