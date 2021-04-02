<%-- 
    Document   : body
    Created on : Feb 7, 2021, 7:33:26 PM
    Author     : Ryuu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index Body</title>

        <!-- css -->
        <link href="css/cssIndex/bodyIndex.css" rel="stylesheet" type="text/css"/>

        <!--bootstrap-->         
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet">

    </head>
    <body>
        <!--about us-->
        <div class="aboutus py-5">
            <div class="row align-items-center container my-5 mx-auto pt-5" id="aboutU">
                <div class="text col-lg-6 col-md-6 col-12 pt-5" >
                    <h6>ABOUT US UTA95S</h6>
                    <h2>Music Library with high audio bitrate and audio quality</h2>
                    <p> We're uta95s, a small team with a dream to bring 
                        Japanese songs to become the most popular in the world including anime songs, 
                        japan single music, japan drama music. <span id="dots">...</span>
                        <span id="more">Also we are merely functioning as an index of content 
                            found publicly on the Internet and does not accept responsibility 
                            for content hosted on third-party websites.</span>
                    </p>
                    <a class="more" onclick="myReadmore()" id="myBtn" >Read More</a>
                </div>
                <div class="img col-lg-6 col-md-6 col-12 pt-5">
                    <img class="img-fluid" src="images/bg/neon_circle.png" alt=""/>
                </div>
            </div>
        </div>

        <!--discovery-->
        <div class="discovery py-5" id="disC">
            <div class="row align-items-center container mx-auto">
                <div class="image col-lg-6 col-md-6 col-12">
                    <div class="column">
                        <img class="img-fluid right" src="images/gif/chara/midoriya1_middle.gif" alt=""/>
                    </div>
                    <span>0</span>
                    <div class="column">
                        <img class="img-fluid left" src="images/gif/chara/midoriya_2_left.gif" alt=""/>
                    </div>
                </div>
                <div class="text col-lg-6 col-md-6 col-12 pt-2" >
                    <h6>Music Library</h6>
                    <h2>Music Library with many categories and multi download platform</h2>
                    <p>Our website is a music library with many categories and also we have a music player that let's you guys enjoy music. 
                        <span id="dots2">...</span>
                        <span id="more2">
                            If you make an account you can easily have your own favorites song list but in our opinion, 
                            we suggest you guys buy songs, albums, single on amazon, iTunes, cdjapan,... 
                            to SUPPORT the artists. Regards</span>
                    </p>
                    <a class="more" onclick="myReadmore2()" id="myBtn2">Read More</a>
                </div>
            </div>
        </div>
        
        
        
        
        <%@include file="articleIndex.jsp" %>

        <!--admin-->
        <div class="all-admin py-5" id="adminU">
            <div class="title-admin">
                <a href="" class="adminU">Our&nbspAdmin</a>
            </div>

            <div class="admin">
                <div class="admin-container">
                    <!--box 1-->
                    <div class="admin-box">
                        <div class="admin-content">
                            <img src="images/others/img.png" alt="" class="quotes"/>
                            <p>Lorem ipsum dolor sit amet, 
                                consectetur adipiscing elit, 
                                sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
                                Ut enim ad minim veniam
                            </p>
                            <img src="images/admin/admin.png" alt="" class="admin1 admin-img"/>
                            <h3>LU CHAI</h3>
                        </div>
                    </div>
                    <!--box 2-->
                    <div class="admin-box">
                        <div class="admin-content">
                            <img src="images/others/img.png" alt="" class="quotes"/>
                            <p>Lorem ipsum dolor sit amet, 
                                consectetur adipiscing elit, 
                                sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
                                Ut enim ad minim veniam</p>
                            <img src="images/admin/admin2.png" alt="" class="admin2 admin-img"/>
                            <h3>J-Phonebot</h3>
                        </div>
                    </div>
                    <!--box 3-->
                    <div class="admin-box">
                        <div class="admin-content">
                            <img src="images/others/img.png" alt="" class="quotes"/>
                            <p>Lorem ipsum dolor sit amet, 
                                consectetur adipiscing elit, 
                                sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
                                Ut enim ad minim veniam</p>
                            <img src="images/admin/admin3.png" alt="" class="admin3 admin-img"/>
                            <h3>C-Nature</h3>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <script>
            function myReadmore() {
                var dots = document.getElementById("dots");
                var moreText = document.getElementById("more");
                var btnText = document.getElementById("myBtn");

                if (dots.style.display === "none") {
                    dots.style.display = "inline";
                    btnText.innerHTML = "Read More";
                    moreText.style.display = "none";
                } else {
                    dots.style.display = "none";
                    btnText.innerHTML = "Read Less";
                    moreText.style.display = "inline";
                }
            }
            function myReadmore2() {
                var dots2 = document.getElementById("dots2");
                var moreText2 = document.getElementById("more2");
                var btnText2 = document.getElementById("myBtn2");

                if (dots2.style.display === "none") {
                    dots2.style.display = "inline";
                    btnText2.innerHTML = "Read More";
                    moreText2.style.display = "none";
                } else {
                    dots2.style.display = "none";
                    btnText2.innerHTML = "Read Less";
                    moreText2.style.display = "inline";
                }
            }
        </script>






    </body>
</html>
