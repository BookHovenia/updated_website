<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
 <link rel="stylesheet" href="login.css">
</head>
<body>
<section class="container">
        <div class="form login">
            <div class="form-content">
                <header>Login</header>
                <form action="login" method="post">
                    <div class="field input-field">
                        <input type="email" placeholder="Enter your email" class="input" name="email">
                    </div>
                    <div class="field input-field">
                        <input type="password" placeholder="Enter your password" class="password" name="password">
                        <i class='bx bxs-hide eye-icon'></i>
                    </div>
                    <div class="form-link">
                        <a href="#" class="forgot-pass">Forgot password?</a>
                    </div>
                    <div class="field button-field">
                        <button>Login</button>
                    </div>

                </form>
                <div class="form-link">
                    <span>Don't have an account? <a href="Registration.jsp" class="signup-link">Register</a>
                    </span>
                </div>
            </div>

            <div class="line"></div>

            <div class="media-options">
                <a href="#" class="field facebook">
                    <img src="facebook.png" alt="" class="facebook-img">
                    <span>Login with Facebook</span>
                </a>
            </div>
            <div class="media-options">
                <a href="#" class="field google">
                    <img src="google.png" alt="" class="google-img">
                    <span>Login with Google</span>
                </a>
            </div>
        </div>
    </section>

</body>
</html>