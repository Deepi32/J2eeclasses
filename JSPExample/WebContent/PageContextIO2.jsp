<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	String name=(String)pageContext.getAttribute("Name");
	String name1=(String)pageContext.getAttribute("Name1");
	String name2=(String)pageContext.getAttribute("Name2");
	String name3=(String)pageContext.getAttribute("Name3");


%>
<%="name from page is "+name%><br>
<%="name from request is "+name1%><br>
<%="name from session is "+name2%><br>
<%="name from application is "+name3%><br>
</body>
</html>