<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Authentification</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
    <link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="assets/fonts/fontawesome5-overrides.min.css">
    <link rel="stylesheet" href="assets/css/-Login-form-Page-BS4-.css">
</head>

<body>
    <div class="container-fluid" style="padding: 0;">
        <div class="row mh-100vh" style="margin: 0;">
            <div class="col-10 col-sm-8 col-md-6 col-lg-6 offset-1 offset-sm-2 offset-md-3 offset-lg-0 align-self-center d-lg-flex align-items-lg-center align-self-lg-stretch bg-white p-5 rounded rounded-lg-0 my-5 my-lg-0" id="login-block">
                <div class="m-auto w-lg-75 w-xl-50">
                    <h2 class="font-weight-light mb-5" style="color: rgb(0,101,46);"><i class="fa fa-recycle" style="color: rgb(0,101,46);font-size: 39px;"></i>&nbsp;<strong>Poubelle Connectee</strong></h2>
                    <form action="login" method="post">
                    	<c:if test="${erreur==true}">  
                        	<div  class="alert alert-danger">
                        		<p> 
                        			<c:out value="Mauvais identifiant / mot de passe. "/>
								</p>
                        	</div>
                        </c:if> 
                        <div class="form-group"><label class="text-secondary">Email ou username</label><input class="form-control" type="text" id="log_username" required="" name="log_username"></div>
                        <div class="form-group"><label class="text-secondary">Password</label><input class="form-control" type="password" id="log_password" required="" name="log_password"></div>
                        <input id="login-button" value="Login" class="btn btn-info mt-2" type="submit" style="color: rgb(251,243,228);background-color: rgb(0,101,46);">
                     </form>
                </div>
            </div>
            <div class="col-lg-6 d-flex align-items-end" id="bg-block" style="background-image:url(&quot;assets/img/aldain-austria-316143-unsplash.jpg&quot;);background-size:cover;background-position:center center;">
                <p class="ml-auto small text-dark mb-2"><br></p>
            </div>
        </div>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.js"></script>
    <script src="assets/js/image.js"></script>
    <script src="assets/js/request.js"></script>
    <script src="assets/js/theme.js"></script>
</body>

</html>