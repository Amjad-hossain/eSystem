<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: coder
  Date: 10/23/15
  Time: 9:46 PM
  To change this template use File | Settings | File Templates.
--%>

Dear <strong>${user}</strong>, Welcome to Home Page.
<a href="<c:url value="/logout" />">Logout</a>