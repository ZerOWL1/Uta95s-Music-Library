<%-- 
    Document   : homeLeft
    Created on : Feb 15, 2021, 9:29:05 PM
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
        <link href="css/cssHome/homeLeft.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="left">
            <div class="lateCD">
                <div class="lateCD-title">
                    <div class="cd-container">
                        <p class="altitle">Lastest&nbspCDs/Music</p>
                    </div>
                </div>
                <div class="album-container py-3">
                    <div class="card-container row ">
                        <!--card here-->
                        <c:forEach items="${allAl}" var="al">
                            <div class="card-content ms-3 me-3 mb-3" style="width: 20rem;">
                                <a href="detail?aid=${al.idAlbum}" class="card-img">
                                    <div class="img">
                                        <img src="${al.AImg_path}" class="" alt="...">
                                    </div>
                                    <div class="card-name">
                                        <h3 class="">${al.name}</h3>
                                    </div>
                                </a>
                                <div class="card-date">
                                    ${al.date}
                                </div>
                                <div class="card-excerpt">
                                    Upcoming Music [Anime] Winter / Invierno 2021 Calendar | Release Dates
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>




                <!--off set-->
                <div class="clearfix">
                    <ul class="pagination">
                        <li class="page-item">
                            <a href="
                               <c:if test="${index>1}">
                                   <c:if test="${!isCategory}">
                                       home?index=${index-1}   
                                   </c:if>
                                   <c:if test="${isCategory}">
                                       home?index=${index-1}&cid=${cid}
                                   </c:if>
                               </c:if>" class="page-link prev">< Prev
                            </a>
                        </li>

                        <c:forEach begin="1" end="${endP}" var="i">
                            <c:if test = "${!isCategory}">
                                <li class="page-item">                            
                                    <a class="pageNumber ${i == index?"active":""} page-link" href="home?index=${i}">${i}</a>
                                </li>
                            </c:if>
                            <c:if test = "${isCategory}">
                                <li class="page-item">                            
                                    <a class="pageNumber ${i == index?"active":""} page-link" href="home?index=${i}&cid=${cid}">${i}</a>
                                </li>
                            </c:if>
                        </c:forEach>

                        <li class="page-item">
                            <a href="
                               <c:if test="${index<endP}">
                                   <c:if test="${!isCategory}">
                                       home?index=${index+1}
                                   </c:if>
                                   <c:if test="${isCategory}">
                                       home?index=${index+1}&cid=${cid}
                                   </c:if>
                               </c:if>" class="page-link next">Next >
                            </a>
                        </li>
                    </ul>
                </div>

            </div>
        </div>
    </body>
</html>