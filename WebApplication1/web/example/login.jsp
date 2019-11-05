<%-- 
    Document   : login
    Created on : Nov 5, 2019, 11:31:22 AM
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
         <s:form action="doLogin">
            <s:textfield name="uname" label="Username"/>
            <s:textfield name="pwd" label="Password"/>
            <s:submit value="Login"/>            
        </s:form>
    </body>
</html>
