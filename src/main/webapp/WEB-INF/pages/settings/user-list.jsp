<%--
  Created by IntelliJ IDEA.
  User: coder
  Date: 10/17/15
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<% final String context = request.getContextPath();%>

<link href='<%= context%>/resources/css/plugins/dataTables/jquery.dataTables.min.css' rel='stylesheet' type='text/css'>

<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header"><spring:message code="users.page.header"/></h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
    <div class="row">
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">

                    </div>
                    <div class="panel-body">
                        <div class="table-responsive">

                            <table id="users" class="display">
                                <thead>
                                <tr>
                                    <th><spring:message code="users.table.user.name"/></th>
                                    <th><spring:message code="users.table.display.name"/></th>
                                    <th><spring:message code="users.table.email"/></th>
                                    <th><spring:message code="users.table.timezone"/></th>
                                    <th><spring:message code="users.table.active"/></th>
                                </tr>
                                </thead>
                            </table>
                        </div>
                        <!-- /.table-responsive -->
                    </div>
                    <!-- /.panel-body -->
                </div>
                <!-- /.panel -->
            </div>
            <!-- /.col-lg-12 -->
        </div>

    </div>
    <!-- /.row -->
</div>

<script src="<%= context%>/resources/js/plugins/dataTables/jquery.dataTables.js" type="text/javascript"></script>
<script src="<%= context%>/resources/js/plugins/dataTables/dataTables.bootstrap.js" type="text/javascript"></script>
<script src="<%= context%>/resources/js/dataTableDom.js" type="text/javascript"></script>
<script src="<%= context%>/resources/js/settings/admin-user.js" type="text/javascript"></script>

