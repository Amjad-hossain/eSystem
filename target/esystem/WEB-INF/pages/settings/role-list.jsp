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
              <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                <thead>
                <tr>
                  <th><spring:message code="role.name.label"/></th>
                  <th><spring:message code="role.desp.label" /></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="role" items="${roles}">
                  <tr class="odd gradeA">
                    <td><c:out value="${role.name}"/></td>
                    <td><c:out value="${role.desp}"/></td>
                  </tr>
                </c:forEach>
                </tbody>
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

<script src="${pageContext.request.contextPath}/resources/js/plugins/dataTables/jquery.dataTables.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/js/plugins/dataTables/dataTables.bootstrap.js" type="text/javascript"></script>


<script>
  $(document).ready(function () {
    $('#dataTables-example').dataTable();
  });
</script>
