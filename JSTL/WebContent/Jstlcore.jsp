<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
	String str="hello";
%>
<c:out value="${'This is <b> response from JSTL'}" escapeXml="false"/><br>
<c:out value="${str}" default="value of name is null" />
<c:set var="name" value="deepanshu" scope="application"/>
<c:set var="name1" value="goyal" scope="application"/>
<c:remove var="name1"/>
<c:set var="count" value="100" scope="application" />
<c:set var="count1" value="110" scope="application"/>

<c:if test="${count<100}">
<c:out value="${'count is less than 100'}"/>
</c:if>
<c:if test="${count==100}">
<c:out value="${'value is equals to 100'}"></c:out>
</c:if>
<c:if test="${count>100}">
<c:out value="${'count is greater than 100'}"></c:out>
</c:if>
<br>

<c:choose>
<c:when test="${count1<100}">
<c:out value="${'switch value is less than 100' }"/>
</c:when>
<c:otherwise>
<c:out value="${'default case is working'}" />
</c:otherwise>
</c:choose>

<c:forEach var="count" begin="1" end="1" step="2">
<c:out value="${count}"/>
</c:forEach>
<A href="display.jsp">Display data</A>
</body>
</html>