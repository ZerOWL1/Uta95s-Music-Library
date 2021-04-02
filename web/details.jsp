<%-- 
    Document   : details
    Created on : Feb 18, 2021, 9:36:33 PM
    Author     : Ryuu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- require meta tag -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- title -->
        <title>UTA95S</title>
        <!-- bootstrap css -->

        <!-- css -->
        <link href="css/cssHome/cssHome.css" rel="stylesheet" type="text/css"/>
        <link rel = "icon" type = "image/png" href = "images/logo/logo_home2.png">
    </head>
    <body>
        <%@include file="sourcesHome/homeHeader.jsp" %>
        <div class="all-container">
            <%@include file="sourcesHome/homeDetails.jsp" %>
            <%@include file="sourcesHome/homeRight.jsp" %>
        </div>
            <%@include file="sourcesHome/homeFooter.jsp" %>
    </body>
</html>