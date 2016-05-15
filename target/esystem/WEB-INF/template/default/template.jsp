<%--
  Created by IntelliJ IDEA.
  User: coder
  Date: 10/17/15
  Time: 11:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<%
    final String context = request.getContextPath();
%>

<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href='<%= context%>/resources/css/bootstrap.min.css' rel='stylesheet' type='text/css'>
    <link href="<%= context%>/resources/font-awesome/css/font-awesome.css" rel="stylesheet">
    <link href="<%= context%>/resources/css/plugins/morris/morris-0.4.3.min.css" rel="stylesheet">
    <link href="<%= context%>/resources/css/plugins/timeline/timeline.css" rel="stylesheet">
    <link href="<%= context%>/resources/css/sb-admin.css" rel="stylesheet">
    <link href="<%= context%>/resources/css/plugins/dataTables/dataTables.bootstrap.css" rel="stylesheet">
    <link href="<%= context%>/resources/css/plugins/dataTables/dataTables.responsive.css" rel="stylesheet">


    <script src="<%= context%>/resources/js/jquery-1.10.2.js"></script>
    <script src="<%= context%>/resources/js/bootstrap.min.js"></script>
    <script src="<%= context%>/resources/js/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="<%= context%>/resources/js/plugins/morris/raphael-2.1.0.min.js"></script>
    <script src="<%= context%>/resources/js/plugins/morris/morris.js"></script>
    <script src="<%= context%>/resources/js/sb-admin.js" type="text/javascript"></script>

</head>
<body>
<div id="wrapper">

    <tiles:insertAttribute name="header"/>
    <tiles:insertAttribute name="menu"/>
    <tiles:insertAttribute name="body"/>
    <tiles:insertAttribute name="footer"/>
</div>

</body>
</html>
