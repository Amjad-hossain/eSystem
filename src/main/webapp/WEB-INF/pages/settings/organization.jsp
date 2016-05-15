<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%--
  Created by IntelliJ IDEA.
  User: coder
  Date: 10/25/15
  Time: 9:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="page-wrapper">
  <div class="row">
    <div class="col-lg-8">
      <h1 class="page-header"></h1>
    </div>
    <!-- /.col-lg-12 -->
  </div>
  <!-- /.row -->
  <div class="row">
    <div class="col-lg-8">
      <div class="panel panel-default">
        <div class="panel-heading">
          <spring:message code="organization.label"/>
        </div>
        <div class="panel-body">
          <div class="row">
            <div class="col-lg-6">

              <spring:message code="organization.name.label" var="orgName"/>
              <spring:message code="organization.name.example" var="orgNameExample"/>
              <spring:message code="organization.desp.label" var="orgDesp"/>
              <spring:message code="organization.desp.example" var="orgDespExample"/>

              <spring:message code="save.button.label" var="saveBtnLbl"/>
              <spring:message code="reset.button.label" var="resetBtnLbl"/>

              <form:form role="form" method="POST" modelAttribute="organization">

                <div class="form-group">
                  <form:label path="name">${orgName}</form:label>
                  <form:input path="name" cssClass="form-control" placeholder="${orgName}"/>
                  <p class="help-block">${orgNameExample}</p>
                </div>

                <div class="form-group">
                  <form:label path="desp">${orgDesp}</form:label>
                  <form:input path="desp" cssClass="form-control"
                              placeholder="${orgDesp}"/>
                  <p class="help-block">${orgDespExample}</p>
                </div>

                <button type="submit" class="btn btn-default">${saveBtnLbl}</button>
                <button type="reset" class="btn btn-default">${resetBtnLbl}</button>
              </form:form>
            </div>

          </div>
          <!-- /.row (nested) -->
        </div>
        <!-- /.panel-body -->
      </div>
      <!-- /.panel -->
    </div>
    <!-- /.col-lg-12 -->
  </div>
  <!-- /.row -->
</div>
