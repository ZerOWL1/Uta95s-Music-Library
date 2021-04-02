<%-- 
    Document   : homeHeader
    Created on : Feb 15, 2021, 3:55:19 PM
    Author     : Ryuu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- require meta tag -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- title -->
        <title></title>
        <!-- bootstrap css -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" 
              rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
              crossorigin="anonymous">
        <!-- css -->
        <link href="css/cssHome/homeHeader.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header>
            <nav class="navbar navbar-expand-lg navbar-dark fixed-top">
                <div class="container-fluid">
                    <a class="navbar-brand" href="home">
                        <img class="logo" src="images/logo/logo_home.png" alt="logo"/>
                        <h4 class="title-logo">Uta95s</h4>
                    </a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="home" >
                                    <i class="fas fa-home"></i>Home
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#" id="categOptions" 
                                   role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                    <i class="fas fa-list"></i>
                                    Categories</a>
                                <ul class="dropdown-menu" aria-labelledby="categOptions">
                                    <c:forEach items="${listGenre}" var="listG">
                                        <li><a class="dropdown-item" href="category?cid=${listG.idGenre}">${listG.name}</a></li>
                                        </c:forEach>
                                </ul>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">
                                    <i class="fas fa-headphones-alt"></i>
                                    Album</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#" id="accountOptions" 
                                   role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                    <i class="fas fa-user-circle"></i>
                                    Account</a>
                                <ul class="dropdown-menu" aria-labelledby="accountOptions">
                                    <c:if test="${sessionScope.acc.isUser == 1}">
                                    <li><a class="dropdown-item" href="manage">Profile</a></li>
                                    </c:if>
                                    <c:if test="${sessionScope.acc.isAdmin == 1}">
                                    <li><a class="dropdown-item" href="manage">Manager Albums</a></li>
                                    </c:if>
                                    
                                    
                                    <li><hr class="dropdown-divider"></li>
                                    
                                    
                                    <li><a class="dropdown-item">Welcome ${sessionScope.acc.name}</a></li>
                                        <c:if test="${sessionScope.acc != null}">
                                        <li><a class="dropdown-item btn" href="logout">Logout</a></li>
                                        </c:if>
                                        <c:if test="${sessionScope.acc == null}">
                                        <li><a class="dropdown-item btn" href="logout">Login</a></li>
                                        </c:if>
                                </ul>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link " href="#" id="navbarDropdown" 
                                   role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                    <i class="fas fa-chevron-circle-down"></i>
                                    More
                                </a>
                                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                    <li><a class="dropdown-item" href="#aboutU">About</a></li>
                                    <li><a class="dropdown-item" href="contact">Contact Us</a></li>
                                    <li><hr class="dropdown-divider"></li>
                                    <li><a class="dropdown-item" href="#">Forums</a></li>
                                </ul>
                            </li>
                        </ul>
                        <form action="search" class="d-flex" method="post">
                            <input class="form-control me-1" 
                                   value="${searchNa}"
                                   type="search" 
                                   placeholder="Search" 
                                   aria-label="Search"
                                   name="txt">
                            <button class="btn btn btn-outline-info" type="submit">
                                <i class="fas fa-search"></i>
                            </button>
                        </form>
                    </div>
                </div>
            </nav>
        </header>




        <script>
            window.addEventListener("scroll", function () {
                var header = document.querySelector("header");
                header.classList.toggle("sticky", window.scrollY > 0);
            });
        </script>
        <!--bootstrap js-->
        <script src="https://kit.fontawesome.com/c41956cca0.js" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" 
        integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
    </body>
</html>