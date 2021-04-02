<%-- 
    Document   : body
    Created on : Feb 8, 2021, 3:33:26 AM
    Author     : Ryuu
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Index article</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
        <!-- Swiper css -->
        <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css">

        <!-- Demo styles -->
        <link href="css/cssIndex/articleIndex.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="swipper-article py-5 ">
            <div class="title-swipper">
                <a href="#" class="latestU">Latest&nbspUpdate</a>
            </div>
            <div class="swiper-container pd-5">
                <div class="swiper-wrapper ">
                    <c:forEach items="${latestSong}" var="late">
                        <div class="swiper-slide">
                            <a><img src="<c:out value="${late.AImg_path}"/>" alt=""/></a>
                        </div>
                    </c:forEach>
                </div>
                <!-- Add Pagination Here -->
                <!-- <div class="swiper-pagination"></div>-->
                <div class="swiper-button-next button"></div>
                <div class="swiper-button-prev button"></div>
            </div>
        </div>




        <!-- Swiper JS -->
        <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
        <script>
            var swiper = new Swiper('.swiper-container', {
                effect: 'coverflow',
                grabCursor: true,
                centeredSlides: true,
                slidesPerView: 'auto',
                coverflowEffect: {
                    rotate: 20,
                    stretch: 0,
                    depth: 200,
                    modifier: 1,
                    slideShadows: true
                },
                loop: true,
                autoplay: {
                    delay: 2500,
                    disableOnInteraction: false
                },
                navigation: {
                    nextEl: '.swiper-button-next',
                    prevEl: '.swiper-button-prev'
                },
                mousewheel: {
                    invert: true
                }
                //                pagination: {
                //                    el: '.swiper-pagination'  //indicators
                //                }
            });
        </script>
    </body>

</html>