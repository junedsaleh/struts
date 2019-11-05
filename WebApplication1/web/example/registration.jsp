<%-- 
    Document   : registration
    Created on : Nov 5, 2019, 10:52:01 AM
    Author     : juned
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

    <center>
        <h1>CRUD APP</h1>
        <hr>
        <s:form action="doRegistration">
            <s:textfield name="uname" label="Enter Username"/>
            <s:password name="pwd" label="Enter Password"/>
            <s:textfield name="email" label="Enter Email"/>
            <s:radio name="gender" list="{'Male','Female'}" label="Enter Gender"/>
            <s:select name="desig" list="{'Web Developer','UI'}" label="Select" /> 
            <s:checkboxlist list="{'cric','foor'}" name="hobbies" key="Hobbies"/>
            <s:submit value="Register"/>
        </s:form>
    </center>
</body>
</html>
