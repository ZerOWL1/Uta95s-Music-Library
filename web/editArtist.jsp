<%-- 
    Document   : editArtist
    Created on : Mar 14, 2021, 7:31:57 PM
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
                                        <form action="confirmArt" method="post" class="tab-form profile-form">
                                            <div class="profileName tab-container">
                                                <div class="tab-wrong tab-input-content">
                                                    <p class="wrong">${checkArt}</p>
                                                </div>
                                                <div class="tab-input-content">
                                                    <input name="artID" class="tab-input" type="tel" name="profileName" value="${artist.idArtist}" readonly="" hidden=""/>
                                                </div>
                                                <div class="tab-input-content">
                                                    <h6>Artist Name</h6>
                                                    <input name="artName" class="tab-input" type="text" name="profileName" placeholder="${artist.nameArtist}" value="${artist.nameArtist}"/>
                                                </div>
                                                <div class="tab-input-content">
                                                    <h6>Artist Band</h6>
                                                    <input name="artBand" class="tab-input" type="text" name="profileName" placeholder="${artist.band}" value="${artist.band}"/>
                                                </div>
                                                <div class="tab-input-content">
                                                    <h6>Artist Spell Name</h6>
                                                    <input name="artSName" class="tab-input" type="text" name="profileName" placeholder="${artist.spellName}" value="${artist.spellName}"/>
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