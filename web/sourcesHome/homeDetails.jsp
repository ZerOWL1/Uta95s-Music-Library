<%-- 
    Document   : homeDetails
    Created on : Feb 18, 2021, 9:13:14 PM
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
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/aplayer/1.10.1/APlayer.min.css" 
              integrity="sha512-CIYsJUa3pr1eoXlZFroEI0mq0UIMUqNouNinjpCkSWo3Bx5NRlQ0OuC6DtEB/bDqUWnzXc1gs2X/g52l36N5iw==" 
              crossorigin="anonymous" />
        <!-- css -->
        <link href="css/cssHome/homeDetails.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <div class="left">
            <div class="lateCD">
                <div class="lateCD-title">
                    <div class="cd-container">
                        <p class="altitle">Details&nbspCDs/Music</p>
                    </div>
                </div>

                <!--single details-->
                <div class="album-container py-3">
                    <div class="card-container row ">
                        <div class="card-content ms-3 me-3" style="width: 50rem;">
                            <div href="" class="card-img">
                                <div class="img">
                                    <img src="${detail.AImg_path}" class="" alt="...">
                                </div>
                            </div>
                            <div class="song-title">
                                <div class="song-content">
                                    <p class="song-album">
                                        <strong>Tracklist:</strong>
                                    </p>

                                    <p class="song-name">
                                    <form action="" method="post">
                                        <c:forEach items="${sByAlID}" var="sAlID">
                                            <strong>${sAlID.name}</strong>
                                            <c:if test="${sessionScope.acc.isUser == 1 or sessionScope.acc.isAdmin == 1}">
                                                <a onclick="addFavol()" href="addFavol?idS=${sAlID.songID}" ><i class="fas fa-folder-plus text-dark h5" ></i></a>
                                                </c:if>
                                            <hr/>
                                        </c:forEach>

                                    </form>
                                </div>
                            </div>
                        </div>
                        <!--Music Player-->
                        <div class="a-player">
                            <div id="aplayer"></div>
                        </div>
                        <div class="album-title">
                            <h3>
                                <strong>
                                    ${detail.name} – ${abc}
                                    <br/>
                                </strong>
                            </h3>
                        </div>
                    </div>
                </div>


                <!--youtube video player-->
                <c:if test="${!(MVPath eq '' or MVPath eq null)}">
                    <div class="pin-note py-3">
                        <div class="yt-container row">
                            <p class="pin-text">
                                <strong>Uta95s - Album's songs Video - Watch in [<a href="https://youtu.be/${MVPath}">Youtube</a>]</strong>
                            </p>
                            <div class="yt-content ms-3 me-3 mb-3" style="width: 50rem;">
                                <div class="card-img">
                                    <div class="yt-video">
                                        <iframe class="yt-frame" width="100%" height="100%"
                                                src="https://www.youtube.com/embed/${MVPath}">
                                        </iframe>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:if>


                <!--pin note-->
                <div class="pin-note py-3">
                    <div class="pin-container row ">
                        <p class="pin-text">
                            <strong>Uta95s - Buy the original support the artist - Copyright issues [<a href="#aboutU">Contact Us</a>]</strong>
                        </p>
                        <div class="pin-content ms-3 me-3 mb-3" style="width: 50rem;">
                            <div href="#" class="card-img">
                                <div class="img">
                                    <img src="images/rightbar_icon/cashino.png" alt=""/>
                                </div>
                            </div>
                            <div class="song-title">
                                <div class="song-content py-3">
                                    <div class="song-box">
                                        <a href="https://www.amazon.com/music" ><img src="images/logo music/amazon.png" alt="amazon"/></a>
                                    </div>
                                    <div class="song-box">
                                        <a href= "https://www.cdjapan.co.jp/" ><img src="images/logo music/cdjp.png" alt="cdjp"/></a>
                                    </div>
                                    <div class="song-box">
                                        <a href= "https://www.apple.com/music/" ><img src="images/logo music/itune.png" alt="itune"/></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>


                <!--fb cmt-->
                <div class="fb-cmt py-3">
                    <div class="pin-container row ">
                        <div class="pin-content ms-3 me-3 mb-3" style="width: 50rem;">
                            <p class="pin-text">
                                <strong>Let's us know your opinions below. Even report music links.</strong>
                            </p>
                            <div href="#" class="card-img">
                                <div class="img">
                                    <%--fb comment plugin--%>
                                    <div class="facebook-comment mt20" style="background-color: white;">
                                        <div class="fb-comments" 
                                             data-href="https://www.facebook.com/ZerOwl1/posts/1987719038060728" 
                                             data-width="360" data-numposts="100"  data-height="100px"
                                             data-mobile="true"
                                             style="vertical-align: bottom; width: 100%; height: 100%;"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>       
        </div>

        <div id="fb-root"></div>




        <script async defer src="https://connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.6"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/aplayer/1.10.1/APlayer.min.js" 
                integrity="sha512-RWosNnDNw8FxHibJqdFRySIswOUgYhFxnmYO3fp+BgCU7gfo4z0oS7mYFBvaa8qu+axY39BmQOrhW3Tp70XbaQ==" 
        crossorigin="anonymous"></script>

        <script>
                                                    const ap = new APlayer({
                                                        container: document.getElementById('aplayer'),
                                                        listFolded: true,
                                                        autoplay: false,
                                                        loop: 'all',
                                                        order: 'random',
                                                        theme: '#FADFA3',
                                                        audio: [
            <c:forEach items="${sByAlID}" var="s">
                                                            {
                                                                name: '${s.name}',
                                                                artist: '${s.idArtist}',
                                                                url: '${s.song_path}',
                                                                cover: '${s.img_path}'
                                                            },
            </c:forEach>
                                                        ]
                                                    });


                                                    function addFavol() {
                                                        alert("Please check again your Favorites");
                                                    }
        </script>
    </body>
</html>