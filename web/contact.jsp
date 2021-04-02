<%-- 
    Document   : contact
    Created on : Mar 8, 2021, 2:41:28 PM
    Author     : Ryuu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- require meta tag -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- title -->
        <title></title>
        <!-- bootstrap css -->

        <!-- css -->
        <link href="css/cssContact/cssContact.css" rel="stylesheet" type="text/css"/>
        <link rel = "icon" type = "image/png" href = "images/logo/logo_home2.png">
    </head>
    <body>
        <%@include file="sourcesHome/homeHeader.jsp" %>
        <div class="all-container">
            <%@include file="sourcesContact/contactDetails.jsp" %>
        </div>
            <%@include file="sourcesHome/homeFooter.jsp" %>
    </body>
</html>