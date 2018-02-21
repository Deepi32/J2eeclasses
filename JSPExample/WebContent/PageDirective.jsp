<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page info="This page describes All Page directive attributes" %>
<%@ page buffer="16kb" %>
<%@ page isThreadSafe="false" %>
<%@ page session="false" %>  <!-- A new session is created can disable that using false   -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head><body>
<%  	ArrayList a1=new ArrayList();
		a1.add(12);
		a1.add("Deeps");
		a1.add(12.7);
		String msg=getServletInfo();%>
<%= "display information of a"+a1 %><br>
<%= "Displaying information is "+msg %>
</body>
</html>