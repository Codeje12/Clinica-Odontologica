<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Iniciar sesion</title>
        <link href="assets/plugins/bootstrap/bootstrap.css" rel="stylesheet" />
        <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        <link href="assets/plugins/pace/pace-theme-big-counter.css" rel="stylesheet" />
        <link href="assets/css/style.css" rel="stylesheet" />
        <link href="assets/css/main-style.css" rel="stylesheet" />
    </head>
    <body class="body-Login-back">
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-md-offset-4 text-center logo-margin ">
                </div>
                <div class="col-md-4 col-md-offset-4">
                    <div class="login-panel panel panel-default">                  
                        <div class="panel-heading">
                            <h3 class="panel-title text-center">cuenta</h3>
                        </div>
                        <div class="panel-body">
                            <form action="recuperar-Password-Exitoso.jsp" role="form" class="login-form" method="POST">
                                <p class="title-login text-center">Recuperar Contraseña</p>
                                <p>
                                <p><input class="input-password" type="text" name="nombre" placeholder="Nombre " ></p>
                                <p><input class="input-password" type="text" name="apellido" placeholder="Apellido"></p>
                                <p><input class="input-password" type="email" name="email" placeholder="email"></p>
                                <p><input class="input-password" type="text" name="direcion" placeholder="Direccion"></p>
                                <button class="btn-ingreso" >enviar</button>
                            </form>
                            <div class="text-center">
                                <h5><a href="index.jsp">Volver</a></h5>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="assets/plugins/jquery-1.10.2.js"></script>
        <script src="assets/plugins/bootstrap/bootstrap.min.js"></script>
        <script src="assets/plugins/metisMenu/jquery.metisMenu.js"></script>
    </body>
</html>
