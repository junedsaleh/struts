<%-- 
    Document   : Dashboard
    Created on : Nov 5, 2019, 10:57:23 AM
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
        <h1>Heyy Juned!!!</h1>
        <a href="view.action">View Data</a>
        <s:form action="delete">
        <s:textfield name="id" label="Enter ID"/>
        <s:submit value="delete"/>
        </s:form >
    </body>
</html>
