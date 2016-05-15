<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: coder
  Date: 10/23/15
  Time: 9:50 PM
  To change this template use File | Settings | File Templates.
--%>
Dear <strong>${user}</strong>, You are not authorized to access this page
<a href="<c:url value="/logout" />">Logout</a>
