<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>HELLO I am jsp page</h1>
<p>
hello this is paragraph
</p>
<!-- Scriptlet tag -->
<%
	int a=100;
	if(a<=100)
		out.println("output is"+a);
	message();
	
%>
<!-- Declaration tag -->

<%!
	int a=100;
	void message()
	{
		
		System.out.println("hello i am 100"+a);
	}

%>
<!--Expression tsg  -->
<%=
	"This is expression tag that i am declaring"
%>
</body>
</html>