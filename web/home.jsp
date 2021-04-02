<%-- 
    Document   : home
    Created on : Feb 15, 2021, 3:54:41 PM
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
            <%@include file="sourcesHome/homeLeft.jsp" %>
            <%@include file="sourcesHome/homeRight.jsp" %>
            
        </div>
        <%@include file="sourcesHome/homeFooter.jsp" %>
        
        
        <script defer > window.onload = function(){ 
            setTimeout(function(){var chatJsElement = document.createElement("script"); 
                chatJsElement.src = "https://app.ohchat.net/clients/46427/code.php"; 
                chatJsElement.setAttribute("defer", "defer"); 
                document.getElementsByTagName("body")[0].appendChild(chatJsElement);}, 300) }; 
        
        
            var check = '${warning}';
            if (check === '1') {
                alert("Please Logout before Login new Account");
            }    
            var checkGuest = '${warningGuest}';
            if (checkGuest === '1') {
                alert("You must login or signup account!!");
            }    
        </script>
    </body>
</html>