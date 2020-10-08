<%@page import="Logica.Clinica"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Clinica</title>
        <!-- Core CSS - Include with every page -->
        <link href="assets/plugins/bootstrap/bootstrap.css" rel="stylesheet" />
        <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        <link href="assets/plugins/pace/pace-theme-big-counter.css" rel="stylesheet" />
        <link href="assets/css/style.css" rel="stylesheet" />
        <link href="assets/css/main-style.css" rel="stylesheet" />
        <script src="assets/scripts/controles-campos.js"></script>
        <script src="assets/scripts/jquery.js"></script>
        <!-- Page-Level CSS -->
        <link href="assets/plugins/morris/morris-0.4.3.min.css" rel="stylesheet" />
    </head>
    <body>
        <%
            //Creo la variable sesionActual y le asigno la sesion actual
            HttpSession sesionActual = request.getSession();
            //aca consulto si existe un usuario en la sesion actual para guardar en la variable
            String user  = (String) request.getSession().getAttribute("usuario");
            //redirecciono a la pagina de error si no inicio sesion o le doy los permisos
            if(user == null){
                response.sendRedirect("error-Login.jsp");
            }else{
                Clinica ctr = new Clinica();
                sesionActual.setAttribute("ctr",ctr);
            }
        %>