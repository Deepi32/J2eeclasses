<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url value="/index.jsp" var="link">
<c:param name="id" value="109"/>
<c:param name="name" value="deepansi"/>
</c:url>
${link }

<c:import url="/index.jsp" var="mydata" />
<c:out value="${mydata }" escapeXml="false"/>
<A href="display.java">Display</A>
</body>
</html>