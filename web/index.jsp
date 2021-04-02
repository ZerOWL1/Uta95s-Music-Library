<%-- 
    Document   : index
    Created on : Feb 7, 2021, 4:33:28 PM
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
        <link href="css/cssIndex/cssIndex.css" rel="stylesheet" type="text/css"/>
        <link rel = "icon" type = "image/png" href = "images/logo/logo_home2.png">
    </head>
    <body>
        <%@include file="sourcesIndex/headerIndex.jsp" %>
        <div class="all-container">
            <%@include file="sourcesIndex/sectionIndex.jsp" %>
        </div>
            <%@include file="sourcesIndex/bodyIndex.jsp" %>
        <footer class="footer">
            <%@include file="sourcesIndex/footerIndex.jsp" %>
        </footer>
        <script>
            var checkSignup = ${warningSignup};
            if(checkSignup === 1){
                alert("Sign up success!! Please Login Again!");
            }
        </script>
    </body>
</html>