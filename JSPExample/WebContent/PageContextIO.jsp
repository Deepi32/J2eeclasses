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
	pageContext.setAttribute("Name","Deepanshu",PageContext.PAGE_SCOPE);
	pageContext.setAttribute("Name1","Deepanshi",PageContext.REQUEST_SCOPE);
	pageContext.setAttribute("Name2","Arshi",PageContext.SESSION_SCOPE);
	pageContext.setAttribute("Name3","Ram",PageContext.APPLICATION_SCOPE);

%>

</body>
</html>