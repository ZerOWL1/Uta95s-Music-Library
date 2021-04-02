<%-- 
    Document   : homeDetails
    Created on : Feb 18, 2021, 9:13:14 PM
    Author     : Ryuu
--%>

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
        <link href="css/cssContact/contactDetails.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="left">
            <div class="lateCD">
                <div class="lateCD-title">
                    <div class="cd-container">
                        <p class="altitle">Contact&nbsp;Us</p>
                    </div>
                </div>

                <!--contact note-->
                <div class="contact-container">
                    <div class="form">
                        <div class="contact-info">
                            <h3 class="title">Let's get in touch</h3>
                            <p class="text">We are merely functioning as an index of content found publicly on the 
                                Internet and does not accept responsibility for content hosted on third-party websites. 
                                All trademarks, logos, and images are the property of their respective and rightful owners.
                            </p>
                            <div class="contact-icon">
                                <img src="images/gif/contact.gif" alt=""/>
                            </div>
                            <div class="social-media">
                                <p>Connect with us :</p>
                                <div class="social-icons">
                                    <a href="#">
                                        <i class="fas fa-envelope"></i>
                                    </a>
                                    <a href="https://www.facebook.com/groups/uta95s">
                                        <i class="fab fa-facebook-f"></i>
                                    </a>
                                    <a href="#">
                                        <i class="fab fa-twitter"></i>
                                    </a>
                                    <a href="https://discord.gg/vbtRkSn">
                                        <i class="fab fa-discord"></i>
                                    </a>
                                </div>
                            </div>
                        </div>
                        <div class="contact-form">
                            <span class="circle one"></span>
                            <span class="circle two"></span>
                            <!--contact mail api-->
                            <form action="https://formspree.io/f/xoqpgvvy" method="post">
                                <h3 class="title">Contact us</h3>
                                <div class="input-container">
                                    <input type="text" name="name" class="input" required="">
                                    <label for="">Username</label>
                                    <span>&nbsp;Username&nbsp;</span>
                                </div>
                                <div class="input-container">
                                    <input type="email" name="email" class="input" required="">
                                    <label for="">Email</label>
                                    <span>&nbsp;Email&nbsp;</span>
                                </div>
                                <div class="input-container">
                                    <input type="tel" name="phone" class="input">
                                    <label for="">Phone</label>
                                    <span>&nbsp;Phone&nbsp;</span>
                                </div>
                                <div class="input-container textarea">
                                    <textarea name="message" class="input" required=""></textarea>
                                    <label for="">Message</label>
                                    <span>&nbsp;Message&nbsp;</span>
                                </div>
                                <input type="submit" value="Send" class="btn">
                            </form>
                        </div>
                    </div>
                </div>
            </div>       
        </div>

        <script src="js/scripts.js" type="text/javascript"></script>
    </body>
</html>