
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
        <!--        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" 
                      rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
                      crossorigin="anonymous">-->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <!-- css -->
        <link href="css/cssHome/homeAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="css/cssUser/allManager.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
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
                                <c:if test="${sessionScope.acc.isUser == 1}">
                                    <button class="nav-link profileM " id="v-pills-profile-tab" data-bs-toggle="tab" data-bs-target="#v-pills-profile" type="button" role="tab"  aria-selected="false"><i class="fas fa-id-card"></i>Profile</button>
                                </c:if>
                                <c:if test="${sessionScope.acc.isUser == 1 or sessionScope.acc.isAdmin == 1}">
                                    <!--<button class="nav-link badgeM " id="v-pills-badge-tab" data-bs-toggle="tab" data-bs-target="#v-pills-badge" type="button" role="tab"  aria-selected="false"><i class="fas fa-id-badge"></i>Badges</button>-->
                                    <button class="nav-link favoriteM " id="v-pills-favorite-tab" data-bs-toggle="tab" data-bs-target="#v-pills-favorite" type="button" role="tab"  aria-selected="false"><i class="fas fa-star"></i>Favorites</button>
                                </c:if>
                                <c:if test="${sessionScope.acc.isAdmin == 1}">

                                    <button class="nav-link userM" id="v-pills-userM-tab" data-bs-toggle="tab" data-bs-target="#v-pills-userM" type="button" role="tab"  aria-selected="false"><i class="fas fa-users-cog"></i>User Manager</button>
                                    <!--active--> 
                                    <button class="nav-link songM" id="v-pills-songM-tab" data-bs-toggle="tab" data-bs-target="#v-pills-songM" type="button" role="tab"  aria-selected="false"><i class="fas fa-music"></i>Song Manager</button>
                                    <button class="nav-link genreM" id="v-pills-genreM-tab" data-bs-toggle="tab" data-bs-target="#v-pills-genreM" type="button" role="tab"  aria-selected="false"><i class="fas fa-list-ul"></i>Genre Manager</button>
                                    <button class="nav-link artM" id="v-pills-artistM-tab" data-bs-toggle="tab" data-bs-target="#v-pills-artistM" type="button" role="tab"  aria-selected="false"><i class="fas fa-guitar"></i>Artist Manager</button>
                                    <button class="nav-link albM" id="v-pills-albumM-tab" data-bs-toggle="tab" data-bs-target="#v-pills-albumM" type="button" role="tab"  aria-selected="false"><i class="fas fa-compact-disc"></i>Album Manager</button>
                                </c:if>
                            </div>
                            <div class="tab-content" id="v-pills-tabContent">

                                <c:if test="${sessionScope.acc.isUser == 1}">
                                    <!--tab profile-->
                                    <div class="tab-pane fade tab-panel profileP" id="v-pills-profile" role="tabpanel" > <!--show active-->
                                        <div class="tab-page">
                                            <div class="block-space"></div>
                                            <div class="img">
                                                <img src="${uimg}" alt=""/>
                                            </div>
                                            <div class="block-space"></div>
                                        </div>
                                        <form action="verification" method="post" class="tab-form profile-form">
                                            <div class="profileName tab-container">
                                                <h5>UPDATE YOUR PROFILE</h5><hr/>
                                                <div class="tab-input-content">
                                                    <h6>PROFILE IMAGE</h6>
                                                    <!--<input class="tab-img" type="file" name="img" accept="image/x-png,image/gif,image/jpeg" />-->
                                                    <input name="proImg" class="tab-input" type="text" value="${pro.UImg_path}" placeholder="${pro.UImg_path}"/>
                                                </div>
                                                <div class="tab-input-content">
                                                    <h6>PROFILE NAME</h6>
                                                    <input name="proName" class="tab-input" type="text" value="${pro.name}" placeholder="${pro.name}" />
                                                </div>
                                                <div class="tab-input-content">
                                                    <h6>PROFILE Mail</h6>
                                                    <input name="proMail" class="tab-input" type="email" placeholder="${pro.email}"  />
                                                </div>
                                                <div class="tab-input-content">
                                                    <h6>PROFILE Passwords</h6>
                                                    <input name="proPass" class="tab-input" type="password" value="${pro.pass}" placeholder="${pro.pass}" required />
                                                </div>
                                                <div class="tab-input-content">
                                                    <h6>RE-Passwords</h6>
                                                    <input name="rePass" class="tab-input" type="password" required />
                                                </div>
                                            </div>
                                            <center><input class="tab-submit" type="submit" value="Change Profile"></center>
                                        </form>
                                    </div>
                                </c:if>

                                <c:if test="${sessionScope.acc.isUser == 1 or sessionScope.acc.isAdmin == 1}">
                                    <div class="tab-pane fade tab-panel badgeP" id="v-pills-badge" role="tabpanel" >
                                        Hello Badge
                                    </div>
                                    <div class="tab-pane fade tab-panel favoriteP" id="v-pills-favorite" role="tabpanel" >
                                        <div class="tab-Manager">
                                            <%@include file="../sourcesManager/favoriteM.jsp" %>
                                        </div>
                                    </div>
                                </c:if>

                                <c:if test="${sessionScope.acc.isAdmin == 1}">

                                    <div class="tab-pane fade tab-panel userP" id="v-pills-userM" role="tabpanel" >
                                        <div class="tab-Manager">
                                            <%@include file="../sourcesManager/userM.jsp" %>
                                        </div>
                                    </div>
                                    <div class="tab-pane fade tab-panel songP" id="v-pills-songM" role="tabpanel">
                                        <div class="tab-Manager">
                                            <%@include file="../sourcesManager/songM.jsp" %>
                                        </div>
                                    </div>
                                    <div class="tab-pane fade tab-panel genreP" id="v-pills-genreM" role="tabpanel" >
                                        <div class="tab-Manager">
                                            <%@include file="../sourcesManager/genreM.jsp" %>
                                        </div>
                                    </div>
                                    <div class="tab-pane fade tab-panel artP" id="v-pills-artistM" role="tabpanel" >
                                        <div class="tab-Manager">
                                            <%@include file="../sourcesManager/artistM.jsp" %>
                                        </div>
                                    </div>
                                    <div class="tab-pane fade tab-panel albP" id="v-pills-albumM" role="tabpanel" >
                                        <div class="tab-Manager">
                                            <%@include file="../sourcesManager/albumM.jsp" %>
                                        </div>
                                    </div>
                                </c:if>



                            </div>
                        </div>
                    </div>
                </div>
            </div>       
        </div>
        <!--        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" 
                integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" 
                crossorigin="anonymous"></script>-->
    </body>
    <script>
        var checkPass = '${warningPass}';
        if (checkPass === '1') {
            alert("Both repass and mail enter invalid!!");
        } else if (checkPass === '2') {
            alert("Your repass does not similar!!");
        } else if (checkPass === '3') {
            alert("Mail enter already exist!!");
        } else if (checkPass === '4') {
            alert("Codes you enter does not valid!!");
        } else if (checkPass === '5') {
            alert("Your information was changed!! Please check!!");
        }



        var checkCC = '${tagT}';
        if (checkCC === '1') {
//            profile show
            var element = document.querySelector(".profileM");
            var elementPa = document.querySelector(".profileP");
            element.classList.add("active");
            elementPa.classList.add("active");
            elementPa.classList.add("show");
        } else if (checkCC === '2') {
//            badge show
            var element = document.querySelector(".badgeM");
            var elementPa = document.querySelector(".badgeP");
            element.classList.add("active");
            elementPa.classList.add("active");
            elementPa.classList.add("show");
        } else if (checkCC === '3') {
//            favor show
            var element = document.querySelector(".favoriteM");
            var elementPa = document.querySelector(".favoriteP");
            element.classList.add("active");
            elementPa.classList.add("active");
            elementPa.classList.add("show");
        } else if (checkCC === '4') {
//            user show
            var element = document.querySelector(".userM");
            var elementPa = document.querySelector(".userP");
            element.classList.add("active");
            elementPa.classList.add("active");
            elementPa.classList.add("show");
        } else if (checkCC === '5') {
//            song show
            var element = document.querySelector(".songM");
            var elementPa = document.querySelector(".songP");
            element.classList.add("active");
            elementPa.classList.add("active");
            elementPa.classList.add("show");
        } else if (checkCC === '6') {
//            genre show
            var element = document.querySelector(".genreM");
            var elementPa = document.querySelector(".genreP");
            element.classList.add("active");
            elementPa.classList.add("active");
            elementPa.classList.add("show");;
        } else if (checkCC === '7') {
//            art show
            var element = document.querySelector(".artM");
            var elementPa = document.querySelector(".artP");
            element.classList.add("active");
            elementPa.classList.add("active");
            elementPa.classList.add("show");
        } else if (checkCC === '8') {
//            alb show
            var element = document.querySelector(".albM");
            var elementPa = document.querySelector(".albP");
            element.classList.add("active");
            elementPa.classList.add("active");
            elementPa.classList.add("show");
        }
    </script>

</html>