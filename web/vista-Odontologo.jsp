<%@page import="Logica.Odontologo"%>
<%@page import="Logica.Paciente"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Turno"%>
<%@page import="Logica.Usuario"%>
<%@include file="pantilla/documento-apertura.jsp"%>
<jsp:include page="pantilla/barra-top.jsp"/> 
<jsp:include page="pantilla/barra-lado.jsp"/> 
<br>
<br>
<br>
<br>
<div class="conteiner text-center">
    <div >
        <img src="assets/img/bienvenida.png">
    </div>
    <div>
        <div class="col-md-3">
        </div>
        <div class="col-md-6">
            <div class=" tex-center panel panel-default">
                <div class="panel-heading text-center">
                    Registo de Odontologos
                </div>
                <div class="panel-body">
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover" id="tablaTurnos">
                            <thead>
                                <tr>
                                    <th>Nombre</th>
                                    <th>Apellido</th>
                                    <th>fec. Nacimiento</th>
                                    <th>Especialida</th>
                                    <th>Horario llegada</th>
                                    <th>Horario Salida</th>
                                    <th></th>
                                </tr>
                            </thead>

                            <tbody>
                                <tr>
                                    <%  
                                        Clinica ctr = (Clinica) sesionActual.getAttribute("ctr");
                                        List<Odontologo> listaOdontologo = ctr.traerOdontologo();
                                        for (Odontologo odon : listaOdontologo) {
                                    %>
                                    <td><%=odon.getNombre()%></td>
                                    <td><%=odon.getApellido()%></td>
                                    <td><%=odon.getEdad()%></td>
                                    <td><%=odon.getEspecialidad()%></td>
                                    <td><%=odon.getHorarioinicioTrabajo() %></td>
                                    <td><%=odon.getHorarioFinTrabajo()%></td>
                                </tr>
                                <% }%>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="pantilla/documento-cierre.jsp"%>