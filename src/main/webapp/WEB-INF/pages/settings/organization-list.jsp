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
            <h1 class="page-header"><spring:message code="role.label"/></h1>
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
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="table-responsive">
                            <table id="orgs" class="display">
                                <thead>
                                <tr>
                                    <th><spring:message code="organization.name.label"/></th>
                                    <th><spring:message code="organization.desp.label"/></th>
                                    <th><spring:message code="organization.type.label"/></th>
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
<script src="<%= context%>/resources/js/settings/admin-org.js" type="text/javascript"></script>

<%--
<script>

    $(document).ready(function() {
        $('#orgs').DataTable( {

            "processing": true,
            "serverSide": true,
            "ajax": "./orgs.do",
            "columns": [
                { "data": "name" },
                { "data": "desp" },
                { "data": "type" }
            ]
        } );
    } );
</script>--%>
