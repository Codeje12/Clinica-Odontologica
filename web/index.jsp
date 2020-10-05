<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Iniciar sesion</title>
        <!-- Core CSS - Include with every page -->
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
                            
                            
                            <form action="servletsLogin" role="form" class="login-form" method="POST">
                                <p class="title-login text-center">Iniciar Sesion</p>
                                <p>
                                    <select class="select-login" name="usuario" >
                                        <option value="">Seleccionar usuario</option>
                                        <option value="Odontologo">Odont�logo</option>
                                        <option value="Secretaria">Secretaria</option>
                                    </select>
                                </p>    
                                <p><input name="password" class="input-password text-center" type="password" placeholder="Password"/></p>
                                <p><input type="submit" class="btn-ingreso" value="Ingresar"></p>
                            </form>
                            
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Core Scripts - Include with every page -->
        <script src="assets/plugins/jquery-1.10.2.js"></script>
        <script src="assets/plugins/bootstrap/bootstrap.min.js"></script>
        <script src="assets/plugins/metisMenu/jquery.metisMenu.js"></script>

    </body>

</html>
