<%--
  Created by IntelliJ IDEA.
  User: coder
  Date: 10/17/15
  Time: 11:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>



<div id="page-wrapper">
  <div class="row">
    <div class="col-lg-12">
      <h1 class="page-header">Users</h1>
    </div>
    <!-- /.col-lg-12 -->
  </div>
  <!-- /.row -->
  <div class="row">
    <h1><fmt:message key="user.name.local"/> !</h1>
    <spring:message code="user.name.local" text="Employee Id" />
    <p><fmt:message key="now.time.on.server.is"/> ${serverTime}.</p>

    <p><fmt:message key="news.content"/></P>
  </div>
  <!-- /.row -->
</div>
