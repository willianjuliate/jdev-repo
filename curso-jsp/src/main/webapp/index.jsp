<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">        
        <link rel="stylesheet" href="www/css/style.css"/>
        <title>Document</title>       
    </head>
    <body>        
        <!-- you can substitue the span of reauth email for a input with the email and
    include the remember me checkbox-->
        <div class="container">           
            <div class="card card-container">
                <img id="profile-img" class="profile-img-card" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
                <p id="profile-name" class="profile-name-card"></p>
                <form class="form-signin" action="dashboard" method="post">        
                    <input type="hidden" value="<%= request.getParameter("url") %>" name="url">
                    <span id="reauth-email" class="reauth-email"></span>
                    <input type="text" id="nome" class="form-control" placeholder="Login" required autofocus name="login">
                    <input type="password" id="senha" class="form-control" placeholder="Senha" required name="senha">
                    <div id="remember" class="checkbox">
                        <label>
                            <input type="checkbox" value="remember-me"> Lembre-se de mim
                        </label>
                    </div>
                    <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Entrar</button>
                </form><!-- /form -->
                <a href="#" class="forgot-password">
                    Esqueceu a senha?
                </a><br/><br/>
                <span style="color: red">${msg}</span>
            </div><!-- /card-container -->
        </div><!-- /container -->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <script src="www/js/script.js"></script>
    </body>
</html>