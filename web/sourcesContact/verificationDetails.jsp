<%-- 
    Document   : verificationDetails
    Created on : Mar 24, 2021, 9:16:38 PM
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
                        <p class="altitle">Enter&nbsp;Code</p>
                    </div>
                </div>

                <!--contact note-->
                <div class="contact-container verification">
                    <div class="form">
                        <div class="contact-info">
                            <h3 class="title">Please check mail!!</h3>
                            <p class="text">We already send mail to you!! Please enter code or check your mail again!!</p>
                            <div class="contact-icon">
                                <img src="images/gif/mail_icon.gif" alt=""/>
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
                            <form action="editPro" method="post">
                                <h3 class="title">Enter code here!!</h3>
                                <div class="input-container">
                                    <input type="tel" name="inputCode" class="input" required="">
                                    <label for="">Code</label>
                                    <span>&nbsp;Code&nbsp;</span>
                                </div>
                                <input type="submit" value="Change Profile" class="btn">
                            </form>
                        </div>
                    </div>
                </div>
            </div>       
        </div>

        <script src="js/scripts.js" type="text/javascript"></script>
    </body>
</html>