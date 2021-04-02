<%-- 
    Document   : header
    Created on : Feb 7, 2021, 4:34:53 PM
    Author     : Ryuu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- require meta tag -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- title -->
        <title>Index header</title>
        <!-- bootstrap css -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" 
              integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" 
              crossorigin="anonymous">
        <!-- css -->
        <link href="css/cssIndex/headerIndex.css" rel="stylesheet" type="text/css"/>
        <!--js-->
        <script src="https://www.google.com/recaptcha/api.js" async defer></script> 

        <style>
            .rc-anchor-normal{
                background: #000 !important; 
                color: #000 !important; 
            }
            .g-recaptcha {
                transform:scale(1.1);
                -webkit-transform:scale(1.1);
                transform-origin:0 0;
                -webkit-transform-origin:0 0;
            }
        </style>
    </head>
    <body>

        <header>
            <!-- navbar bootstrap -->
            <nav class="navbar navbar-expand-lg navbar-dark fixed-top">
                <div class="container-fluid" id="navbar-container">
                    <p class="navbar-brand" href="#" >
                        <img src="images/logo/black_logo.png" width="10px" alt="logo">
                    </p>
                    <!-- button -->
                    <button class="navbar-toggler " type="button" 
                            data-bs-toggle="collapse" 
                            data-bs-target="#navbarSupportedContent" 
                            aria-controls="navbarSupportedContent" 
                            aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>

                    <!-- content -->
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link" aria-current="page" href="#section">Home</a>
                            </li>
                            <!-- navbar login -->
                            <li class="nav-item">
                                <!-- active if need -->
                                <a class="nav-link" onclick="togglePopup()" 
                                   class="first-button"
                                   href="#" aria-disabled="true">Login</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#aboutU">About</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#contactU" aria-disabled="true">Contact</a>
                            </li>

                        </ul>
                    </div>
                </div>
            </nav>
        </header>


        <!--login form-->
        <div class="popup" id="popup-1">
            <div class="wrapper">
                <div class="close-btn" onclick="togglePopup()">
                    ×</div>
                <div class="title-text">
                    <div class="title title-login">
                    </div>
                    <div class="title title-signup">
                    </div>
                </div>

                <div class="form-container">

                    <div class="slide-controls">
                        <input type="radio" name="slider" id="login" checked/>
                        <input type="radio" name="slider" id="signup"/>
                        <label for="login" class="slide login">Login</label>
                        <label for="signup" class="slide signup">Signup</label>
                        <div class="slide-tab"></div>
                    </div>

                    <div class="form-inner">
                        <!-- form login -->
                        <form action="login" class="login" method="post">
                            <div class="wrong-pass">
                                <p class="wrong-title">${mess}</p>
                            </div>
                            <div class="field field-input">
                                <input name="user" type="email" placeholder="Email" required/>
                            </div>
                            <div class="field field-input">
                                <input id ="passwords" name="pass" type="password" placeholder="Passwords" required/>
                            </div>
                            <div class="show-pass">
                                <input type="checkbox" onclick="checkPass()">
                                <label>Show Passwords</label>
                            </div>
                            <div class="block-space"></div>

                            <div class="pass-link" hidden="">
                                <a href="#" alt="#" class="">Forgot password?</a>
                            </div>

                            <!--captcha here-->
                            <div class="g-recaptcha" data-sitekey="6Lern4AaAAAAAHcDkthqGVzuJ24Qq6_WIGhFSAyn"
                                 data-theme ="dark" data-size ="normal"
                                 ></div>
                            <div class="field field-submit">
                                <a href="#"><input type="submit" value="Login"/></a>
                            </div>

                            <div class="signup-link">
                                <span>Not a member?</span>&nbsp<a href="#" alt="#" class="">Signup Now</a>
                            </div>
                            <div class="guess-link">
                                <span>Join with guest account</span>&nbsp
                                <a href="home" alt="guess" class="">GUEST NOW!</a>
                            </div>
                        </form>

                        <!-- form sign up -->
                        <form action="signup" class="signup" method="post">
                            <div class="wrong-repass">
                                <p class="wrong-title">${remess}</p>
                            </div>
                            <div class="field field-input">
                                <input name="user" type="email" placeholder="Email" required/>
                            </div>
                            <div class="field field-input">
                                <input name="pass" type="password" placeholder="Passwords" required/>
                            </div>
                            <div class="field field-input">
                                <input name="repass" type="password" placeholder="Confirm passwords" required/>
                            </div>
                            <div class="block-space"></div>
                            <div class="g-recaptcha" data-sitekey="6Lern4AaAAAAAHcDkthqGVzuJ24Qq6_WIGhFSAyn"
                                 data-theme ="dark" data-size ="normal"
                                 ></div>
                            <div class="field field-submit">
                                <a href="#"><input type="submit" value="Signup"/></a>
                            </div>
                        </form>

                    </div>
                </div>
            </div>
        </div>



        <script>
            function togglePopup() {
                document.getElementById("popup-1")
                        .classList.toggle("active");
            }

//            form login
            const loginText = document.querySelector(".title-text .login");
            const loginForm = document.querySelector("form.login");
            const loginBtn = document.querySelector("label.login");
            const signupBtn = document.querySelector("label.signup");
            const signupLink = document.querySelector("form .signup-link a");
            signupBtn.onclick = (() => {
                loginForm.style.marginLeft = "-50%";
                loginText.style.marginLeft = "-50%";
            });
            loginBtn.onclick = (() => {
                loginForm.style.marginLeft = "0%";
                loginText.style.marginLeft = "0%";
            });
            signupLink.onclick = (() => {
                signupBtn.click();
                return false;
            });

            //scroll down js
            window.addEventListener("scroll", function () {
                var header = document.querySelector("header");
                header.classList.toggle("sticky", window.scrollY > 0);
            });

            //show passwords
            function checkPass() {
                var pass = document.getElementById("passwords");
                if (pass.type === "password") {
                    pass.type = "text";
                } else {
                    pass.type = "password";
                }
            }


           
        </script>


        <!-- bootstrap js -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" 
                integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" 
        crossorigin="anonymous"></script>
    </body>
</html>