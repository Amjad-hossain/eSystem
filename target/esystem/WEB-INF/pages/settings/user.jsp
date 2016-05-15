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
                    <spring:message code="user.label" />
                </div>
                <div class="panel-body">
                    <div class="row">
                        <div class="col-lg-6">

                            <spring:message code="user.email.label" var="email"/>
                            <spring:message code="user.email.example" var="emailExample"/>
                            <spring:message code="user.display.name.label" var="displayName"/>
                            <spring:message code="user.display.name.example" var="displayNameExample"/>
                            <spring:message code="user.username.label" var="username"/>
                            <spring:message code="user.name.example" var="usernameExample"/>

                            <spring:message code="user.language.label" var="lang"/>
                            <spring:message code="user.language.example" var="langExample"/>
                            <spring:message code="user.time.zone.label" var="timeZone"/>
                            <spring:message code="user.time.zone.example" var="timeZoneExample"/>

                            <spring:message code="user.password.label" var="password"/>

                            <spring:message code="save.button.label" var="saveBtnLbl"/>
                            <spring:message code="reset.button.label" var="resetBtnLbl"/>

                            <form:form role="form" method="POST" modelAttribute="user">

                                <div class="form-group">
                                    <form:label path="email">${email}</form:label>
                                    <form:input path="email" cssClass="form-control" placeholder="${email}" />
                                    <p class="help-block">${emailExample}</p>
                                </div>

                                <div class="form-group">
                                    <form:label path="displayName">${displayName}</form:label>
                                    <form:input path="displayName" cssClass="form-control" placeholder="${displayName}" />
                                    <p class="help-block">${displayNameExample}</p>
                                </div>

                                <div class="form-group">
                                    <form:label path="userName">${username}</form:label>
                                    <form:input path="userName" cssClass="form-control" placeholder="${username}" />
                                    <p class="help-block">${usernameExample}</p>
                                </div>

                                <div class="form-group">
                                    <form:label path="password">${password}</form:label>
                                    <form:input path="password" cssClass="form-control" placeholder="${password}" />
                                </div>

                                <div class="form-group">
                                    <form:label path="language">${lang}</form:label>
                                    <form:input path="language" cssClass="form-control" placeholder="${lang}" />
                                    <p class="help-block">${langExample}</p>
                                </div>

                                <div class="dropdown">
                                    <form:label path="timeZone">${timeZone}</form:label>
                                    <form:select path="timeZone" cssClass="form-control" placeholder="${timeZone}" items="${timeZoneList}"/>
                                    <p class="help-block">${timeZoneExample}</p>
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
