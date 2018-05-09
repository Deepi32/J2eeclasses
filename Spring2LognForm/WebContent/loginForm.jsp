<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:form commandName="Lc" method="post" action="login.jft">
NAME:<form:input path="username" />
PASSWORD:<form:input path="password" />
<input type="submit" title="loginnow" />
</form:form>