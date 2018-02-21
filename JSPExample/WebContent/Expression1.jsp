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
	Cookie ck=new Cookie("user.emailc","deepi3242");
	response.addCookie(ck);
	Cookie ck1=new Cookie("dob","15-05-1990");
	response.addCookie(ck1);
%>
<A href="ExpressionLanguage.jsp">Get Cookie</A>
</body>
</html>