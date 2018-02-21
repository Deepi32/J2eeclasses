<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${100 < 200}
${100 lt 200}
${param.username}<br>
adding session expression as :${sessionScope.username}
Name saved in page as :${pageScope.Name}<br>
Name saved in page as :${requestScope.Name1}<br>
Name saved in page as :${sessionScope.Name2}<br>
Name saved in page as :${applicationScope.Name3}<br>
Name saved in page as :${applicationScope.Name8}<br> <!-- Name8 is not saved not getting any exception -->
email saved in cookie :${cookie["user.emailc"].value }<br>
dob saved in cookie :${cookie.dob.value}
</body>
</html>