<%@page import="Logica.Clinica"%>
<div id="wrapper">
<!-- navbar top -->
        <nav class="navbar navbar-default navbar-fixed-top" role="navigation" id="navbar">
            <!-- navbar-header -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="inicio.jsp">
                    <img src="assets/img/logo.png">
                </a>
            </div>

            <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-toggle-down fa-2x"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href=
                            <%
                                if(request.getSession().getAttribute("usuario").equals("secretaria")){
                            %>"carga-Secretarias.jsp"><%}
                                else{%> "pagina-Proceso.jsp" <%}%>
                               <i class="fa fa-user fa-fw"></i><%=request.getSession().getAttribute("usuario")%></a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i>Configuracion</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="index.jsp"><i class="fa fa-sign-out fa-fw"></i>Salir</a>
                        </li>
                    </ul>
                </li>
            </ul>
        </nav>
 
