<%-- 
    Document   : editSong
    Created on : Mar 14, 2021, 3:17:05 PM
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
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <!-- css -->
        <link href="css/cssHome/homeAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="css/cssUser/allManager.css" rel="stylesheet" type="text/css"/>
        <link href="css/cssUser/cssUser.css" rel="stylesheet" type="text/css"/>
        <link rel = "icon" type = "image/png" href = "images/logo/logo_home2.png">
    </head>
    <body>
        <%@include file="sourcesHome/homeHeader.jsp" %>
        <div class="all-container">
            <div class="left">
                <div class="lateCD">
                    <div class="lateCD-title">
                        <div class="cd-container">
                            <p class="altitle">ALL&nbsp;OPTIONS</p>
                        </div>
                    </div>

                    <!--single details-->
                    <div class="album-container py-3">
                        <div class="card-container row ">
                            <div class="d-flex align-items-start navtab">
                                <div class="nav flex-column nav-pills me-3" id="v-pills-tab" role="tablist" aria-orientation="vertical">
                                    <button class="nav-link active" id="v-pills-profile-tab" data-bs-toggle="tab" data-bs-target="#v-pills-profile" type="button" role="tab"  aria-selected="true"><i class="fas fa-edit"></i>Edit</button>
                                </div>
                                <div class="tab-content" id="v-pills-tabContent">

                                    <!--tab profile-->
                                    <div class="tab-pane fade show active tab-panel" id="v-pills-profile" role="tabpanel" >
                                        <form action="confirmS" method="post" class="tab-form profile-form">
                                            <div class="profileName tab-container">
                                                <div class="tab-wrong tab-input-content">
                                                    <p class="wrong">${checkS}</p>
                                                </div>
                                                <div class="tab-input-content">
                                                    <input name="idS" class="tab-input" type="tel" name="profileName" value="${song.songID}" readonly="" hidden=""/>
                                                </div>
                                                <div class="tab-input-content">
                                                    <h6>Song Name</h6>
                                                    <input name="nameS" class="tab-input" type="text" name="profileName" placeholder="${song.name}" value="${song.name}"/>
                                                </div>
                                                <div class="tab-input-content">
                                                    <h6>Song Release</h6>
                                                    <input name="relS" class="tab-input" type="text" name="profileName" placeholder="${song.release}" value="${song.release}"/>
                                                </div>
                                                <div class="tab-input-content">
                                                    <h6>Album</h6>
                                                    <select name="idAlbumS"  class="form-select" required="">
                                                        <c:forEach items="${albM}" var="alb">
                                                            <option ${song.idAlbum eq alb.idAlbum?"selected ":""} value="${alb.idAlbum}">${alb.name}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                                <div class="tab-input-content">
                                                    <h6>Artist</h6>
                                                    <select name="idArtistS"  class="form-select" required="">
                                                        <c:forEach items="${artM}" var="art">
                                                            <option ${song.idArtist eq art.idArtist?"selected ":""} value="${art.idArtist}">${art.nameArtist}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                                <div class="tab-input-content">
                                                    <h6>Genre</h6>
                                                    <select name="genreS"  class="form-select" required="">
                                                        <c:forEach items="${genreM}" var="gen">
                                                            <option ${song.idGenre eq gen.idGenre?"selected ":""} value="${gen.idGenre}">${gen.name}</option>
                                                        </c:forEach>   
                                                    </select>
                                                </div>
                                                <div class="tab-input-content">
                                                    <h6>MV_path</h6>
                                                    <input name="mv_path" class="tab-input" type="text" name="profileName" placeholder="${song.mv_path}" value="${song.mv_path}"/>
                                                </div>
                                                <div class="tab-input-content">
                                                    <h6>Song_path</h6>
                                                    <input name="song_path" class="tab-input" type="text" name="profileName" placeholder="${song.song_path}" value="${song.song_path}"/>
                                                </div>
                                                <div class="tab-input-content">
                                                    <h6>Img_path</h6>
                                                    <input name="img_path" class="tab-input" type="text" name="profileName" placeholder="${song.img_path}" value="${song.img_path}"/>
                                                </div>

                                            </div>
                                            <center><input class="tab-submit" type="submit" value="Change Data"></center>
                                        </form>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>       
            </div>
        </div>
        <%@include file="sourcesHome/homeFooter.jsp" %>
    </body>
</html>