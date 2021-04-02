<%-- 
    Document   : homeRight
    Created on : Feb 15, 2021, 9:28:56 PM
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
        <link href="css/cssHome/homeRight.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="right">


            <!--categories-->
            <div class="categories">
                <div class="cate-container">
                    <div class="cate-title">
                        <p class="title">Categories</p>
                    </div>
                </div>
                <div class="card">
                    <h5 class="card-header">
                        <a href="home" style="text-decoration: none; color: #fafafa;">🔥 All categories here!! 🔥</a>
                    </h5>
                    <div class="card-body">
                        <div class="cate-box row">
                            <c:forEach items="${listGenre}" var="listG">
                                <div class="cate-sm-box btn ${tag == listG.idGenre ? "bg-dark":""}">
                                    <a href="category?cid=${listG.idGenre}">${listG.name}</a>
                                </div>
                            </c:forEach>

                            <!--example-->
                            <!--                            <div class="cate-sm-box">
                                                            <a href="#">Cate 2</a>
                                                        </div>
                                                        <div class="cate-sm-box">
                                                            <a href="#">Cate 3</a>
                                                        </div>
                                                        <div class="cate-sm-box">
                                                            <a href="#">Cate 4</a>
                                                        </div>-->
                        </div>
                        <div class="img">
                            <img src="images/rightbar_icon/gamezone.png" alt=""/>
                        </div>
                    </div>
                </div>
            </div>

            <!--Guide-->
            <div class="right-container">
                <div class="guide">
                    <div class="guide-container">
                        <p class="guide-title">Guide&nbspFor&nbspNew&nbspUsers</p>
                    </div>
                </div>
                <div class="card">
                    <a href="#" ><h5 class="card-header">
                            find all guide here!
                        </h5></a>
                    <div class="card-body">
                        <div class="img">
                            <img src="images/bg/4.jpg" alt=""/>
                        </div>
                        <div class="card-content">
                            <h5 class="card-title">Download Guide</h5>
                            <p class="card-text">
                                Zippyshare 403 Forbidden Links, need a free vpn to download in some countries.
                            </p>
                            <p class="card-text">
                                Be-Drive Server dont exits Anymore, feel free to report this links.
                            </p>
                        </div>
                    </div>
                </div>
            </div>

            <!--top season-->
            <div class="top-ss-container">
                <div class="top-ss">
                    <div class="ss-container">
                        <p class="ss-title">Music&nbspWinter&nbsp2021</p>
                    </div>
                </div>
                <div class="card">
                    <a href="#" ><h5 class="card-header">
                            all winter music here!
                        </h5></a>
                    <div class="card-body">
                        <div class="img">
                            <img src="images/gif/winter_season.gif" alt=""/>
                        </div>
                    </div>
                </div>
            </div>

            <!--season music-->
            <div class="season-container">
                <div class="top-ss">
                    <div class="ss-container">
                        <p class="ss-title">Anime&nbspSeasonal&nbspMusic</p>
                    </div>
                </div>
                <div class="card">
                    <h5 class="card-header">
                        all season music here!
                    </h5>
                    <div class="card-body">
                        <!--autumn-->
                        <a href="#" class="autumn">
                            <div class="img-title">
                                <h2 class="title">Autumn</h2>
                            </div>
                            <div class="img">
                                <img src="images/season_list/autumn.png" alt=""/>
                            </div>
                        </a>
                        <hr/>
                        <!--spring-->
                        <a href="#" class="summer">
                            <div class="img-title">
                                <h2 class="title">Summer</h2>
                            </div>
                            <div class="img">
                                <img src="images/season_list/summer.png" alt=""/>
                            </div>
                        </a>
                        <hr/>
                        <!--summer-->
                        <a href="#" class="spring">
                            <div class="img-title" >
                                <h2 class="title">Spring</h2>
                            </div>
                            <div class="img">
                                <img src="images/season_list/spring.png" alt=""/>
                            </div>
                        </a>
                        <hr/>
                        <!--winter-->
                        <a href="#"  class="winter">
                            <div class="img-title">
                                <h2 class="title">Winter</h2>
                            </div>
                            <div class="img">
                                <img src="images/season_list/winter.png" alt=""/>
                            </div>
                        </a>
                    </div>
                </div>
            </div>

            <!--social list-->
            <div class="social-container">
                <div class="social">
                    <div class="social-title">
                        <p class="title">Updated&nbspSocial&nbspMedia</p>
                    </div>
                </div>
                <div class="card">
                    <h5 class="card-header">
                        Stay Updated with the Social Media
                    </h5>
                    <div class="card-body">
                        <div class="social-box fb-icon">
                            <a href="https://www.facebook.com/groups/uta95s">
                                <div class="box"><i class="fab fa-facebook-f"></i></div>
                            </a> 
                            <div class="block-box"></div>
                            <div class="box-after fb-after">Like</div>
                        </div>
                        <div class="social-box tw-icon">
                            <a href="#">
                                <div class="box "><i class="fab fa-twitter"></i></div>
                            </a>
                            <div class="block-box"></div>
                            <div class="box-after tw-after">Follow</div>
                        </div>
                        <div class="social-box dc-icon">
                            <a href="https://discord.gg/vbtRkSn">
                                <div class="box"><i class="fab fa-discord"></i></div>
                            </a>
                            <div class="block-box"></div>
                            <div class="box-after dc-after">Join</div>
                        </div>
                    </div>
                </div>
            </div>


            <!--view list-->
            <div class="view-container">
                <div class="view">
                    <div class="view-title">
                        <p class="title">Viewer&nbsp;Page</p>
                    </div>
                </div>
                <div class="card">
                    <div class="card-images">
                        <img src="images/rightbar_icon/polygon.png" alt=""/>
                    </div>
                    <div class="card-body">
                        <div class="card-page-counter" style="display: block;">
                            <span class="card-page-counter-item">${view}</span>
                        </div>
                    </div>
                </div>
            </div>




        </div>
        <!--bootstrap-->
        <script src="https://kit.fontawesome.com/c41956cca0.js" crossorigin="anonymous"></script>
    </body>
</html>