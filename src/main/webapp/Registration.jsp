<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<link rel="stylesheet" href="Registration.css">
</head>
<body>

<section class="container">
        <div class="form login">
            <div class="form-content">
                <header>Registration</header>
 <form action="add" method="Post">
                    <div class="field input-field">
                        <input type="text" name="username" placeholder="Username" class="input">
                    </div>
                    <div class="field input-field">
                        <input type="email" name="email" placeholder="Email" class="input">
                    </div>
                    <div class="field input-field">
                        <input type="password" name="password" placeholder="Password" class="password">
                    </div>
                    <div class="check-box">
                        <input type="checkbox" class="checksquare">
                        <label class="terms">I accept the <a href="#">Terms & Conditions</a></label>
                    </div>

                    <div class="field button-field">
                        <button>Register</button>
                    </div>
               

                    
</form>
                <div class="form-link">
                    <span>Already have an account? <a href="login.jsp" class="signup-link">Login Here</a>
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
<script>
    // JavaScript code to show registration success message
    const urlParams = new URLSearchParams(window.location.search);

    if (urlParams.has("registrationSuccess")) {
        const registrationSuccessMessage = document.getElementById("registrationSuccessMessage");
        registrationSuccessMessage.style.display = "block";
    }
</script>



</body>
</html>